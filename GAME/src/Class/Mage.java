/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author user
 */
public class Mage extends Character{
    
    public Mage(String name){
        super(name);
        setHealthPoints(200);
        setAttackDamage(2);
        setMagicDamage(12);
        setAttackSpeed(0.8);
    }
    
    @Override
    public void attack(Character enemy){
        double damage = getMagicDamage() + getLevel();
        enemy.setHealthPoints(enemy.getHealthPoints() - damage);
        if (enemy.getHealthPoints() <= 0){
            this.setExperience(enemy.getBounty());
        }
    }
    
}
