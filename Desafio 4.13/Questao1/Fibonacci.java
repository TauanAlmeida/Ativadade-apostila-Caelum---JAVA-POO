class Fibonacci {
		int resultado;
		int first = 0;
		int second = 1;
		
int calcularFibonacci(int numero){
	this.resultado = this.first + this.second;
	this.first = this.second;
	this.second = this.resultado;
	if (numero <= 2){
		return this.resultado;
	}
	return calcularFibonacci(numero - 1);
	}
}