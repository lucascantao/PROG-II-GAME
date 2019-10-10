/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author soldgear
 */
public abstract class Souls {
    
    protected Equipament equipamentOwner;
    
    private String name;
    
    private int attackDamage;
    private int magicDamage;
    
    public Souls(String name, int magic, int attack ){
        this.name = name;
        this.magicDamage = magic;
        this.attackDamage = attack;
    }
    
    public abstract void SoulAction(Character enemy);
    
    public void equip(Equipament e){
        this.equipamentOwner = e;
        e.setAttackDamage(e.getAttackDamage() + this.attackDamage);
        e.setMagicDamage(e.getMagicDamage() + this.magicDamage);
    }
    
    public void unequip(){
        this.equipamentOwner.setAttackDamage(this.equipamentOwner.getAttackDamage() - this.attackDamage);
        this.equipamentOwner.setMagicDamage(this.equipamentOwner.getMagicDamage() - this.magicDamage);;
        this.equipamentOwner = null;
    }
    
}
