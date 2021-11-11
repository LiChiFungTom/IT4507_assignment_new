import java.util.*;

public class CreateToyproductFactory implements CommandFactory{
    
    private Scanner sc;
    private Vector product;
    private Stack commands;
    
    public CreateToyproductFactory(Scanner sc, Vector product, Stack commands){
        this.sc=sc;
        this.product=product;
        this.commands=commands;

    }

    public Command createCommend(){
            Command c = new CreateToyproduct(sc,product,commands); 
            commands.push(c);
            return c;
    }

}
