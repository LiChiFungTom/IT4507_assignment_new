import java.util.*;

public class CreateRobotCommand implements Commend{
    
    private static ToyProductFactory tpf = new RobotFactory();
    private Scanner sc;
    private Vector product;

    public CreateRobotCommand(Vector product ,Scanner sc){
        this.sc = sc;
        this.product =product;
    }

    public void execute(){
        
        ToyProduct c = tpf.createProduct(sc);
        product.add(c);
    }

    public void undo(){

    }
   
    public void redo(){

    }

}
