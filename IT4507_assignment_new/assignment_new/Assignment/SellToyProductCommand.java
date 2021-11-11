import java.util.*;

public class SellToyProductCommand implements Commend{
    
    private Scanner sc;
    private Vector product;

    public SellToyProductCommand(Scanner sc, Vector product){
        this.product=product;
        this.sc=sc;
    }

    public void execute(){
        System.out.println("Enter code:");
        int code = sc.nextInt();
        System.out.println("Quantity to be sold:");
        int qty =sc.nextInt();
        System.out.println("Selling price:");
        double price =sc.nextDouble();

        if(code == 1001){
            Enumeration enu = product.elements();
            ToyProduct tp = (ToyProduct)enu.nextElement();
            if( qty<tp.getQty() ){
                System.out.println("Invalid quantity (current quantity < selling quantity).");
            }else{     
                tp.setQty(qty);
                tp.setPrice(price);
                System.out.println("Sold "+qty+"boxes of "+tp.getName()+".Current quantity is "+tp.getQty()+" Selling price is $"+tp.getPrice());
            }
        }else{
            Enumeration enu = product.elements();
            ToyProduct tp = (ToyProduct)enu.nextElement();
            tp.setQty(qty); 
            tp.setPrice(price);
            System.out.println("Sold "+ qty+"boxes of "+tp.getName()+".Current quantity is "+tp.getQty()+" Selling price is $"+tp.getPrice());
        }

    }
    
    
    
    public void undo(){

    }
    
    
    public void redo(){

    }

}
