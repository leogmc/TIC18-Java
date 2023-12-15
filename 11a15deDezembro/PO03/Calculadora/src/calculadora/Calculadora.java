package calculadora;

import exceptions.DivisionByZeroException;

public class Calculadora {
	
	//SOMA
	public void somaInt(int a, int b){
		
		System.out.println(a + b);
		
	}

	public void somaFloat(double a, double b) {
		
		System.out.println(a + b);
	}
	
	//SUBTRAÇÃO
	public void subtrair(int a, int b){
		
		System.out.println(a - b);
		
	}
	
	public void subtrair(float a, float b) {
		
		System.out.println(a - b);
	}
	
	//PRODUTO
	public void produtoInt(int a, int b){
		
		System.out.println(a * b);
		
	}

	public void produtoFloat(float a, float b) {
		
		System.out.println(a * b);
	}
	
	//DIVISÃO
	public void divisaoInt(int a, int b)
				throws DivisionByZeroException {
		if (b == 0) {
				throw new DivisionByZeroException(a);
		} else {
		
		System.out.println(a / b);	
	}
	}

	public void divisaoFloat(float a, float b)
				throws DivisionByZeroException {
		
		if (b == 0 || b == 0.0) {
			throw new DivisionByZeroException(a);
		} else {
		
		System.out.println(a / b);	
	}
	}
	
	
	

}
