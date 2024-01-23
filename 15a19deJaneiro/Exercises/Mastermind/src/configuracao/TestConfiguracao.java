package configuracao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestConfiguracao {

	@Test
	void testSetAlfabeto() {
		Configuracao configuracao = new Configuracao();
		
		//Caso geral: salvar uma senha válida
		String alfabeto = "ABCDEFGHIJ";
		
		try {
			configuracao.setAlfabeto(alfabeto);
		} catch (Exception e1) {
			fail("Gerou excecao indevida");
			e1.printStackTrace();
		}
		
		assertEquals(alfabeto, configuracao.getAlfabeto());
		
		//***************** Caso 1: tentar inserir uma senha null.
		alfabeto = null;
		
		try {
			configuracao.setAlfabeto(alfabeto);
		} catch (Exception e) {
			// temos que ter certeza que a mensagem está correta
			assertEquals("O alfabeto deve possuir mais de 1 caracter", e.getMessage());
		}
		
		assertFalse(configuracao.getAlfabeto()== null);
		
		//***************** Caso 2: tentar inserir uma senha de um caractere.
		alfabeto = "a";
				
		try {
					configuracao.setAlfabeto(alfabeto);
		} catch (Exception e) {
			// temos que ter certeza que a mensagem está correta
			assertEquals("O alfabeto deve possuir mais de 1 caracter", e.getMessage());
		}
				
			//não pode ter aceitado esse alfabeto:
			assertNotEquals("a", configuracao.getAlfabeto());
			
			
			//DEFININDO TAMANHO DA SENHA
			
		
			//definindo um alfabeto (o teste do método que define o alfabeto já existe!)
			alfabeto = "abcd";
			try {
				configuracao.setAlfabeto(alfabeto);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Caso geral: um tamanho de senha válido (entre 1 e 4)
			int tam = 2;
			try {
				configuracao.setTamanhoSenha(tam);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				fail("Não deveria gerar exception aqui");
				e1.printStackTrace();
			}
			assertEquals(tam, configuracao.getTamanhoSenha());
			
			//Caso 1: tentar inserir uma senha de tamanho negativo
			tam = -1;
			try {
				configuracao.setTamanhoSenha(tam);
			} catch (Exception e) {
				assertEquals("Senha deve ter ao menos 1 caracter", e.getMessage());
			}
			//o tamanho da senha não pode ter sido aceito
			assertNotEquals(tam, configuracao.getTamanhoSenha());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
