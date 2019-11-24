
package Npc;

import Objects.Classes.Character;
import Objects.Equipments.Equipment;

public class NPC{
    
    private String ID;
    
    private String Name;
    private int level;
    
    public NPC(String name, int level){
        this.Name = name;
        this.level = level;
    }
    
    public String getName(){
        return this.Name;
    }
    
    public void initQuest(Character chr){
        // Init Quest
    }

}
