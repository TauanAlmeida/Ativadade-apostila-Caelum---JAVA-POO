class Programa{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Tauan";
        p1.idade = 6;
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        System.out.println("Nome: "+p1.nome);      
        System.out.println("Idade: "+p1.idade);

    } 
}