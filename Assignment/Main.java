import java.util.*;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Toy Inventory Management System (TIMS)");
        System.out.println("Please enter command: [c | d | p | s | u | r | l | x]");
        System.out.println("c = create toy, d = display toy, p = purchase toy, s = sell toy, ");
        System.out.println("u = undo, r = redo, l = list undo/redo, x = exit system");
        System.out.println();
        

        String commend= sc.nextLine(); //reads string.
        // input part + loop

        // commend => c
        if(commend == "c"){
        System.out.println(commend);
        System.out.println("Enter toy type (ro=Robot/rc=Remote Control Car): ");
        String toytype = sc.nextLine();
            if(toytype == "ro"){
                System.out.println(toytype);
                System.out.println("Enter name");
                String name = sc.nextLine();
                System.out.println("Enter id");
                int id = sc.nextInt();
                System.out.println("Enter height(cm)");
                double height = sc.nextDouble();
                System.out.println(id+","+name+","+height);
                System.out.println("New toy product record created.");

            }else{
                System.out.println("Enter name");
                String name = sc.nextLine();
                System.out.println("Enter id");
                int id = sc.nextInt();
                System.out.println("maximum speed(km/hr)");
                double speed = sc.nextDouble();
                System.out.println(id+","+name+","+speed);
                System.out.println("New toy product record created.");
            }
        }else if(commend == "d"){
            System.out.println("Enter ID(* to display all)");
            int id = sc.nextInt();
            System.out.println("Toy product information");
            if(commend =="*"){
                System.out.println("ID    "+"name    "+"Quantity    "+"other Info   "+"Cost    "+"Price    ");      // all detail
                //information
            }else{
                System.out.println("ID: " ); // id
                System.out.println("Name: " ); // name
                System.out.println("Quantity: " );  //qty
                System.out.println("Height(cm): " );  // height
                System.out.println("Cost($): " );    // cost
                System.out.println("Price($): " );  // price
            }
            
        }else if(commend =="p"){
             System.out.println("Enter code:");
             int code = sc.nextInt();
             System.out.println("Quantity to purchased:");
             int qty =sc.nextInt();
             System.out.println("Purchasing cost:");
             int cost = sc.nextInt();
             System.out.println("Purchased"+qty+"Box of "+"name"+".Current quantity is $"+cost+".Price is $"+ToyProduct.price);
         }

    }
}
