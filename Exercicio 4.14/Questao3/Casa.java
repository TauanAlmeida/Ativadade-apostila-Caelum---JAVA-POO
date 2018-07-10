class Casa{
    String cor;
    boolean porta1,
            porta2,
            porta3;
    
    void pinta(String cor){
        this.cor = cor;
    }

    int quantasPortasAbertas(){
        int numPortas = 0;
            if (porta1){
                numPortas++;
            }
            if (porta2){
                numPortas++;
            }
            if (porta3){
                numPortas++;
            }
    return numPortas; 
    }
}