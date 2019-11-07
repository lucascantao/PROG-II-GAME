
package Objects;

public enum Region {
    EGUINOR("Eguinor"), BLINDCITY("Blind City"), DESERTO("Deserto"), FLORESTA("Floresta");
    
    private String valor;
    
    Region(String valor){
        this.valor = valor;
    }
    
    public String getValor(){
        return this.valor;
    }
    
}
