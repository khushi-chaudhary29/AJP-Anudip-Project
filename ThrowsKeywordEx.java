import java.util.Scanner;

public class ThrowsKeywordEx{
    public static void fun() throws ArithmeticException{
            throw new ArithmeticException();
    }
    public static void main(String[] args){
        
        try{
            fun();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

    }
}