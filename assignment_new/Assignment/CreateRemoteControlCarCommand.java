import java.util.*;

public class CreateRemoteControlCarCommand implements Commend{
    
    private static ToyProductFactory tpf = new RemoteControlCarFactory();
    private Scanner sc;
    private Vector product;
    private ToyProduct remote;

    public CreateRemoteControlCarCommand(Vector product ,Scanner sc){
        this.sc = sc;
        this.product = product;
        remote = null;
    }

    public void execute(){

        ToyProduct c = tpf.createProduct(sc);
        product.add(c);

    }
    
    public void undo(){
        if(product.isEmpty()){
            System.out.println("Noting to undo");
        }else{
            product.remove(remote);
        }
    }
    
    
    public void redo(){
        if(product.isEmpty()){
            System.out.println("Noting to undo");
        }else{
            product.add(remote);
        }
    }

}
