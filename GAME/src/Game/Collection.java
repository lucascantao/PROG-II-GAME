/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;
import Cards.*;
import Npc.*;
/**
 *
 * @author soldgear
 */
public class Collection {
        
        Drake blueDrake;
        Drake redDrake; 
        Drake blackDrake;
        BloodSoul bloodSoul;
        MagicBook magicBook;
        Sword sword;
    
    public Collection(){
        blueDrake = new Drake("Blue Dragon", 1);
        redDrake = new Drake("Red Dragon", 3);
        blackDrake = new Drake("Black Dragon", 5);    
        bloodSoul = new BloodSoul("Breath of Vampire", 1, 8);
        magicBook = new MagicBook("Snake Venom", 18);
        sword = new Sword("Drake Rath", 15);
    }
    
}
