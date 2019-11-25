
package Commands;

import Commands.*;
import Objects.Classes.*;

public class Invoker {
    
    ICommand ArcherAttack;
    ICommand MageAttack;
    ICommand WarriorAttack;
    
    public void SetArcherCommand(Archer a){
        ArcherAttack = new ArcherAttackCommand(a);
    }
    
    public void SetMageAttack(Mage m){
        MageAttack = new MageAttackCommand(m);
    }

    public ICommand getArcherAttack() {
        return ArcherAttack;
    }

    public ICommand getMageAttack() {
        return MageAttack;
    }

    public ICommand getWarriorAttack() {
        return WarriorAttack;
    }
    
    public void SetWarrior(Warrior w){
        WarriorAttack = new WarriorAttackCommand(w);
    }
    
}
