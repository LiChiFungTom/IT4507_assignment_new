import java.util.*;

public class PurchaseToyProductCommandFactory implements CommandFactory{
    
    private Scanner sc;
    private Vector product;
    private Stack commands;

    public PurchaseToyProductCommandFactory(Scanner sc , Vector product,Stack commands){
        this.sc =sc;
        this.product =product;
        this.commands =commands;
    }

    public Command createCommend(){
        Command c = new PurchaseToyProductCommand(sc, product,commands);
        commands.push(c);
        return c;
    }
}
