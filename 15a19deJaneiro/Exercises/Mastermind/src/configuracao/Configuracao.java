package configuracao;

public class Configuracao {
	
	private String alfabeto;

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
	
	
	
}
