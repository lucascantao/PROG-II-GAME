
package Game;

import Interface2.StatusWindow;
import Objects.Equipament;
import Objects.MagicBook;
import Objects.Staff;
import Objects.Sword;
import java.util.LinkedList;

public class ShopControl {
    
    private LinkedList<Equipament> equipaments;
    
    MagicBook magicBook, diary, infintyEncyclopedia;
    Sword sword, longSword, divineBlade;
    Staff staff, darkStaff;
    
    public void ShopControl(){
        setEquipaments();
    }
    
    public Equipament buyItem(Equipament e){
        return e;
    }
    
    private void setEquipaments(){
        magicBook = new MagicBook("Diário Negro", 50);
        diary = new MagicBook("Diario", 125);
        infintyEncyclopedia = new MagicBook("Enciclopedia do Infinito", 250);
        sword = new Sword("Espada", 45);
        longSword = new Sword("Espada Longa", 135);
        divineBlade = new Sword("Lâmina Dicvina", 220);
        staff = new Staff("Cajado Pequeno", 160);
        darkStaff = new Staff("Cajado Negro", 300);
        
        equipaments.add(magicBook);
        equipaments.add(diary);
        equipaments.add(infintyEncyclopedia);
        equipaments.add(sword);
        equipaments.add(longSword);
        equipaments.add(divineBlade);
        equipaments.add(staff);
        equipaments.add(darkStaff);
        return;
    }
    
}
