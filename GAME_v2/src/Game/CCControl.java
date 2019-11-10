
package Game;

import Objects.Classes.Archer;
import Objects.Classes.Mage;
import Objects.Classes.Warrior;

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
