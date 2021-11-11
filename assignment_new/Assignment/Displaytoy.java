import java.util.*;

public class Displaytoy implements Command{
    
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
            Robot t = (Robot) enu.nextElement();
            System.out.println("ID: "+t.getProductID());
            System.out.println("Name: "+t.getName());
            System.out.println("Quantity "+t.getQty());
            System.out.println("Height(cm): "+ t.getHeight());
            System.out.println("Cost($): "+t.getCost());
            System.out.println("Price($): "+t.getPrice());
               
        }
       
    

    }

    public void undo(){

    }

    public void redo(){

    }
}
