package Day3_Tasks;

import java.util.Scanner;

class Sample {
    void func1(String str, int... nums) {
        int no[] = new int[nums.length];
        System.out.println("String = "+str+ "\nIntegers Count = "+nums.length);
        for(int j=0;j<nums.length;j++){
            no[j] = nums[j];
            System.out.println("Nums = "+no[j]);
        }
    }

    void func2(char ch, Object... vars) {
        int len = vars.length;
        for(int j=0;j<len;j++){
            if(vars[j] instanceof String) {
                String str = (String)vars[j];
                System.out.println("Vars = "+str);
            }

            if(vars[j] instanceof Integer) {
                int ab = (Integer) vars[j];
                System.out.println("Vars = "+ab);
            }

            if(vars[j] instanceof Character) {
                char c = (Character) vars[j];
                System.out.println("Vars = "+c);
            }

            if(vars[j] instanceof Float) {
                float f = (Float) vars[j];
                System.out.println("Vars = "+f);
            }

//            else {
//                throw new IllegalArgumentException("...");
//            }
        }
    }
}

public class OptionalParameters {
    public static void main(String args[]){
        Sample s1 = new Sample();
        s1.func1("Nitish", 10, 20, 30);
        s1.func2('b', 10.23f, 50, 'n', "Hello");
    }
}

