/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Npc;

import Cards.Souls;

/**
 *
 * @author user
 */
public abstract class Npc {
    
    private String name;
    private double healthPoints;
    private int Level;
    private double AttackDamage;
    private double MagicDamage;
    private Souls soul;
    
    public Npc(String name, int level){
        this.name = name;
        this.Level = level;
    }

    // ---- SETTERS ----
    
    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setAttackDamage(double AttackDamage) {
        this.AttackDamage = AttackDamage;
    }

    public void setMagicDamage(double MagicDamage) {
        this.MagicDamage = MagicDamage;
    }

    public void setSoul(Souls soul) {
        this.soul = soul;
    }
    
    // ---- GETTERS ----
    
    public String getName() {
        return name;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public int getLevel() {
        return Level;
    }

    public double getAttackDamage() {
        return AttackDamage;
    }

    public double getMagicDamage() {
        return MagicDamage;
    }

    public Souls getSoul() {
        return soul;
    }
    
}
