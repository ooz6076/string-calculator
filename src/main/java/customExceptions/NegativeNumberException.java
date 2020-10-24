package customExceptions;

public class NegativeNumberException extends Exception{

    private int num;

    public NegativeNumberException(int num){
        this.num = num;
    }

    public String toString(){
        return "Negative Number not allowed: " + num;
    }
}
