/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Npc;

import Objects.Classes.Character;
import Objects.Equipments.Equipment;

/**
 *
 * @author soldgear
 */
public abstract class Npc extends Character{
    private String ID;
    
    public Npc(String name, int level){
        super(name);
        setLevel(level);
    }

//    public abstract double getEnemyBounty();

}
