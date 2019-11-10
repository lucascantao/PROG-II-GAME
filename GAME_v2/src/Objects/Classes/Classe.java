package Objects.Classes;

public enum Classe {
    
    LUTADOR("Lutador"), MAGO("Mago"), ARQUEIRO("Arqueiro");
    
    private String valor;
    
    Classe(String valor){
        this.valor = valor;
    }
    
    public String getValor(){
        return this.valor;
    }
    
}
