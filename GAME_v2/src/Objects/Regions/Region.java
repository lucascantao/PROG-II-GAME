
package Objects.Regions;

import java.util.LinkedList;
//import Npc.NPC;
import Objects.Quests.Quest;

public class Region {
    
    RegionEnum region;
    String name;
    
//    private LinkedList<NPC> npcs;
    private LinkedList<String> quests;
    
    public Region(String name, RegionEnum region){
        this.name = name;
        this.region = region;
        quests = new LinkedList<>();
    }
    
    public String getName(){
        return name;
    }
    
    public RegionEnum getRegionEnum(){
        return region;
    }
    
    public void addQuest(String q){
        quests.add(q);
    }
    
    public LinkedList<String> getQuests(){
        return quests;
    }
    
}
