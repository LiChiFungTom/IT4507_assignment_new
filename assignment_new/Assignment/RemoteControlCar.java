public class RemoteControlCar extends ToyProduct{
    
    private double maxSpeed;

    public RemoteControlCar(int productID , String name , double maxSpeed){
        super(productID , name);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"         "+getMaxSpeed()+"       "+super.getCost()+"     "+super.getPrice();
    }

}
