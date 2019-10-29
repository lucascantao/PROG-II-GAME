/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Npc;

import Cards.Character;
import Cards.Souls;

/**
 *
 * @author soldgear
 */
public abstract class Enemy extends Character{
    
    private Souls soul;
    private String ID;
    
    public Enemy(String name, int level){
        super(name);
        setLevel(level);
    }

    public void setSoul(Souls soul) {
        this.soul = soul;
    }

    public Souls getSoul() {
        return soul;
    }
   
//    public abstract double getEnemyBounty();

}
