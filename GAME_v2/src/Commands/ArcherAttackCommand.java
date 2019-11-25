
package Commands;

import Objects.Classes.Archer;

public class ArcherAttackCommand implements ICommand{

    Archer a;
    
    public ArcherAttackCommand(Archer a){
        this.a = a;
    }
    
    @Override
    public void Execute() {
        a.attack();
    }

    @Override
    public void Unexecute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
