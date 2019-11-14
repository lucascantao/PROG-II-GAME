///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Npc;
//import Objects.Classes.Character;
///**
// *
// * @author soldgear
// */
//public class Drake extends NPC{
//    
//    private double rath;
//    private String drakeID = "DR";
//    private static int count = 0;
//    
//    public Drake(String name, int level) {
//        super(name, level);
//        rath = 0.05;
//        setHealthPoints(60 + (level*5));
//        setMagicDamage(7);
//        setAttackDamage(2);
//        setAttackSpeed(1.0);
//        
//        count += 1;
//        drakeID += count; // GERA O ID DO NPC
//    }
//
//    @Override
//    public void attack(Character enemy) {
//        double damage = getAttackDamage() + getLevel() + (enemy.getHealthPoints() * getRath());
//        enemy.setHealthPoints(enemy.getHealthPoints() - damage); 
//        if (enemy.getHealthPoints() <= 0)
//            this.setExperience(enemy.getBounty());
//        rath += 0.05;
//    }
//    
//    
//
//    public double getRath() {
//        return rath;
//    }
//
////    @Override
////    public double getEnemyBounty() {
////        return 12.5;
////    }
//    
//}
