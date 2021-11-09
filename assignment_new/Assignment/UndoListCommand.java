import java.util.*;

public class UndoListCommand implements Commend{

    private Stack commands;
    private Stack redos;

    public UndoListCommand(Stack commands,Stack redos){
        this.commands=commands;
        this.redos = redos;
    }

    public void execute(){
        System.out.println("Undo List:");
        //Object s =  (Commend)commands.peek();
        while(!commands.empty()){
        Commend c = (Commend) commands.pop();
        System.out.println(c+" ");
        //commands.push(s);
        }
        System.out.println("Redo List:");
        while(!redos.empty()){
            Commend c = (Commend) redos.pop();
            System.out.println(c+"");
        }

    }


    public void undo(){

    }


    public void redo(){

    }

    
}
