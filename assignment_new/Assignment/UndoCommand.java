import java.util.*;

public class UndoCommand implements Command{
    
    private Stack commands;
    private Stack redos;

    public UndoCommand(Stack commands , Stack redos){
        this.commands = commands;
        this.redos = redos;
    }

    public void execute(){

        if(commands.empty()){
            System.out.println("Command is Empty!");
        }else{
            Command c = (Command) commands.pop();
            c.undo();
            redos.push(c);
            System.out.println("Undo completed");
        }

    }

    public void undo(){

    }

    public void redo(){

    }

}


