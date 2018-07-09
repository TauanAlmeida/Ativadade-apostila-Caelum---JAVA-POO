class Programa {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();	//Instancia o primeiro objeto
		Data data = new Data();
		f1.nome = "Tauan";
		f1.departamento = "Almoxarifado";
		f1.salario = 1800;
		f1.dataDeEntrada = data;
		f1.rg = "198.654.056";
		
		f1.getStatus();
		
	}

}