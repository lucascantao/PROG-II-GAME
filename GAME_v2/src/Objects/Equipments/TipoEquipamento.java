
package Objects.Equipments;

public enum TipoEquipamento {

    ARCO("Arco"), ESPADA("Espada"), ESCUDO("Escudo"), BASTAO("Bastão Mágico"), LIVRO("Livro Mágico");

    private String valor;
    
    private TipoEquipamento(String valor) {
        this.valor = valor;
    }
    
    public String getValor(){
        return this.valor;
    }
    
    
    
}
