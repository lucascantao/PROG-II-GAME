/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Class.BloodSoul;
import Class.Character;
import Class.Equipament;
import Class.Mage;
import Class.MagicBook;
import Class.Souls;
import Class.Sword;
import Class.Warrior;
import Interface.MainWindow;
/**
 *
 * @author user
 */
public class Game {
    
    Warrior warrior1 = new Warrior("Soldgear");
    Mage mage1 = new Mage("Necromant");
    BloodSoul soul1 = new BloodSoul("Breath of Vampire", 1, 8);
    MagicBook book1 = new MagicBook("Snake Venom", 18);
    Sword sword1 = new Sword("Drake Rath", 15);
    
    MainWindow window;
    
    public Game(){
        window = new MainWindow(warrior1);
        window.update();
        window.setAdversary(mage1);
        window.setVisible(true);
    }
    
}
