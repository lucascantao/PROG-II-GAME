
package Commands;

import Objects.Classes.Warrior;

public class WarriorAttackCommand implements ICommand{

    Warrior w;
    
    public WarriorAttackCommand(Warrior w){
        this.w = w;
    }
    
    @Override
    public void Execute() {
        w.attack();
    }

    @Override
    public void Unexecute() {
    }
    
}
