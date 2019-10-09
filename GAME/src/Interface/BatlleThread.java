/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Game.Character;
import java.util.logging.Level;
import java.util.logging.Logger;

package Interface;

/**
 *
 * @author soldgear
 */
public class BatlleThread extends Thread{
    
    private Character c;
    private Character enemy;
    public BatlleThread(Character c, Character enemy){
        this.c = c;
        this.enemy = enemy;
        
    }
    
    @Override
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
