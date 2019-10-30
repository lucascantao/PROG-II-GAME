package Interface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Cards.Character;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soldgear
 */
public class Battle extends Thread{
    private MainWindow Window;
    private Character chr;
    private Character adv;
    private BattleListener listener;
    public Battle(MainWindow Window, Character chr, Character adv){
        this.Window = Window;
        this.chr = chr;
        this.adv = adv;
    }
    
    public void setListener(BattleListener listener){
        this.listener = listener;
    }
    
    @Override
    public void run(){
//        System.out.println(chr.getName()+", HP: "+chr.getHealthPoints());
//        System.out.println(adv.getName()+", HP: "+adv.getHealthPoints());
        
        while((chr.getHealthPoints() > 0) && (adv.getHealthPoints() > 0)){
            
            if(chr.getAttackSpeed() >= adv.getAttackSpeed()){
                chr.attack(adv);
                adv.attack(chr);
            }else{
                adv.attack(chr);
                chr.attack(adv);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            System.out.println("-----------------------");
//            chr.getStatus();
//            adv.getStatus();
            listener.battleEnd();
            listener.roundEnd(chr, adv);
        }
        
        MainWindow.running = false; //Variavel Estática
        
        if (chr.getHealthPoints() > 0){
            chr.restoreHP(); // restore 30% of chr HP.
            Window.updateDisplayComponents();
            Window.printTerminal("Vitória!  ***LIFE RESTORED!***\n");
            Window.setAdversary(null);
        }else{
            Window.printTerminal("Derrota");
            // TODO Defeat consequences
        }
    }
    
    public static interface BattleListener {
        public void battleEnd();
        public void roundEnd(Character chr, Character adv);
    }
    
}
