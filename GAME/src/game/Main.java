package game;

/**
 *
 * @author soldgear
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Warrior G1 = new Warrior("Soldgear");
        
        Mage G2 = new Mage("Necromant");
        
        BloodSoul BS = new BloodSoul("Breath of Vampire", 1, 8);
        
        MagicBook C1 = new MagicBook("Snake Venom", 18);
        Sword S1 = new Sword("Drake Rath", 15);
        
        
        G1.getStatus();
        
        G2.getStatus();
        
        G1.setEquipmament(S1);
        
        G1.getStatus();
        
        G1.getEquipament().setSoul(BS);
        
        G1.getStatus();

        
    }
    
}
