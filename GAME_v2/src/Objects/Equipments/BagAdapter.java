
package Objects.Equipments;

public class BagAdapter extends Equipment{
    
    private Bag bag;
    
    public BagAdapter(Bag bag, String name, int Cost){
        super(name,Cost);
        this.bag = bag;
    }
    
    public void GuardaNaMochila(Equipment e){
        bag.GuardaNaMochila(e);
    }
    
    
    
}
