import java.util.*;

public class CreateRobotCommand implements Commend{
    
    private static ToyProductFactory tpf = new RobotFactory();
    private Scanner sc;
    private Vector product;
    private ToyProduct robot;
    

    public CreateRobotCommand(Vector product ,Scanner sc ){ 
        this.sc = sc;
        this.product =product;
        robot =null;
    }

    public void execute(){
        
        ToyProduct c = tpf.createProduct(sc);
        product.add(c);
        
    }

    public void undo(){
        if(product.isEmpty()){
            System.out.println("Noting to undo");
        }else{
            product.remove(robot);
        }

    }
   
    public void redo(){
        if(product.isEmpty()){
            System.out.println("Noting to undo");
        }else{
            product.add(robot);
        }
    }

}
