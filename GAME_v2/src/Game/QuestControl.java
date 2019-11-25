
package Game;

import Objects.Quests.*;
import Objects.Classes.Character;
import Objects.Classes.*;
import java.util.LinkedList;


public class QuestControl {
    
    private LinkedList<Quest> questList;
    private LinkedList<Character> NPCList;
    private String D1, D2, D3, D4;
    public QuestControl(){
        
        initDescriptions();
        
        questList = new LinkedList<>();
        NPCList = new LinkedList<>();
        
        initNPC();
        
        questList.add(new Quest("Pagamento Atrasado", 85, 50, "Blind City")); //0
        questList.get(0).SetDescription(D1);
        questList.get(0).setNPC(NPCList.get(1));
        
        questList.add(new Quest("Desafio", 60, 45, "Blind City")); //1
        questList.get(1).SetDescription(D2);
        questList.get(1).setNPC(NPCList.get(0));
    }
    
    public LinkedList<Quest> getQuests(){
        return questList;
    }
    
    public LinkedList<Character> getNPCs(){
        return NPCList;
    }
    
    //Inicia os NPCs das quests
    public void initNPC(){
        NPCList.add(new Warrior("Joe")); //0
        NPCList.add(new Mage("Ordo")); //1
        NPCList.add(new Archer("Lee")); //2
    }
    
    private void initDescriptions(){
        D1 = "Uma Pessoa está me "
                + "\ndevendo uma quantidade "
                + "\nde dinheiro a algum tempo, "
                + "\nmas não sei onde o encontrar,"
                + "\nse puder acha-lo para "
                + "\nmim poderá ficar "
                + "\ncom uma parte do pagamento";
        
        D2 = "Treinar sempre é "
                + "\nbom para evoluir suas "
                + "\nhabilidades como guerreiro, "
                + "\nlute comigo e prove "
                + "\nsua determinação!";
    }
    
}
