package calculadora;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("--------- | Calculadorasimples | --------- ");
		System.out.println("");

		System.out.println("Informe o primeiro valor: ");
		double A = scanner.nextInt();

		System.out.println("Informe o segundo valor: ");
		double B = scanner.nextInt();

		System.out.println("[1] - Adição \n[2] - Subtração \n[3] - Multiplicação \n[4] - Divisão \n[0] - Sair.");
		System.out.println("Digite qual operação deseja realizar: ");
		int operacao = scanner.nextInt();

		double resultado = 0;

		switch (operacao) {

		case 1:
			resultado = A + B;

			break;
		case 2:
			resultado = A - B;

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