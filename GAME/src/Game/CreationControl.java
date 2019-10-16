/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Cards.*;

/**
 *
 * @author soldgear
 */
public class CreationControl {
    
    public Warrior CreateWarrior(String name){
        return new Warrior(name);
    }
    
    public Mage CreateMage(String name){
        return new Mage(name);
    }
    
    public Assassin CreateAssassin(String name){
        return new Assassin(name);
    }
    
    
}
