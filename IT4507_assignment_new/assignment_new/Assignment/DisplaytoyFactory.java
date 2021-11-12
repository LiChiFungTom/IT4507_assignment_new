import java.util.*;

public class DisplaytoyFactory implements CommandFactory{
    
    private Scanner sc = new Scanner(System.in);
    private Vector product;

    public DisplaytoyFactory(Vector product){
        this.product=product;

    }

    public Command createCommend(){
        Command c = new Displaytoy(product);
        return c;
    }
}
