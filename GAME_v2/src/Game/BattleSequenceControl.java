
package Game;

import Objects.Equipament;
import Npc.Npc;

public class BattleSequenceControl {
    
    private Collection collection;
    
    private int enemysLeft;
    
    private boolean drake_state = true;
    private boolean zombie_state = false;
    private boolean vampire_state = false;
    
    private Npc current_enemy;
    
    public BattleSequenceControl(){
        collection = new Collection();
        current_enemy = collection.enemys.get(0);
        enemysLeft = 3;
    }
    
    public Npc getCurrentEnemy(){
        return current_enemy;
    }
    
    public Equipament getDropItem(){
        this.enemysLeft -= 1;
        return this.collection.getDropItem();
    }
    
    public Npc getRandomEnemy(){
        return collection.getRandEnemy(enemysLeft);
    }
    
    public int getEnemysLeft(){
        return enemysLeft;
    }
    
    
    
}
