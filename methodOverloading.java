package Day3_Tasks;

class Samp {
    void func() {
        System.out.println("Samp");
    }

    void func(int a,int b){
        System.out.println("Samp a="+a+" b="+b);
    }

    void func(char ch){
        System.out.println("Samp a="+ch);
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        Samp s = new Samp();
        s.func();
        s.func(10, 20);
        s.func('n');
    }
}
