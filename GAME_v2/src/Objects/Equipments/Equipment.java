
package Objects.Equipments;

import Objects.Classes.Character;

public class Equipment {
    
    protected Character Owner;
    
    private TipoEquipamento tipo_de_equipamento;
    
    private String name;
    private int cost;
    
    private int AditionalAD;
    private int AditionalMD;
    
    private int ExtraHP;
    private int energyPoints;
    
    public Equipment(String name, int cost){
        this.name = name;
        this.cost = cost;
    }
    
    public void equip(Character chr){
        Owner = chr;
        Owner.setAttackDamage(Owner.getAttackDamage() + this.AditionalAD);
        Owner.setMagicDamage(Owner.getMagicDamage() + this.AditionalMD);
        Owner.setHealthPoints(Owner.getHealthPoints() + this.ExtraHP);
    }
    
    public void unequip(){
        Owner.setAttackDamage(Owner.getAttackDamage() - this.AditionalAD);
        Owner.setMagicDamage(Owner.getMagicDamage() - this.AditionalMD);
        Owner.setHealthPoints(Owner.getHealthPoints() - this.ExtraHP);
        Owner = null;
    }

    public Character getCharOwner() {
        return Owner;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getAditionalAD() {
        return AditionalAD;
    }

    public void setAditionalAD(int attackDamage) {
        this.AditionalAD = attackDamage;
    }

    public int getAditionalMD() {
        return AditionalMD;
    }
    
    public void setAditionalMD(int magicDamage) {
        this.AditionalMD = magicDamage;
    }

    public int getExtraHP() {
        return ExtraHP;
    }
    
    public void setExtraHP(int hp){
        this.ExtraHP = hp;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }
    
    public void setTipoEquipamento(TipoEquipamento tipo){
        this.tipo_de_equipamento = tipo;
    }
    
    public TipoEquipamento getTipoEquipamento(){
        return this.tipo_de_equipamento;
    }
}
