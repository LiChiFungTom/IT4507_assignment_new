import java.util.*;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String pname="";                            // if id == name return product name
        Vector product = new Vector();              // store product
        Stack commands = new Stack();               // store undo
        Stack redos = new Stack();                  // for the redo

        String commend;    
     while(true){
        System.out.println();
        System.out.println("Toy Inventory Management System (TIMS)");
        System.out.println("Please enter command: [c | d | p | s | u | r | l | x]");
        System.out.println("c = create toy, d = display toy, p = purchase toy, s = sell toy, ");
        System.out.println("u = undo, r = redo, l = list undo/redo, x = exit system");
        System.out.println();
        commend= sc.next(); //reads string.
        System.out.println();
        
        // input part + loop
        // commend => c 

        if(commend.equals("c" ) ){
            System.out.println("Enter toy type (ro=Robot/rc=Remote Control Car): ");
            String toytype = sc.next();
            if(toytype.equals("rc")){
                Commend c = new CreateRemoteControlCarCommand(product,sc);
                c.execute();
                
            }else{
                Commend c = new CreateRobotCommand(product,sc);
                c.execute();
                
            }
            
        }else if(commend.equals("d")){
                Commend c = new Displaytoy(product);
                c.execute();
        }
        
        
        else if(commend.equals("p")){
            Commend c = new PurchaseToyProductCommand(sc,product);
            c.execute();
            
        }
        
        
        
        else if(commend.equals("s") ){
           Commend c = new SellToyProductCommand(sc, product);
           c.execute();
           
        }
        
        else if(commend.equals("l")){
           // list of undo list
           Commend c = new UndoListCommand(commands,redos,product);
           c.execute();
           
        
           // list of redo list
        }
        
        else if(commend.equals("u")){
          Commend c = new UndoCommand(commands,redos);
          c.execute();
          //undo execute
          commands.add(c);
        }
        
        else if(commend.equals("r")){
            //redo execite
            Commend c = new RedoCommand(commands, redos);
            c.execute();
            redos.add(c);
        }
        
        
        else if(commend.equals("x" ) ){
           Commend c = new ExitCommand();
           c.execute();
        }

     } // end white

    }
}
