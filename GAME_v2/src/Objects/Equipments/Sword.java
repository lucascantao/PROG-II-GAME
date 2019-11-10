
package Objects.Equipments;

public class Sword extends Equipment{
    
    public Sword(String nome, int cost){
        super(nome, cost);
        setAditionalAD(10);
        setTipoEquipamento(TipoEquipamento.ESPADA);
    }
    
}
