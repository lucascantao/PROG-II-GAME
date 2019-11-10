
package Npc;

import Objects.Classes.Character;
import Objects.Classes.Classe;

public class BlackMage extends Npc{

    public BlackMage(String name, int level) {
        super(name, level);
        classe = Classe.MAGO;
        setHealthPoints(150);
        setAttackDamage(2);
        setMagicDamage(12);
        setAttackSpeed(0.8);
    }

    @Override
    public void attack(Character enemy) {
        double damage = getMagicDamage() + getLevel();
        enemy.setHealthPoints(enemy.getHealthPoints() - damage);
        if (enemy.getHealthPoints() <= 0){
            enemy.setHealthPoints(0);
            this.setExperience(enemy.getBounty());
        }
    }
    
}
