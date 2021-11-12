import java.util.*;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Vector product = new Vector();              // store product
        Stack commands = new Stack();               // store undo
        Stack redos = new Stack();                  // for the redo
      
        CommandFactory [] f = new CommandFactory[999];
        f['c'] = new CreateToyproductFactory(sc, product,commands);
        f['x'] = new ExitCommandFactory();
        f['d'] = new DisplaytoyFactory(product);
        f['p'] = new PurchaseToyProductCommandFactory(sc, product, commands);
        f['s'] = new SellToyProductCommandFactory(sc, product, commands);
        f['u'] = new UndoCommandFactory(commands, redos);
        f['r'] = new RedoCommandFactory(commands, redos);
        f['l'] = new UndoListCommandFactory(commands, redos, product);


     while(true){

        System.out.println();
        System.out.println("Toy Inventory Management System (TIMS)");
        System.out.println("Please enter command: [c | d | p | s | u | r | l | x]");
        System.out.println("c = create toy, d = display toy, p = purchase toy, s = sell toy, ");
        System.out.println("u = undo, r = redo, l = list undo/redo, x = exit system");
        System.out.println();
        String commend= sc.next(); //reads string.
        System.out.println();
        char commande;
        commande =  commend.charAt(0);
        Command c = f[commande].createCommend();
        c.execute(); 
        switch(commend){
           case "c":
            redos.clear();
        }

     } // end white

    }
}
