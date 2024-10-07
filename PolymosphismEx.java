import java.util.*;

class Ab{
    int a=5;
}
//specialized can not be accessed
class Ab1 extends Ab{
    int a=10;
}

public class PolymorphismEx{
    public static void main(String[] args){
        Ab1 ob = new Ab1();
        // ob.show(); //shows error
    }
}