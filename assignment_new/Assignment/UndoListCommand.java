import java.util.*;

public class UndoListCommand implements Commend{

    private Stack commands;

    public UndoListCommand(Stack commands){
        this.commands=commands;
    }

    public void execute(){
        System.out.println("Undo List:");
        //Object s =  (Commend)commands.peek();
        while(!commands.empty()){
        Commend c = (Commend) commands.pop();
        System.out.println(c+" ");
        //commands.push(s);
        }
    }


    public void undo(){

    }


    public void redo(){

    }

    
}
