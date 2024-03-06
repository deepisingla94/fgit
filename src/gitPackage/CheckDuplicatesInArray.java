package gitPackage;

import java.util.LinkedHashSet;

public class CheckDuplicatesInArray {
    public static void main(String[] args) {
        int a[] = {1,2,2,3,5,5,3,7,6};
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        for (int i=0;i<a.length;i++){
            if (hs.contains(a[i])==false){
                hs.add(a[i]);



            }


        }
        System.out.println(hs);
    }
}
