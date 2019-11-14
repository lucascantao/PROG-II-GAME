
package Game;
import Objects.Equipments.Equipment;
import Objects.Equipments.Sword;
import Objects.Equipments.MagicBook;
import Npc.*;
import Objects.Equipments.Staff;
import java.util.Random;

import java.util.LinkedList;

public class Collection {
    
        Drake blueDrake;
        Drake redDrake; 
        Drake blackDrake;

        MagicBook magicBook, diary, infintyEncyclopedia;
        Sword sword, longSword, divineBlade;
        Staff staff, darkStaff;
        
        LinkedList<Equipment> equipments;
        LinkedList<NPC> enemys;
        Random r;
    
    public Collection(){
        
        r = new Random();
        equipments = new LinkedList<Equipment>();
        enemys = new LinkedList<NPC>();
        
        // EQUIPAMENTOS
        
        magicBook = new MagicBook("Diário Negro", 50);
        diary = new MagicBook("Diario", 125);
        infintyEncyclopedia = new MagicBook("Enciclopedia do Infinito", 250);
        sword = new Sword("Espada", 45);
        longSword = new Sword("Espada Longa", 135);
        divineBlade = new Sword("Lâmina Dicvina", 220);
        staff = new Staff("Cajado Pequeno", 160);
        darkStaff = new Staff("Cajado Negro", 300);
        
        equipments.add(magicBook);
        equipments.add(diary);
        equipments.add(infintyEncyclopedia);
        equipments.add(sword);
        equipments.add(longSword);
        equipments.add(divineBlade);
        equipments.add(staff);
        equipments.add(darkStaff);
        
        // INIMIGOS
        blueDrake = new Drake("Blue Dragon", 1);
        redDrake = new Drake("Red Dragon", 3);
        blackDrake = new Drake("Black Dragon", 5); 
        
        enemys.add(blueDrake);
        enemys.add(redDrake);
        enemys.add(blackDrake);
    }
    
    public Equipment getDropItem(){
        return equipments.get(r.nextInt(2));
    }
    
    public LinkedList<Equipment> getEquipamentList(){
        return this.equipments;
    }
    
    public NPC getRandEnemy(int n){
        return enemys.get(r.nextInt(n));
    }
    
}
