package pattern;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Duplicate {
    public static void main(String[] args) {
        String s = "deepika";
       LinkedHashSet <Character> hs = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hs.add(ch);


        }
        System.out.println(hs);
        String result = "";
        for(char c: hs){
result = result + c;

        }
        System.out.println(result);
    }
}
