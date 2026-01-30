class Week1 {
//    Week1(){
//        System.out.println("this is constructor of week1");
//    }
    public void show(){
        System.out.println("this is class parent");
    }
}
class Monday extends  Week1{
//    Monday(){
//        super();
//    }
    public void show(){
        System.out.println("this is class child");
        //super.show();
    }
}
class Mondayhour1 extends  Monday{
    //    Monday(){
//        super();
//    }
    public void show(){
        System.out.println("this is class Mondayhour1");
        super.show();
    }
}

public class Inheritance{
    public static void main() {
        Week1 obj2= new Mondayhour1();
        obj2.show();



    }
}
