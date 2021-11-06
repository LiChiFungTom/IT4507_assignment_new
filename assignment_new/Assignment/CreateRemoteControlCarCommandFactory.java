import java.util.*;

public class CreateRemoteControlCarCommandFactory implements CommendFactory{
    
    private Scanner sc;
    private Vector product;
    private Stack commands;

    public CreateRemoteControlCarCommandFactory(Vector product ,Scanner sc , Stack commands){
        this.sc = sc;
        this.commands = commands;
        this.product = product;
    }


    public Commend createCommend(){
        Commend c = new CreateRemoteControlCarCommand(product,sc); 
        commands.push(c);
        return c;
    }

}
