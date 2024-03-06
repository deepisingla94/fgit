package gitPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CheckDuplicatesInString {
    public static void main(String[] args) {
        String s = "Deeeppikka";

        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
           if (hs.contains(ch)==false){
               hs.add(ch);


           }


        }
        System.out.println(hs);
    }
}
