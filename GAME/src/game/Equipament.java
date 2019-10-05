/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author soldgear
 */
public class Equipament {
    
    protected Character charOwner;
    
    protected String name;
    protected int cost;
    
    protected int attackDamage;
    protected int magicDamage;
    
    protected int healthPoints;
    protected int energyPoints;
    
    protected Souls souls;
    
    public Equipament(String name, int cost){
        this.name = name;
        this.cost = cost;
    }
    
    public void equipSoul(Souls s){
        this.souls = s;
        s.equip(this);
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
    
}
