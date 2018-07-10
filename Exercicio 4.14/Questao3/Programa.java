class Programa{
    public static void main(String[] args) {
        Casa c1 = new Casa();
        c1.cor = "Azul";
        c1.porta1 = false;
        c1.porta2 = false;
        c1.porta3 = false;

        int a = c1.quantasPortasAbertas();
        System.out.println(a);
    }
}