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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
