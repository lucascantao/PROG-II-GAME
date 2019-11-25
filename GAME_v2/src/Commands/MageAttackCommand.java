
package Commands;

import Objects.Classes.*;

public class MageAttackCommand implements ICommand{
    
    Mage m;
    
    public MageAttackCommand(Mage m){
        this.m = m;
    }
    
    @Override
    public void Execute() {
        m.attack();
    }

    @Override
    public void Unexecute() {
        
    }
    
}
