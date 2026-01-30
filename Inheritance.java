class Week1 {
    Week1(){
        System.out.println("this is constructor of week1");
    }
    public void show(){
        System.out.println("this is class parent");
    }
}
class Monday extends  Week1{
    Monday(){
        super();
    }
    public void show(){
        System.out.println("this is class child");
        super.show();
    }
}
public class Inheritance{
    public static void main() {
        Week1 obj2= new Monday();
        obj2.show();



    }
}
