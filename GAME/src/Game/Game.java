/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Cards.Warrior;
import Cards.MagicBook;
import Cards.Sword;
import Cards.BloodSoul;
import Cards.Mage;
import Interface.*;
/**
 *
 * @author soldgear
 */
class Game {

    Mage mage1 = new Mage("Necromant");    
    MainWindow window;
    
    public Game(){
        window = new MainWindow();
//        window.setCharacter(warrior1);
        window.setAdversary(mage1);
        window.initDisplayComponents();
        window.setVisible(true);
    }
    
    
    
}
