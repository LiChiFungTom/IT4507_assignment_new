import java.util.*;

public class Caretaker {
    
    private Stack undoList;
    private Stack redoList;

    public Caretaker(){
        undoList = new Stack();
        redoList = new Stack();
    }

    public void saveToyProduct(ToyProduct toyProduct){
        undoList.push(new Memento(toyProduct));
    }

    public void undo(){
        if(undoList.size()!=0){
            Memento m =(Memento) undoList.pop();
            redoList.push(m);
            m.restore();
            System.out.println(m.getToyproduct().getCost() + m.getToyproduct().getPrice()+ m.getToyproduct().getQty());
        
        }else{
            System.out.println("nothing to undo");
        }
    }

    public void redo(){
        if(redoList.size()!=0){
            Memento m = (Memento) redoList.pop();
            undoList.push(m);
            m.restore();
            System.out.println( m.getToyproduct().getCost() + m.getToyproduct().getPrice()+ m.getToyproduct().getQty() );
        }else{
            System.out.println("nothing to redo");
        }
    }

}
