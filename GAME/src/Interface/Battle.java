package Interface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Class.Character;

/**
 *
 * @author soldgear
 */
public class Battle{
    
    private Character c;
    private Character enemy;
    public Battle(Character c, Character enemy){
        this.c = c;
        this.enemy = enemy;
        
    }
    public void run(){
        
        while(c.getHealthPoints() > 0 && enemy.getHealthPoints() > 0){
        
            if(c.getAttackSpeed() >= enemy.getAttackSpeed()){
                c.attack(enemy);
                enemy.attack(c);
            }else{
                enemy.attack(c);
                c.attack(enemy);
            }
        }
        if (c.getHealthPoints() > 0){
            System.out.println("Vitória");
            c.restoreHP(0.3); // restore 30% of character HP.
        }else{
            System.out.println("Derrota");
            // TODO Defeat consequences
        }
    }
    
}
