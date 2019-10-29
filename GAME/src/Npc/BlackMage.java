/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Npc;

import Cards.Character;

/**
 *
 * @author soldgear
 */
public class BlackMage extends Enemy{

    public BlackMage(String name, int level) {
        super(name, level);
        setType("MAGE");
        setHealthPoints(150);
        setAttackDamage(2);
        setMagicDamage(12);
        setAttackSpeed(0.8);
    }

    @Override
    public void attack(Character enemy) {
        double damage = getMagicDamage() + getLevel();
        enemy.setHealthPoints(enemy.getHealthPoints() - damage);
        if (enemy.getHealthPoints() <= 0){
            enemy.setHealthPoints(0);
            this.setExperience(enemy.getBounty());
        }
    }

//    @Override
//    public double getEnemyBounty() {
//        return 25.0;
//    }
    
}
