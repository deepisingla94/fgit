package pattern;

import java.util.HashSet;

public class ArrayCheckDuplicate {
    public static void main(String[] args) {
        int a[] = {1,2,3,3,5};
        int i;
        HashSet<Integer> hs = new HashSet<>();
        for (i=0;i< a.length;i++){
            if(hs.add(a[i])==false){
                System.out.println("Contains Duplicate");
                break;

            }


        }
        if(i==a.length){
            System.out.println("No duplicate");

        }
    }
}
