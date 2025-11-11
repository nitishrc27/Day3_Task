package Day3_Tasks;

class Parent{
    void sum (int a,int b){
        System.out.println("Parent Sum = "+a+b);
    }
}
class Child extends Parent{
    @Override
    void sum (int a,int b){
        System.out.println("Child Sum = "+a+b);
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.sum(1,2);
    }
}
