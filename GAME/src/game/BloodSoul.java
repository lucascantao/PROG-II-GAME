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
public class BloodSoul extends Souls{
    
    public BloodSoul(String name, int magic, int attack){
        super("Blood Soul", 0, 8);
    }
    
    @Override
    public void SoulAction(Character enemy){
        Character owner = this.equipamentOwner.charOwner;
        double blood = (owner.attackDamage * 0.5) + (enemy.healthPoints * 0.1);
        enemy.healthPoints -= blood;
        owner.healthPoints += blood ;
    }
    
}
