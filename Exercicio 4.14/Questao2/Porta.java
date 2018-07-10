class Porta{
    private String cor;
    private boolean aberta;
    double dimensaoX,
          dimensaoY,
          dimensaoZ;

    void abre(){
        this.aberta = true;
    }

    void fecha(){
        this.aberta = false;
    }

    void pinta(String cor){
        this.cor = cor;
    }

    boolean estaAberta(){
        if (this.aberta){
            System.out.println("Porta esta aberta!");
            return true;
        }else{
            System.out.println("Porta nao esta aberta!");
            return false;
        }
    }

    void getPortaStatus(){
        System.out.println("Cor: "+this.cor);
        System.out.println("Status: "+this.aberta);
        System.out.println("Dimensoes: X: " +this.dimensaoX+ " Y: " +this.dimensaoY+ " Y: " +this.dimensaoZ);
        this.estaAberta();
    }
}