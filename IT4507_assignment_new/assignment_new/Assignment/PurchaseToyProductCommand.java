import java.util.*;

public class PurchaseToyProductCommand implements Commend{

    private Scanner sc;
    private Vector product;

    public PurchaseToyProductCommand(Scanner sc,Vector product){
        this.product = product;
        this.sc=sc;
    }
    
    public void execute(){
        System.out.println("Enter code:");
        int code = sc.nextInt();
        System.out.println("Quantity to purchased:");
        int qty =sc.nextInt();
        System.out.println("Purchasing cost:");
        double cost = sc.nextDouble();

        if(code == 1001){
            Enumeration enu = product.elements();
            ToyProduct tp = (ToyProduct)enu.nextElement();
            tp.setQty(qty);
            tp.setCost(cost);
            System.out.println("Purchased"+tp.getQty()+" Box of "+tp.getName()+".Current quantity is $"+tp.getCost()+".Price is $"+tp.getPrice());
        }else{
            Enumeration enu = product.elements();
            
            ToyProduct tp = (ToyProduct)enu.nextElement();
            tp.setQty(qty); 
            tp.setCost(cost);
            System.out.println("Purchased"+tp.getQty()+" Box of "+tp.getName()+".Current quantity is $"+tp.getCost()+".Price is $"+tp.getPrice());

        }
    }


    public void undo(){


    }

    public void redo(){


    }


}
