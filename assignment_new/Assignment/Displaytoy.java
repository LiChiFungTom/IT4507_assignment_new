import java.util.Vector;

import java.util.*;

public class Displaytoy implements Commend{
    
    private Scanner sc = new Scanner(System.in);
    private Vector product;
    
    public Displaytoy(Vector product){
        this.product=product;
    }
    
    public void execute(){
        System.out.println("Enter ID(* to display all)");
        String id = sc.next();
        System.out.println("Toy product information");

        if(id.equals("*")){
            for(int i=0; i< product.size();i++){
                ToyProduct t = (ToyProduct) product.elementAt(i);
                toy.doAction(t);
            }
        }else{
            Robot rb = new Robot(product);
            System.out.println("ID: " +rb.getProductID() ); // id
            System.out.println("Name: " +rb.getName()); // name
            System.out.println("Quantity: " +rb.getQty());  //qty
            System.out.println("Height(cm): " +rb.getHeight());  // height
            System.out.println("Cost($): " +rb.getCost());    // cost
            System.out.println("Price($): " +rb.getPrice());  // price
        }
       
    

    }

    public void undo(){

    }

    public void redo(){

    }
}
