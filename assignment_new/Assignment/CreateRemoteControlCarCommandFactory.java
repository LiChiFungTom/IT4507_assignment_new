import java.util.*;

public class CreateRemoteControlCarCommandFactory implements CommendFactory{
    
    private Scanner sc;
    private Vector product;
    //private Stack commands;

    public CreateRemoteControlCarCommandFactory(Vector product ,Scanner sc){
        this.sc = sc;
        //this.commands = commands;
        this.product = product;
    }


    public Commend createCommend(){
        return new CreateRemoteControlCarCommand(product,sc);
    }

}
