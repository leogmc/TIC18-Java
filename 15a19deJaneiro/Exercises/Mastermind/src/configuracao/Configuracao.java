package configuracao;

public class Configuracao {
	
	private String alfabeto;
	private int tamanhoSenha;

	
	public String getAlfabeto() {
		return alfabeto;
	}

	public void setAlfabeto(String alfabeto) throws Exception {
		
		if ((alfabeto == null) || (alfabeto.length() < 2)){
			Exception e = new Exception("O alfabeto deve possuir mais de 1 caracter");
			 throw e;
		}
				
		this.alfabeto = alfabeto;
	}
	
	public int getTamanhoSenha() {
		return tamanhoSenha;
	}

	public void setTamanhoSenha(int tamanhoSenha) throws Exception {
		
		if (tamanhoSenha < 0) {
			Exception e = new Exception("Senha deve ter ao menos 1 caracter");
			throw e;
		}
					
		this.tamanhoSenha = tamanhoSenha;
	}

	
	
	
	
	
}
