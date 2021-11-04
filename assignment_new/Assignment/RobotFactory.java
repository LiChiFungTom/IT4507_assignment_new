import java.util.*;

public class RobotFactory implements ToyProductFactory{

    //private Scanner sc;


    public ToyProduct createProduct(Scanner sc){
        System.out.println("Enter id");
        int id = sc.nextInt();
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter height(cm)");
        double height = sc.nextDouble();
        System.out.println(id+","+name+","+height);
        System.out.println("New toy product record created.");
        return new Robot(id, name,height);
    }
}
