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
            setBaseMD(0);
            setAttackSpeed(1.1);
    }
    
    @Override
    public void attack(Character enemy){
        double damage = getTotalAD() + getLevel();
        enemy.setHealthPoints(enemy.getHealthPoints() - damage); 
        if (enemy.getHealthPoints() <= 0){
            enemy.setHealthPoints(0);
            this.addExperience(enemy.getBounty());
        }
    } 
}
