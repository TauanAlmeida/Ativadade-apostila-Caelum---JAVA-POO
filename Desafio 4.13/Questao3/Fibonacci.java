class Fibonacci {
		int resultado;
		int first = 0;
		int second = 1;

int calcularFibonacci(int numero){
	System.out.println("Numero: " +numero);
	return numero == 0 ? 0 :
		   (numero == 1 ? 1 :
		   calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2));
	}
}