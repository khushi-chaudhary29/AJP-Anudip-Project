class Plane{
    void fly(){
        System.out.println(" Plane flying");
    }
}
class Cargoplane extends Plane{
    void fly(){
        System.out.println("The Cargo Plane is flying with high speed");
    }
}
class FighterPlane extends Plane{
    void fly(){
        System.out.println("The Fighter Plane is flying with very high speed");
    }
}

public class InheritanceEx{
    public static void main(String[] args){
        Cargoplane cp=new Cargoplane();
        FighterPlane fp=new FighterPlane();
        // cp.fly();
        // fp.fly();
        Plane ref;
        ref=cp;
        ref.fly();
        ref=fp;
        ref.fly();
    }
}