public class Robot extends ToyProduct{
    private double height;

    public Robot(int productID,String name){ //,double height
        super(productID , name);
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
        return super.toString();
    }

}
