
package Npc;

import Objects.Classes.Character;
import Objects.Equipments.Equipment;

public class NPC{
    
    private String ID;
    
    private String Name;
    private int Bounty;
    private int level;
    
    public NPC(String name, int level){
        this.Name = name;
        this.level = level;
        this.Bounty = level*10;
    }
    
    public String getName(){
        return this.Name;
    }
    
    public int getBounty(){
        return this.Bounty;
    }
    
    public void initQuest(Character chr){
        // Init Quest
        chr.addExperience(getBounty());
    }

}
