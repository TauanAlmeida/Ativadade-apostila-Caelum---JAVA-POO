class Programa {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();	//Instancia o primeiro objeto
		Data data = new Data();
		f1.nome = "Tauan";
		f1.departamento = "Almoxarifado";

		f1.dataDeEntrada = data;
		f1.rg = "198.654.056";
		//Gera um erro, não faz sentido eu perguntar o calculo anual de uma classe
		Funcionario.calculoGanhoAnual();
		f1.getStatus();
		
	}

}