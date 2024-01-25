package configuracao;

import java.io.File;
import java.util.ArrayList;

public class ListaConfiguracoes {

	public static final String CAMINHO = "." + File.separator + "arquivos" + File.separator;

	private String nomeArquivo;
	private ArrayList<Configuracao> lista;

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public ArrayList<Configuracao> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Configuracao> lista) {
		this.lista = lista;
	}

	public ListaConfiguracoes() {
		super();
		nomeArquivo = CAMINHO + "configs.json";
		lista = new ArrayList<Configuracao>();
	}

	public void novaConfiguracao(Configuracao configuracao) throws Exception {

		for(Configuracao c : lista) {
			if (c.getNome() == configuracao.getNome()) {
				Exception e = new Exception("Já existe uma configuração chamada " + configuracao.getNome());
				throw e;
			}
		}
		
		lista.add(configuracao);
		
	}

	
	
}
