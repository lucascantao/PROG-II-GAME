
package Objects.Equipments;

public class Shield extends Equipment{
    
    public Shield(String name, int cost){
        super(name, cost);
        setTipoEquipamento(TipoEquipamento.ESCUDO);
        setExtraHP(25);
    }
    
}
