/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Cards.Equipament;
import Npc.Enemy;

/**
 *
 * @author soldgear
 */
public class BattleSequenceControl {
    
    private Collection collection;
    
    private int enemysLeft;
    
    private boolean drake_state = true;
    private boolean zombie_state = false;
    private boolean vampire_state = false;
    
    private Enemy current_enemy;
    
    public BattleSequenceControl(){
        collection = new Collection();
        current_enemy = collection.enemys.get(0);
        enemysLeft = 3;
    }
    
    public Enemy getCurrentEnemy(){
        return current_enemy;
    }
    
    public Equipament getDropItem(){
        this.enemysLeft -= 1;
        return this.collection.getDropItem();
    }
    
    public Enemy getRandomEnemy(){
        return collection.getRandEnemy(enemysLeft);
    }
    
    public int getEnemysLeft(){
        return enemysLeft;
    }
    
    
    
}
