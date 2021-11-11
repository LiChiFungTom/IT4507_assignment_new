import java.util.*;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Vector product = new Vector();              // store product
        Stack commands = new Stack();               // store undo
        Stack redos = new Stack();                  // for the redo
      
        
     while(true){
        System.out.println();
        System.out.println("Toy Inventory Management System (TIMS)");
        System.out.println("Please enter command: [c | d | p | s | u | r | l | x]");
        System.out.println("c = create toy, d = display toy, p = purchase toy, s = sell toy, ");
        System.out.println("u = undo, r = redo, l = list undo/redo, x = exit system");
        System.out.println();
        String commend= sc.next(); //reads string.
        System.out.println();
        
        if(commend.equals("c" ) ){
            
            
                Command c = new CreateToyproduct(sc, product,commands);
                c.execute();
           
            
        }else if(commend.equals("d")){
                Command c = new Displaytoy(product);
                c.execute();
        }
        
        
        else if(commend.equals("p")){
            Command c = new PurchaseToyProductCommand(sc,product,commands);
            c.execute();
            
        }
        
        
        
        else if(commend.equals("s") ){
           Command c = new SellToyProductCommand(sc, product,commands);
           c.execute();
           
        }
        
        else if(commend.equals("l")){
           
           Command c = new UndoListCommand(commands,redos,product);
           c.execute();
           
        
       
        }
        
        else if(commend.equals("u")){
          Command c = new UndoCommand(commands,redos);
          c.execute();
          
          commands.add(c);
        }
        
        else if(commend.equals("r")){
            //redo execite
            Command c = new RedoCommand(commands, redos);
            c.execute();
            redos.add(c);
        }
        
        
        else if(commend.equals("x" ) ){
           Command c = new ExitCommand();
           c.execute();
        }

     } // end white

    }
}
