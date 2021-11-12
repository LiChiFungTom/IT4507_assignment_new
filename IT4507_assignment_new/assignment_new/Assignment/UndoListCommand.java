import java.util.*;

public class UndoListCommand implements Command{

    private Stack commands;
    private Stack redos;
    private Vector product;

    public UndoListCommand(Stack commands,Stack redos,Vector product){
        this.commands=commands;
        this.redos = redos;
        this.product=product;
    }

    public void execute(){
        System.out.println("Undo List:");
        
        if(commands.empty()){
            System.out.println("Empty");
        }else{
            Command c = (Command) commands.pop();
            if(c.equals(c)){
                System.out.println("Create "+c);    
            }
        }
        
        System.out.println("Redo List:");
        if(redos.isEmpty()){
            System.out.println("Empty");
        }else{
            Command c = (Command) redos.pop();
            System.out.println(c+"");
        }
        
        

    }


    public void undo(){

    }


    public void redo(){

    }

    
}
