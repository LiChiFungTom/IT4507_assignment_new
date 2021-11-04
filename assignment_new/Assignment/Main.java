import java.util.*;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String pname="";                            // if id == name return product name
        Vector product = new Vector();              // store product
        Stack commands = new Stack();               // store command
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
                commands.push(c);
            }else{
                Commend c = new CreateRobotCommand(product,sc);
                c.execute();
                commands.push(c);
            }
        }else if(commend.equals("d")){
            System.out.println("Enter ID(* to display all)");
            String id = sc.next();
            System.out.println("Toy product information");
            if(id.equals("*") ){
                //System.out.println("ID    "+"name    "+"Quantity    "+"other Info   "+"Cost    "+"Price    ");      // all detail
                //information
                Commend c = new Displaytoy(product);
                c.execute();

            }else{
                System.out.println("ID: " ); // id
                System.out.println("Name: " ); // name
                System.out.println("Quantity: " );  //qty
                System.out.println("Height(cm): " );  // height
                System.out.println("Cost($): " );    // cost
                System.out.println("Price($): " );  // price

                // create a new class for dispaly single product

            }
            
        }else if(commend.equals("p")){
            System.out.println("Enter code:");
            int code = sc.nextInt();
            System.out.println("Quantity to purchased:");
            int qty =sc.nextInt();
            System.out.println("Purchasing cost:");
            int cost = sc.nextInt();
            System.out.println("Purchased"+qty+"Box of "+pname+".Current quantity is $"+cost+".Price is $"); // + ToyProduct.price
        }else if(commend.equals("s") ){
           System.out.println("Enter code:");
           int code = sc.nextInt();
           System.out.println("Quantity to be sold:");
           int qty =sc.nextInt();
           System.out.println("Selling price:");
           int price =sc.nextInt();
           System.out.println("Sold "+ qty+"boxes of "+pname+".Current quantity is "+qty+" Selling price is $"+price);
        }else if(commend.equals("l")){
           System.out.println("Undo List:");
           // list of undo list
           
           System.out.println("Redo List:");
           // list of redo list
        }else if(commend.equals("u")){
          Commend c = new UndoCommand(commands,redos);
          c.execute();
          //undo execute
        }else if(commend.equals("r")){
            //redo execite
            Commend c = new RedoCommand(commands, redos);
            c.execute();

        }else if(commend.equals("x" ) ){
           Commend c = new ExitCommand();
           c.execute();
        }

     } // end white

    }
}
