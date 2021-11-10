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
            System.out.println("ID  "+"   Name  "+"      Quantity"+"    Other Info"+"  Cost "+" Price");
            for(int i=0; i< product.size();i++){
                ToyProduct t = (ToyProduct) product.elementAt(i);
                toy.doAction(t);
            }
        }else{
            Enumeration enu = product.elements();
            String []title = {"ID:","Name:","Quantity:","Height(cm):","Cost($):","Price($):"};
           
            for(int i=0;i<title.length;i++){
                while(enu.hasMoreElements()){
                  System.out.println(title[i]+enu.nextElement());    
               }
            }
           
            // System.out.println("ID: " +to.getProductID() ); // id
            // System.out.println("Name: " +to.getName()); // name
            // System.out.println("Quantity: " +to.getQty());  //qty
            // System.out.println("Height(cm): " +rb.getHeight());  // height
            // System.out.println("Cost($): " +to.getCost());    // cost
            // System.out.println("Price($): " +to.getPrice());  // price
        }
       
    

    }

    public void undo(){

    }

    public void redo(){

    }
}
