class Programa {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();	//Instancia o primeiro objeto
		f1.nome = "Tauan";
		f1.departamento = "Almoxarifado";
		f1.salario = 1800;
		f1.data = "08/05/2018";
		f1.rg = "198.654.056";
		
		Funcionario f2 = f1;
		
		//vai dar igual, pois f2 agora está apontando para o mesmo endereço na memoria de f1
		if (f1 == f2){
			System.out.println("Iguais!");
		}else{
			System.out.println("Nao sao iguais!");
		}
	}

}