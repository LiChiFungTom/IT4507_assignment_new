import java.util.*;

public class CreateRobotCommandFactory implements CommendFactory{
    
    private Scanner sc;
    private Vector product;
    private Stack commands;

    public CreateRobotCommandFactory(Vector product,Scanner sc , Stack commands){
        this.sc = sc;
        this.product =product;
        this.commands = commands;    
    }

    public Commend createCommend(){
        Commend c = new CreateRobotCommand(product,sc);
        commands.push(c);    
        return c;
    }


}
