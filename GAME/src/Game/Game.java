/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Class.*;
import Interface.*;
/**
 *
 * @author soldgear
 */
class Game {
    
    Warrior warrior1 = new Warrior("Soldgear");
    Mage mage1 = new Mage("Necromant");
    BloodSoul soul1 = new BloodSoul("Breath of Vampire", 1, 8);
    MagicBook book1 = new MagicBook("Snake Venom", 18);
    Sword sword1 = new Sword("Drake Rath", 15);
    
    MainWindow window;
    
    public Game(){
        window = new MainWindow(warrior1, mage1);
//        window.setCharacter(warrior1);
//        window.setAdversary(mage1);
        window.initDisplayComponents();
        window.setVisible(true);
    }
    
    
    
}
