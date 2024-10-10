class Emp{
    int eid;
    String ename;
    public Emp(int eid, String ename){
        super();
        this.eid=eid;
        this.ename = ename;
    }
    public String toString(){
        return "eid = "+eid+", ename "+ename;
    }
}


public class ToStringEx{
    public static void main(String[] args){
        Emp e=new Emp(1,"Khushi");
        System.out.println(e);
    }
}