package calculadora;

import java.util.Scanner;

import exceptions.DivisionByZeroException;

public class App {
	
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println("SOMA:");
		System.out.println(" ");
		calculadora.somaInt(5, 0);
		calculadora.somaFloat(5.1,2.2);
		System.out.println("SOMA:");
		System.out.println(" ");
		
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			System.out.println("--------- | Calculadorasimples | --------- ");
			System.out.println("");


			System.out.println("[1] - Adição \n[2] - Subtração \n[3] - Multiplicação \n[4] - Divisão \n[0] - Sair.");
			System.out.println("Digite qual operação deseja realizar: ");
			int operacao = scanner.nextInt();

			double resultado = 0;

			switch (operacao) {

			case 1:
			
				System.out.println("[1] - Soma de inteiros \n[2] - Soma geral");
				int operacao = scanner.nextInt();
				
				if (operacao == 1) {
					
					System.out.println("Informe o primeiro valor: ");
					int A = scanner.nextInt();

					System.out.println("Informe o segundo valor: ");
					int B = scanner.nextInt();
					
					calculadora.subtrair(A, B);
				} else if(operacao == 2) {
					
					System.out.println("Informe o primeiro valor: ");
					float A = scanner.nextDouble();

					System.out.println("Informe o segundo valor: ");
					float B = scanner.nextDouble();
					
					calculadora.subtrair(A, B);
					
				}
					
				break;
				
			case 2:
				
				System.out.println("[1] - Subtração de inteiros \n[2] - Subtração geral");
				int operacao = scanner.nextInt();
				
				if (operacao == 1) {
					
					System.out.println("Informe o primeiro valor: ");
					int A = scanner.nextInt();

					System.out.println("Informe o segundo valor: ");
					int B = scanner.nextInt();
					
					calculadora.somaInt(A, B);
				} else if(operacao == 2) {
					
					System.out.println("Informe o primeiro valor: ");
					double A = scanner.nextDouble();

					System.out.println("Informe o segundo valor: ");
					double B = scanner.nextDouble();
					
					calculadora.somaFloat(A, B);
					
				}
					
				break;

				break;
			case 3:
				resultado = A * B;

				break;
			case 4:
				if (B != 0) { // Verifica se B é diferente de 0, para realizar a divisao
					resultado = A / B;
				} else {
					System.out.println("Divisão por zero não é permitida.");
					System.exit(0);
				}
				break;
			case 0:
				System.out.println("Calculadora finalizada.");
				System.exit(0);
			default:
				System.out.println("Operação inválida ou inexistente.");
				System.exit(0);
			}

			// Verifica se o resultado é um número inteiro
			if (resultado % 1 == 0) {
				System.out.println("O valor da operação é: " + (int) resultado);
			} else {
				System.out.println("O valor da operação é: " + resultado);
			}

			scanner.close(); // Fecha o scanner.
		}
		
		

}
	
}
