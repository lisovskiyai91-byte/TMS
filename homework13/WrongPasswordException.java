package TMSnew.homework7.TMS.homework13;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){
        super();
    }
    public WrongPasswordException(String message){
        super(message);
    }
}
