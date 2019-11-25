package Game;


import Interface.BattleWindow;
import Interface.MainWindow;
import Objects.Classes.Character;

public class Battle extends Thread{
    private BattleWindow Window;
    private Character chr;
    private Character adv;
    private BattleListener listener;
    
    private boolean Ataque;
    
    public Battle(BattleWindow Window, Character chr, Character adv){
        this.Window = Window;
        this.chr = chr;
        this.adv = adv;
    }
    
    public void setListener(BattleListener listener){
        this.listener = listener;
    }
    
    public void update(){
        Window.updateStatusDisplay();
    }
    
    @Override
    public void run(){
        initBattle();
    }
    
    public void initBattle(){
        update();
        while((chr.getHealthPoints() > 0) && (adv.getHealthPoints() > 0)){
            if(chr.getAttackSpeed() >= adv.getAttackSpeed()){
//                chr.attack(adv);
//                adv.attack(chr);
                adv.setHealthPoints(adv.getHealthPoints() - chr.attack());
                chr.setHealthPoints(chr.getHealthPoints() - adv.attack());
            }else{
//                adv.attack(chr);
//                chr.attack(adv);
                chr.setHealthPoints(chr.getHealthPoints() - adv.attack());
                adv.setHealthPoints(adv.getHealthPoints() - chr.attack());
            }
            update();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            
        }
//            listener.turnEnd();
        
        Window.setVisible(false);
        
        MainWindow.running = false; //Variavel Estática
//        MainWindow.updateStatusDisplay();
        
        if (chr.getHealthPoints() > 0){
            chr.restoreHP(); // restore 30% of chr HP.
            System.out.println("Vitoria");
            Window.finish();
        }else{
            System.out.println("Derrota");
            chr.restoreHP();
            Window.fail();
        }
    }
    
    public static interface BattleListener {
        public void turnEnd();
        public void battleEnd();
        public void dropItem();
    }
    
}
