/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Npc;

import Objects.Character;
import Objects.Equipament;
import Objects.Souls;

/**
 *
 * @author soldgear
 */
public abstract class Npc extends Character{
    private Souls soul;
    private String ID;
    
    public Npc(String name, int level){
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
