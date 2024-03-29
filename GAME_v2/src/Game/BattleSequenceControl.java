
package Game;

import Objects.Equipments.Equipment;
import Npc.NPC;

public class BattleSequenceControl {
    
    private Collection collection;
    
    private int enemysLeft;
    
    private boolean drake_state = true;
    private boolean zombie_state = false;
    private boolean vampire_state = false;
    
    private NPC current_enemy;
    
    public BattleSequenceControl(){
        collection = new Collection();
        current_enemy = collection.enemys.get(0);
        enemysLeft = 3;
    }
    
    public NPC getCurrentEnemy(){
        return current_enemy;
    }
    
    public Equipment getDropItem(){
        this.enemysLeft -= 1;
        return this.collection.getDropItem();
    }
    
    public NPC getRandomEnemy(){
        return collection.getRandEnemy(enemysLeft);
    }
    
    public int getEnemysLeft(){
        return enemysLeft;
    }
    
    
    
}
