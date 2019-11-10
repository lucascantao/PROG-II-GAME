
package Objects.Equipments;

public class MagicBook extends Equipment{
    
    public MagicBook(String name, int cost){
        super(name,cost);
        setAditionalMD(8);
        setTipoEquipamento(TipoEquipamento.LIVRO);
    }
    
}
