import java.util.*;

public class CreateToyproductFactory implements CommendFactory{
    
    private Scanner sc;
    private Vector product;
    private Stack commands;
    
    public CreateToyproductFactory(Scanner sc, Vector product, Stack commands){
        this.sc=sc;
        this.product=product;
        this.commands=commands;

    }

    public Commend createCommend(){

        return null;

    }

}
