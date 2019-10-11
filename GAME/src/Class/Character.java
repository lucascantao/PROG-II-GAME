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
public abstract class Character {
    
    protected String name;
    protected int attackDamage;
    protected int magicDamage;
    protected double attackSpeed;
    
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
    
    public abstract void attack(Character enemy);
    
    public void setEquipmament(Equipament e){ // Habilitar Equipamento e atualizar Status
        if(this.equipament == null){
            this.equipament = e;
            e.equipOnChar(this);
            System.out.println("\n*"+ e.getName() +" EQUIPED"+"*\n");
        }else{
            System.out.println("Error");
        }
    }
    
    public void unequip(){ // Tirar equipamento e atualizar Status
        if (this.equipament != null){
            this.equipament.unequip();
            return;
        }
        System.out.println("Error");
    }
    
    public double getBounty(){
        return level + attackDamage + magicDamage;
    }
    
    public void getStatus(){
        System.out.println("\nName:   " + getName());
        System.out.println("\nHP:     " + getHealthPoints() + 
                           "\nENERGY: " + getEnergyPoints() + 
                           "\nATK:    " + getAttackDamage() +
                           "\nMAGIC:  " + getMagicDamage() +
                           "\nLEVEL:  " + getLevel() +
                           "\nEXP:    " + getExperience());
    }
    
    public void restoreHP(double percent){
        this.healthPoints += this.healthPoints * percent;
    }
    
    // ----GETTERSE AND SETTERS-----
    
    public String getName() {
        return name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    public int getLevel() {
        return level;
    }

    public double getExperience() {
        return experience;
    }

    public Equipament getEquipament() {
        return equipament;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setEnergyPoints(int energyPoints) {
        this.energyPoints = energyPoints;
    }

    public void setExperience(double experience) {
        this.experience += experience;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
    
    
    
    
    
    
    
    
    
}
