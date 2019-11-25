package Objects.Classes;

public class Archer extends Character{
    
    private double Letality;
    
    public Archer(String name){
        super(name);
        classe = Classe.ARQUEIRO;
        setHealthPoints(80);
        setMaxHP(80);
        setEnergyPoints(60);
        setBaseAD(12);
        setBaseMD(0);
        setAttackSpeed(1.8);
        
        setLetality(0.3);
        
    }
    
    public Archer(){
        super("Sem nome");
    }

    @Override
    public void attack(Character enemy) {
        double damage = getTotalAD() + getLevel() + (enemy.getHealthPoints() * getLetality());
        enemy.setHealthPoints(enemy.getHealthPoints() - damage); 
        if (enemy.getHealthPoints() <= 0){
            enemy.setHealthPoints(0);
        }
    }

    public void setLetality(double Letality) {
        this.Letality = Letality;
    }

    public double getLetality() {
        return Letality;
    }
    
}
