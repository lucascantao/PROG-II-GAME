
package Objects.Regions;

public enum RegionEnum {
    EGUINOR("Eguinor"), BLINDCITY("Blind City"), DESERTO("Deserto"), FLORESTA("Floresta");
    
    private String valor;
    
    RegionEnum(String valor){
        this.valor = valor;
    }
    
    public String getValor(){
        return this.valor;
    }
    
}
