import java.util.*;

public class CreateToyproduct implements Command{
    
    private static ToyProductFactory rmf = new RemoteControlCarFactory();
    private static ToyProductFactory rof = new RobotFactory();
    private Scanner sc;
    private Vector product;
    private ToyProduct robot;
    private ToyProduct remote;
    private Stack commands;
    String toytype;

    public CreateToyproduct(Scanner sc, Vector product, Stack commands){
        this.sc = sc;
        this.product=product;
        this.commands =commands;
        remote = null;
        robot =null;
    }

    public void execute(){
        
        System.out.println("Enter toy type (ro=Robot/rc=Remote Control Car): ");
        toytype = sc.next();
        if(toytype.equals("rc")){
            ToyProduct c = rmf.createProduct(sc);
            product.add(c);
        }else{
            ToyProduct c = rof.createProduct(sc);
            product.add(c);
        }
        
    }

    public void undo(){
        
        if(product.isEmpty()){
            System.out.println("Noting to undo");
        }else{
            if(toytype.equals("rc")){
                product.remove(remote);
            }else{
                product.remove(robot);
            }
            
        }


    }

    public void redo(){
        if(product.isEmpty()){
            System.out.println("Noting to undo");
        }else{
            if(toytype.equals("rc")){
                product.add(remote);
            }else{
                product.add(robot);
            }
            
        }
    }

}
