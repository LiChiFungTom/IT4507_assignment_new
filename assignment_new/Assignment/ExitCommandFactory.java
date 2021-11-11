public class ExitCommandFactory implements CommendFactory{
    
    public Commend createCommend(){
        return new ExitCommand();
    }

}
