
package Objects.Quests;

import Objects.Classes.Character;

public class Quest {
    
    private boolean Acomplish;
    private String name;
    private int XP;
    private int gold;
    private Character chr; 
    private String Location;
    private String Description;
    
    public Quest(String name, int gold, int Xp, String Loc){
        this.name = name;
        this.XP = Xp;
        this.gold = gold;
        this.Location = Loc;
        Acomplish = false;    
    }
    
    public boolean getAcomplish(){
        return Acomplish;
    }
    
    public void setNPC(Character chr){
        this.chr = chr;
    }
    
    public Character getNPC(){
        return this.chr;
    }
    
    public void SetDescription(String description){
        this.Description = description;
    }
    
    public String getDescription(){
        return Description;
    }
    
    public String getName(){
        return name;
    }
    
    public void finishQuest(){
//        chr.addExperience(XP);
        Acomplish = true;
    }
    
    public int getXp(){
        return XP;
    }
    
    public int getGold(){
        return gold;
    }
    
    public String getLocation(){
        return Location;
    }
    
    
}
