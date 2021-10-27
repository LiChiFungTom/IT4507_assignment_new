public class ToyProduct {

    private int productID;
    private String name;
    private int qty;
    private double cost;
    private double price;

    
    public ToyProduct(int productID , String name){
        this.productID = productID;
        this.name = name;
    }

    public int getProductID(){
        return productID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public double getCost(){
        return cost;
    }

    public void setCost(double cost){
        this.cost=cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        // TODO Auto-generated method stub
        return toString();
    }

}
