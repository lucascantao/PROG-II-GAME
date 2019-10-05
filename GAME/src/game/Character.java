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
public abstract class Character {
    
    protected String name;
    protected int attackDamage;
    protected int magicDamage;
    
    protected double healthPoints;
    protected int energyPoints;
    
    protected int level;
    protected double experience;
    
    protected Equipament equipament;
    
    public Character(String name){
        this.name = name;
        level = 1;
        experience = 0.0;
    }
    
    public void equip(Equipament e){ // Habilitar Equipamento e atualizar Status
        if(this.equipament == null){
            this.equipament = e;
            e.charOwner = this;
            this.attackDamage += e.attackDamage;
            this.magicDamage += e.magicDamage;
        }else{
            System.out.println("Error");
        }
    }
    
    public void unequip(){ // Tirar eauipamento e atualizar Status
        if (this.equipament == null){
            System.out.println("Error");
            return;
        }
        this.attackDamage -= this.equipament.attackDamage;
        this.magicDamage -= this.equipament.magicDamage;
        this.equipament.charOwner = null;
        this.equipament = null;
    }
    
    public abstract void attack(Character enemy);
    
    public double getBounty(){
        return (this.attackDamage + this.experience + this.level + this.magicDamage) * 0.5;
    }
    
}
