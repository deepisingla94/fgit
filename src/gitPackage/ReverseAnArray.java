package gitPackage;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            b[b.length-i-1] = a[i];



        }
        System.out.println(Arrays.toString(b));
    }
}
