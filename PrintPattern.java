public class PrintPattern {
    public static void main(String[] args) {
        char ch = '*';

        for (int j=0;j<5;j++){
            if (j == 4) {
                for(int k=0;k<5;k++){
                    System.out.print(ch+" ");
                }
            }
            System.out.println(ch);
        }
    }
}
