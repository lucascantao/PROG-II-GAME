
package Objects.Quests;

import Objects.Classes.Character;

public class Quest {
    
    private boolean Acomplish;
    private String name;
    private int XP;
    private Character chr; 
    
    public void Quest(String name, int Xp){
        this.name = name;
        this.XP = XP;
        Acomplish = false;    
    }
    
    public void setCharacter(Character chr){
        this.chr = chr;
    }
    
    public void finishQuest(){
        chr.addExperience(XP);
    }
    
    
}
