/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;

/**
 *
 * @author user
 */
public class MagicBook extends Equipament{
    
    public MagicBook(String name, int cost){
        super(name,cost);
        setMagicDamage(8);
    }
    
}
