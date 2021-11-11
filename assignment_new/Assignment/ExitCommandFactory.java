public class ExitCommandFactory implements CommandFactory{
    
    public Command createCommend(){
        return new ExitCommand();
    }

}
