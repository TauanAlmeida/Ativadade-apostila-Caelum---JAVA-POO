class Funcionario {
	String nome;
	String departamento;
	double salario;
	String data;
	String rg;
	boolean estaNaEmpresa;

	//mostra todos os atributos do funcionario
	void getStatus(){
		System.out.println("Nome: " +this.nome);
		System.out.println("Departamento: " +this.departamento);
		System.out.println("Salario: " +this.salario);
		System.out.println("Data: " +this.data);
		System.out.println("RG: " +this.rg);
		System.out.println("Status: " +this.estaNaEmpresa);
	}

	//muda o status do funcionario para true *CASO* não esteja na empresa
	boolean setFuncionarioOn(){
		if (estaNaEmpresa){
			System.out.println("O funcionario " +this.nome+ " ja esta na empresa!");
			return false;
		}else{
			return this.estaNaEmpresa = true;
		}
	}

	//muda o status do funcionario para false *CASO* ele ainda esteja na empresa
	boolean setFuncionarioOff(){
		if (!estaNaEmpresa){
			System.out.println("Erro! " +this.nome+ " ja saiu da empresa.");
			return false;
		}else{
			return this.estaNaEmpresa = false;
		}
	}

	//retorna se o funcionario está na empresa ou não
	boolean getFuncionarioStatus(){
		return this.estaNaEmpresa;
	}

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
