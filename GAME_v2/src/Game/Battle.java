package Game;


import Interface.MainWindow;
import Objects.Classes.Character;

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

            listener.turnEnd();
        }
        
        MainWindow.running = false; //Variavel Estática
        
        if (chr.getHealthPoints() > 0){
            chr.restoreHP(); // restore 30% of chr HP.
            listener.dropItem();
            listener.battleEnd();
        }else{
//            Window.printTerminal("Derrota");
            // TODO Defeat consequences
        }
    }
    
    public static interface BattleListener {
        public void turnEnd();
        public void battleEnd();
        public void dropItem();
    }
    
}
