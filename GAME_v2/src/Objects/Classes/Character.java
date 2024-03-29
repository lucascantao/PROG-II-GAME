
package Objects.Classes;

import Objects.Equipments.Bag;
import Objects.Equipments.Equipment;
import Objects.Equipments.TipoEquipamento;
import Objects.Quests.Quest;
import java.util.LinkedList;

public abstract class Character {
    
    protected Classe classe;
    
    // STATUS
    
    private String name;
    private int BaseAD;
    private int BaseMD;
    private int attackDamage;
    private int magicDamage;
    private double attackSpeed;
    private double healthPoints;
    private double maxHP;
    private int energyPoints;
    private int level;
    private int AbilityPoints;
    private double experience;
    
    // SLOTS DE EQUIPAMENTOS DISPONÍVEIS
    
    private Equipment Weapon;
    private Equipment R_Hand;
    private Equipment Armor;
    private Bag bag;
    
    private int Gold;
    private Quest MainQuest;
            
    public Character(String name){
        this.name = name;
        level = 1;
        experience = 0.0;
        AbilityPoints = 0;
        Gold = 300;
        Weapon = null;
        R_Hand = null;
        Armor = null;
        bag = null;
        
    }
    
    public Character(){
        this.name = "Sem nome";
        level = 1;
        experience = 0.0;
    }
    
    public abstract int attack();
    
    public void restoreHP(){
        this.healthPoints += this.maxHP * 0.3;
        if (this.healthPoints > this.maxHP) {
            this.healthPoints = this.maxHP;
        }
    }
    
    public double getBounty(){
        return level + attackDamage + magicDamage;
    }
    
    public void restoreHP(double percent){
        this.healthPoints += this.healthPoints * percent;
    }
    
//    public void poeNaMochila(Equipment e){
//        this.bag.
//    }
    
    public void upgrade(String ability){
        if (ability.equals("Resistencia")){
            this.maxHP += maxHP * 0.3;
        }
        if (ability.equals("Magia")){
            this.BaseMD += BaseMD * 0.3;
        }
        if (ability.equals("Ataque")){
            this.BaseAD += BaseAD * 0.3;
        }
        if (ability.equals("")){
            return;
        }
        
        this.AbilityPoints -= 1;
    }
    
    // ----GETTERSE AND SETTERS-----
    
    // ATRIBUTOS ------------
    
    public String getName() {
        return name;
    }
    
    public Quest getQuest(){
        return MainQuest;
    }

    public int getTotalAD() {
        if (Weapon != null)
            return BaseAD + Weapon.getAditionalAD();
        return BaseAD;
    }

    public int getTotalMD() {
        if (Weapon != null)
            return BaseMD + Weapon.getAditionalMD();
        return BaseMD;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    public int getLevel() {
        return level;
    }

    public double getExperience() {
        return experience;
    }

    public Equipment getEquipament() {
        return Weapon;
    }

    public void setBaseAD(int attackDamage) {
        this.BaseAD = attackDamage;
        this.attackDamage = BaseAD;
    }

    public void setBaseMD(int magicDamage) {
        this.BaseMD = magicDamage;
        this.magicDamage = BaseMD;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setEnergyPoints(int energyPoints) {
        this.energyPoints = energyPoints;
    }

    public void addExperience(double experience) {
        this.experience += experience;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public void setMaxHP(double maxHP) {
        this.maxHP = maxHP;
    }
    
    public void UpgradePH(){
        this.AbilityPoints += 1;
        this.level += 1;
    }
    
    public int getAbilityPoints(){
        return this.AbilityPoints;
    }
    
    public Equipment getWeapon(){
        return Weapon;
    }
    
    public Equipment getRH(){
        return R_Hand;
    }
    
    // EQUIPAMENTOS -------------------
    
    public void setBag(Equipment bag){
        if (bag != null){
            this.bag = (Bag) bag;
        }
    }
    
    public Bag getBag(){
        return this.bag;
    }
    
    public void setWeapon(Equipment e){ // Habilitar Equipamento e atualizar Status
        attackDamage = BaseAD + e.getAditionalAD();
        magicDamage = BaseMD + e.getAditionalMD();
        Weapon = e;
    }
    
    public void setRightHand(Equipment e){
        if(e == Weapon)
            return;
        attackDamage = BaseAD + e.getAditionalAD();
        magicDamage = BaseMD + e.getAditionalMD();
        R_Hand = e;
    }
    
    public void unequip(String parte){ // Tirar equipamento e atualizar Status
        if (parte.equals("Esquerda") && Weapon != null){
            Weapon.unequip();
            Weapon = null;
        }
        
        if (parte.equals("Armadura") && Armor != null){
            Armor.unequip();
            Armor = null;
        }
        
        if (parte.equals("Direita") && R_Hand != null){
            R_Hand.unequip();
            R_Hand = null;
        }
    }
    
    /**
     *
     * @param Gold
     * 
     * ADICIONA uma quantidade inteira de Gold à já adiquirida.
     */
    public void addGold(int Gold){
        this.Gold += Gold;
    }
    
    public int getGold(){
        return Gold;
    }
    
    public void initQuest(Quest q){
        if (q.getAcomplish())
            return;
        MainQuest = q;
    }
    
    public void finishQuest(){
        MainQuest.finishQuest();
        MainQuest = null;
    }
    
    
    
    
    
    
    
    
    
    
    
}
