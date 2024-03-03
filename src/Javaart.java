import java.util.Scanner;

public class Javaart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==1){
            System.out.println("weird");
        }

        if (a%2==0 && a>=2&&a<=5){
            System.out.println("not weird");
        }
    }

}
