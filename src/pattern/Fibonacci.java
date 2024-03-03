package pattern;

public class Fibonacci {
    public static void main(String[] args) {
        // 1,2,3,5,8,13
        int a= 1;
        int b = 2;
        int c;
        for (int i=3;i<=10;i++){
            c = a+b;
            System.out.println(c);
            a= b;
            b = c;

        }
    }
}
