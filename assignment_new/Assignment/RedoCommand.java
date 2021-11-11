import java.util.*;

public class RedoCommand implements Command{
    
    private Stack commands;
    private Stack redos;

    public RedoCommand(Stack commands , Stack redos){
        this.commands = commands;
        this.redos = redos;
    }


    public void execute(){
        
        if(redos.empty()){
            System.out.println("Noting can undo");
        }else{
            Command c = (Command) redos.pop();
            c.redo();
            commands.push(c);
            System.out.println("Redo completed");
        }
    }


    public void undo(){

    }


    public void redo(){

    }


}
