import java.util.Vector;

import java.util.*;

public class Displaytoy implements Commend{
    
    private Vector product;
    
    public Displaytoy(Vector product){
        this.product=product;
    }
    
    public void execute(){
        
        for(int i=0; i< product.size();i++){
            ToyProduct t = (ToyProduct) product.elementAt(i);
            toy.doAction(t);
        }
        
        // ToyProduct = 
        //System.out.println("ID: " + ToyProduct.getProductID()); 


    }

    public void undo(){

    }

    public void redo(){

    }
}
