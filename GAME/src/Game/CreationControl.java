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
    
//    Warrior warrior1;
//    Mage mage1;
    BloodSoul soul1 = new BloodSoul("Breath of Vampire", 1, 8);
    MagicBook book1 = new MagicBook("Snake Venom", 18);
    Sword sword1 = new Sword("Drake Rath", 15);
    
    
    public Warrior CreateWarrior(String name){
        return new Warrior(name);
    }
    
    public Mage CreateMage(String name){
        return new Mage(name);
    }
    
    
}
