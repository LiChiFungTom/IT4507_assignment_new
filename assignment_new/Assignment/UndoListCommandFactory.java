import java.util.*;

public class UndoListCommandFactory implements CommandFactory{
    
    private Stack commands; 
    private Stack redos;
    private Vector product;

    public UndoListCommandFactory(Stack commands,Stack redos,Vector product){
        this.commands=commands;
        this.redos = redos;
        this.product=product;
    }

    public Command createCommend(){
        Command c = new UndoListCommand(commands, redos, product);
        return c;
    }
}
