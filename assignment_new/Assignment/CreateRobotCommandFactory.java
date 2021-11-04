import java.util.*;

public class CreateRobotCommandFactory implements CommendFactory{
    
    private Scanner sc;
    private Vector product;


    public CreateRobotCommandFactory(Vector product,Scanner sc){
        this.sc = sc;
        this.product =product;
    }

    public Commend createCommend(){
        return new CreateRobotCommand(product,sc);
    }


}
