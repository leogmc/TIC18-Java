package user;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Usuarios usuarios = new Usuarios();
		
		//OBJETOS DE TESTE
		Usuario usuario1 = new Usuario("Leandro", "leogmcerqueira@gmail.com");
		Usuario usuario2 = new Usuario("Matheus", "matheus@gmail.com");
		Usuario usuario3 = new Usuario("Luiz", "luiz@gmail.com");
		Usuario usuario4 = new Usuario("Guilherme", "guilherme@gmail.com");
		Usuario usuario5 = new Usuario("Leonardo", "leonardo@gmail.com");
		
		int opcao;
		
		do {			
		System.out.println("X: THE NEW TWITTER - GERENCIAMENTO DE USUARIOS");
		System.out.println("----------------------------------------------");
		System.out.println("            [1] - Inserir usuario");
		System.out.println("            [2] - Buscar usuario");
		System.out.println("            [3] - Listar usuarios");
		System.out.println("            [4] - Excluir usuario");
		System.out.println("            [0] - Sair.");
		System.out.println("----------------------------------------------");
		System.out.println("            ESCOLHA UMA OPÇÃO: ");
		opcao = scanner.nextInt();
				
		switch (opcao) {
		case 1:
			usuarios.inserir(usuario1);
			usuarios.inserir(usuario2);
			usuarios.inserir(usuario3);
			usuarios.inserir(usuario4);	
			
			
			System.out.println("Tudo Ok!");
			break;
			
		case 2:
			usuarios.buscar(usuario5);
			break;
			
		case 3:
			usuarios.listar();
			break;
			
		case 4:
			usuarios.excluir(usuario1);
			break;
			
		case 0:
			System.out.println("Programa finalizado.");

		default:
			System.out.println("Opção invalida. Por favor, insira um opção correta! \n");
			break;
		}
		
		} while (opcao !=0);
	
		scanner.close();
	}

}
