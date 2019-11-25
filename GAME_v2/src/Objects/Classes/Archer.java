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
        
//        setLetality(0.3);
        
    }
    
    public Archer(){
        super("Sem nome");
    }

    @Override
    public int attack(){
        return getTotalAD() * 2 + getLevel();
        
    }

//    public void setLetality(double Letality) {
//        this.Letality = Letality;
//    }
//
//    public double getLetality() {
//        return Letality;
//    }
    
}
