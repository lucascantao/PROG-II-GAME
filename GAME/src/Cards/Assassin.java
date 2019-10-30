/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;

/**
 *
 * @author user
 */
public class Assassin extends Character{
    
    private double Letality;
    
    public Assassin(String name){
        super(name);
        setType("ASSASSIN");
        setHealthPoints(80);
        setMaxHP(80);
        setEnergyPoints(60);
        setAttackDamage(12);
        setMagicDamage(0);
        setAttackSpeed(1.8);
        
        setLetality(0.3);
        
    }
    
    public Assassin(){
        super("Sem nome");
    }

    @Override
    public void attack(Character enemy) {
        double damage = getAttackDamage() + getLevel() + (enemy.getHealthPoints() * getLetality());
        enemy.setHealthPoints(enemy.getHealthPoints() - damage); 
        if (enemy.getHealthPoints() <= 0){
            enemy.setHealthPoints(0);
            this.setExperience(enemy.getBounty());
        }
    }

    public void setLetality(double Letality) {
        this.Letality = Letality;
    }

    public double getLetality() {
        return Letality;
    }
    
}
