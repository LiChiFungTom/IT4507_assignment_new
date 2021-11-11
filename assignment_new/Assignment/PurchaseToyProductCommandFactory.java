import java.util.*;

public class PurchaseToyProductCommandFactory{
    

    public ToyProduct createProduct(Scanner sc){
            
            System.out.println("Enter code:");
            int code = sc.nextInt();
            System.out.println("Quantity to purchased:");
            int qty =sc.nextInt();
            System.out.println("Purchasing cost:");
            int cost = sc.nextInt();
            //tp.setQty(qty);
           // tp.setCost(cost);

          //  String str = "Sold "+ tp.getProductID()+"boxes of "+tp.getName()  +".Current quantity is "+ tp.getQty() +" Price is $"+ tp.getPrice();
            return null;


    }

}
