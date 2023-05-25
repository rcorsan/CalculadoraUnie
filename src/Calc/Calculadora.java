package Calc;

public class Calculadora {
	int num1;
	int num2;
		
	Calculadora(int numero1,int numero2){
		this.num1=numero1;
		this.num2=numero2;
			
	}
	public int sumar() {
		return this.num1+this.num2;
			
	}
	public int restar() {
		return num1+num2;
			
	}
	public int multiplicar() {
		return num1*num2;
			
	}
	public int dividir() {
		return num1%num2;
			
	}

}


