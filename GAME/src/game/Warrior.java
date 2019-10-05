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
public class Warrior extends Character{
    
    public Warrior(String name){
            super(name);
    }
    @Override
    public void attack(Character enemy){
        enemy.healthPoints -= this.attackDamage * this.level * 0.2;
        if (enemy.healthPoints <= 0){
            this.experience += enemy.getBounty();
        }
    } 
}
