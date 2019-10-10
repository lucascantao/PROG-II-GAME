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
public class Equipament {
    
    protected Character charOwner;
    
    private String name;
    private int cost;
    
    private int attackDamage;
    private int magicDamage;
    
    private int healthPoints;
    private int energyPoints;
    
    private Souls souls;
    
    public Equipament(String name, int cost){
        this.name = name;
        this.cost = cost;
    }
    
    public void equipOnChar(Character owner){
        this.charOwner = owner;
        owner.attackDamage += this.attackDamage;
        owner.magicDamage += this.magicDamage;
    }
    
    public void unequip(){
        this.charOwner.equipament = null;
        this.charOwner.attackDamage -= this.attackDamage;
        this.charOwner.magicDamage -= this.magicDamage;
        this.charOwner = null;
    }
    
    public void setSoul(Souls s){
        this.souls = s;
        s.equip(this);
        charOwner.attackDamage += this.attackDamage;
        charOwner.magicDamage += this.magicDamage;
    }
    
    public void unequipSoul(){
        if (this.souls != null){
            this.souls.unequip();
            this.souls = null;
        }
    }
    
    public void activeSoul(Character enemy){
        souls.SoulAction(enemy);
        charOwner.energyPoints -= 5;
    }

    public Character getCharOwner() {
        return charOwner;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }
    
    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    public Souls getSouls() {
        return souls;
    }
    
    
    
}
