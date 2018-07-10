class Programa{
    public static void main(String[] args) {
        Porta p1 = new Porta();
        p1.abre();
        p1.fecha();
        p1.pinta("Marrom");
        p1.pinta("Azul");
        p1.dimensaoX = 1.50;
        p1.dimensaoY = 1.10;
        p1.dimensaoZ = 0.20;
        p1.getPortaStatus();
    }
}