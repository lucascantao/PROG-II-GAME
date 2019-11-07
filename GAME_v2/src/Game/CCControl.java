
package Game;

import Objects.Archer;
import Objects.Mage;
import Objects.MagicBook;
import Objects.Staff;
import Objects.Sword;
import Objects.Warrior;

public class CCControl {
    
    public Warrior CreateWarrior(String name){
        return new Warrior(name);
    }
    
    public Mage CreateMage(String name){
        return new Mage(name);
    }
    
    public Archer CreateArcher(String name){
        return new Archer(name);
    }
    
    
}
