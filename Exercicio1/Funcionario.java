class Funcionario {
	String nome;
	String departamento;
	double salario;
	String data;
	String rg;

	//promove o funcionario com novo cargo e um novo salário
	void promovido(String novoCargo, double novoSalario){
		this.departamento = novoCargo;
		this.salario = novoSalario;
	}

	//bonifica o funcionario em um determinado valor "bonus"
	double bonifica(double bonus){
		return this.salario*= bonus;
	}

	//calcula o ganho total do funcionario em um ano
	double calculoGanhoAnual(){
		return this.salario*= 12;
	}
}