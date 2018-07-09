class Programa {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();	//Instancia o primeiro objeto
		Funcionario f2 = new Funcionario(); //Instancia o segundo objeto
		f1.nome = "Tauan";
		f1.departamento = "Almoxarifado";
		f1.salario = 1800;
		f1.data = "08/05/2018";
		f1.rg = "198.654.056";
		//Segundo objeto
		f2.nome = "Tauan";
		f2.departamento = "Almoxarifado";
		f2.salario = 1800;
		f2.data = "08/05/2018";
		f2.rg = "198.654.056";

		//Nao vão ser iguais, pois o endereço na memória são diferentes
		//	Ex: Memoria(posição): 
		//	f1 = [0x123] 
		//	f2 = [0x124]
		if (f1 == f2){
			System.out.println("Iguais!");
		}else{
			System.out.println("Nao sao iguais!");
		}
	}

}