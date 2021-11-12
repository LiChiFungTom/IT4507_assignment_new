import java.util.*;

public class SellToyProductCommand implements Command{
    
    private Scanner sc;
    private Vector product;
    private Stack commands;

    public SellToyProductCommand(Scanner sc, Vector product ,Stack commands){
        this.product=product;
        this.sc=sc;
        this.commands = commands;
    }

    public void execute(){
        System.out.println("Enter code:");
        int code = sc.nextInt();
        System.out.println("Quantity to be sold:");
        int qty =sc.nextInt();
        System.out.println("Selling price:");
        double price =sc.nextDouble();

        if(product.size() >0){
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

        }else{
            System.out.println("noting to sell");
        }

        

    }
    
    
    
    public void undo(){

    }
    
    
    public void redo(){

    }

}
