package Objects.Classes;

public class Warrior extends Character{
    
    public Warrior(String name){
            super(name);
            classe = Classe.LUTADOR;
            setHealthPoints(200);
            setMaxHP(200);
            setEnergyPoints(100);
            setBaseAD(8);
            setBaseMD(0);
            setAttackSpeed(1.1);
    }
    
    public Warrior(){
            super();
            setHealthPoints(200);
            setMaxHP(200);
            setEnergyPoints(100);
            setBaseAD(8);
            setBaseMD(2);
            setAttackSpeed(1.1);
    }
    
    @Override
    public int attack(){
        return getTotalAD() + getTotalMD() + getLevel();
        
    }
}
