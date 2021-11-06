import java.util.*;

public class CreateRemoteControlCarCommand implements Commend{
    
    private static ToyProductFactory tpf = new RemoteControlCarFactory();
    private Scanner sc;
    private Vector product;

    public CreateRemoteControlCarCommand(Vector product ,Scanner sc){
        this.sc = sc;
        this.product = product;
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
