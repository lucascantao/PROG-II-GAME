
package Game;

import Interface.MainWindow;
import Objects.Classes.Archer;
import Objects.Classes.Mage;
import Objects.Classes.Warrior;

public class CCControl {
    
    MainWindow win;
    
    public CCControl(MainWindow w){
        this.win = w;
    }
    
    public Warrior CreateWarrior(String name){
        Warrior w = new Warrior(name);
        win.getInv().SetWarrior(w);
        win.setCom(win.getInv().getWarriorAttack());
        return w;
    }
    
    public Mage CreateMage(String name){
        Mage m = new Mage(name);
        win.getInv().SetMageAttack(m);
        win.setCom(win.getInv().getMageAttack());
        return m;
    }
    
    public Archer CreateArcher(String name){
        Archer a = new Archer(name);
        win.getInv().SetArcherCommand(a);
        win.setCom(win.getInv().getArcherAttack());
        return a;
    }
    
    
}
