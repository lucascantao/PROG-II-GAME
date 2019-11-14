
package Objects.Equipments;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Bag extends Equipment{
    
    LinkedList<Equipment> objects;
    private int MaxCapacity;
    private int FreeSlot;
    
    public Bag(String name, int cost){
        super(name, cost);
        MaxCapacity = 10;
    }
    
    public void GuardaNaMochila(Equipment e){
        if (FreeSlot > 0){
            objects.add(e);
            FreeSlot -= 1;
        }else{
            JOptionPane.showMessageDialog(null, "Espaço Insuficiente!");
        }
    }
    
    public void RemoveDaMochila(Equipment e){
        if (FreeSlot == MaxCapacity){
            JOptionPane.showMessageDialog(null, "Mochila Vazia.");
        }else{
            objects.remove(e);
            FreeSlot += 1;
        }
    }
    
    public int getMaxCapacity(){
        return MaxCapacity;
    }
    
}
