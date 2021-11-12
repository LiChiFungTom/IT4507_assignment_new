import java.util.*;

public class Robot extends ToyProduct{
    private double height;
    private Vector product;

    public Robot(Vector product){
        this.product =product;
    }


    public Robot(int productID,String name,double height){ 
        super(productID , name);
        this.height=height;
    }

   

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"         "+getHeight()+"cm"+"       "+super.getCost()+"     "+super.getPrice();
    }

}
