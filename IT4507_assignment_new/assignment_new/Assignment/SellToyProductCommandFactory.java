import java.util.*;

public class SellToyProductCommandFactory implements CommandFactory{
    
    private Scanner sc;
    private Vector product;
    private Stack commands;

    public SellToyProductCommandFactory(Scanner sc, Vector product ,Stack commands){
        this.product=product;
        this.sc=sc;
        this.commands = commands;
    }

    public Command createCommend(){
        Command c = new SellToyProductCommand(sc, product, commands);
        commands.push(c);
        return c;
    }

}
