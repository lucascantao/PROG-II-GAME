/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Cards.Mage;
import Interface.*;
import Npc.BlackMage;
import Npc.Drake;
/**
 *
 * @author soldgear
 */
class Game {
    
    Drake drake = new Drake("Drake", 2);
    BlackMage black_mage = new BlackMage("Black Mage", 7);
    Mage mage1 = new Mage("Black Mage"); 
    MainWindow window;
    
    public Game(){
        window = new MainWindow();
//        window.setCharacter(warrior1);
//        window.setAdversary(drake);
        window.initDisplayComponents();
        window.setVisible(true);
    }
    
    
    
}
