package gitPackage;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = new int[a.length];
        for (int i=0;i<a.length;i++){
            b[i] = a[a.length-1-i];


        }
        //printing array with inbuilt method
        System.out.println(Arrays.toString(b));

        //Printing array wth for loop
        for (int i=0;i<b.length;i++){
            System.out.print(b[i] +" ");

        }
    }
}
