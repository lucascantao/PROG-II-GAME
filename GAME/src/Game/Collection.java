/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;
import Cards.*;
import Npc.*;
import java.util.Random;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
        
        LinkedList<Equipament> equipments;
        LinkedList<Enemy> enemys;
        Random r;
    
    public Collection(){
        
        r = new Random();
        equipments = new LinkedList<Equipament>();
        enemys = new LinkedList<Enemy>();
        
        
        // INIMIGOS
        blueDrake = new Drake("Blue Dragon", 1);
        redDrake = new Drake("Red Dragon", 3);
        blackDrake = new Drake("Black Dragon", 5); 
        
        enemys.add(blueDrake);
        enemys.add(redDrake);
        enemys.add(blackDrake);
        
        // EQUIPAMENTOS
        bloodSoul = new BloodSoul("Breath of Vampire", 1, 8);
        magicBook = new MagicBook("Snake Venom", 18);
        sword = new Sword("Drake Rath", 15);
        
        equipments.add(magicBook);
        equipments.add(sword);
    }
    
    public Equipament getDropItem(){
        return equipments.get(r.nextInt(2));
        
    }
    
    public Enemy getRandEnemy(int n){
        return enemys.get(r.nextInt(n));
    }
    
}
