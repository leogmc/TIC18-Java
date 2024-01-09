package manipulacaodetexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App2 {
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Insira o nome do arquivo: ");
		String arquivo = scanner.nextLine();
		
		arquivo = arquivo + ".txt";
		
		FileReader fr = new FileReader(arquivo);
		BufferedReader br = new BufferedReader(fr);
		
		while (br.ready()) {
			String linha = br.readLine();
			System.out.println(linha);
		}
		
		br.close();
		fr.close();
				
		scanner.close();
	}

}
