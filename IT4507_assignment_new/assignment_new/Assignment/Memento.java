import java.util.*;

public class Memento {

    private ToyProduct toyproduct;
    private double cost;
    private double price;
    private int qty;

    public Memento(ToyProduct toyProduct){
        this.toyproduct = toyProduct;
        this.cost = toyProduct.getCost();
        this.price=toyProduct.getPrice();
        this.qty=toyProduct.getQty();
    }

    public void restore(){
        //toyProduct.commands = this.commands;
        toyproduct.setCost(this.cost);
        toyproduct.setPrice(this.price);
        toyproduct.setQty(this.qty);

    }

    public ToyProduct getToyproduct(){
        return this.toyproduct;
    }

}
