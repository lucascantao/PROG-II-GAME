
package Objects.Equipments;

public class Staff extends Equipment{
    
    public Staff(String name, int cost){
        super(name, cost);
        setAditionalMD(12);
        setTipoEquipamento(TipoEquipamento.BASTAO);
    }
}
