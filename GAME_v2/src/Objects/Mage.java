/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author user
 */
public class Mage extends Character{
    
    public Mage(String name){
        super(name);
        classe = Classe.MAGO;
        setHealthPoints(150);
        setMaxHP(150);
        setAttackDamage(2);
        setMagicDamage(12);
        setAttackSpeed(0.8);
    }
    
    public Mage(){
        super();
        setHealthPoints(200);
        setMaxHP(150);
        setAttackDamage(2);
        setMagicDamage(12);
        setAttackSpeed(0.8);
    }
    
    @Override
    public void attack(Character enemy){
        double damage = getMagicDamage() + getLevel();
        enemy.setHealthPoints(enemy.getHealthPoints() - damage);
        if (enemy.getHealthPoints() <= 0){
            enemy.setHealthPoints(0);
            this.setExperience(enemy.getBounty());
        }
    }
    
}
