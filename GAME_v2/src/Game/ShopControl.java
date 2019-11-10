
package Game;

import Interface2.StatusWindow;
import Objects.Equipments.Bag;
import Objects.Equipments.Equipment;
import Objects.Equipments.MagicBook;
import Objects.Equipments.Staff;
import Objects.Equipments.Sword;
import java.util.LinkedList;

public class ShopControl {
    
    private LinkedList<Equipment> equipments;
    
    MagicBook magicBook, diary, infintyEncyclopedia;
    Sword sword, longSword, divineBlade;
    Staff staff, darkStaff;
    Bag bag;
    
    public ShopControl(){
        equipments = new LinkedList<>();
        setEquipaments();
        System.out.println("nome" + equipments.get(0).getName());
    }
    
    public Equipment buyItem(int index){
        return equipments.get(index);
    }
    
    private void setEquipaments(){
        magicBook = new MagicBook("Livro Negro", 50);
        diary = new MagicBook("Diario Perdido de Eguinor", 125);
        infintyEncyclopedia = new MagicBook("Enciclopedia do Infinito", 250);
        sword = new Sword("Espada", 45);
        longSword = new Sword("Espada Longa", 135);
        divineBlade = new Sword("Lâmina Dicvina", 220);
        staff = new Staff("Cajado Pequeno", 160);
        darkStaff = new Staff("Cajado Negro", 300);
        bag = new Bag("Mochila", 250);
        
        equipments.add(magicBook); //0
        equipments.add(diary); //1
        equipments.add(infintyEncyclopedia); //2
        equipments.add(sword); //3
        equipments.add(longSword); //4
        equipments.add(divineBlade); //5
        equipments.add(staff); //6
        equipments.add(darkStaff); //7
        equipments.add(bag); //8
    }
    
}
