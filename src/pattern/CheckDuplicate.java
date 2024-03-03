package pattern;

import java.util.HashSet;

public class CheckDuplicate {
    public static void main(String[] args) {
        String s = "Depika";
        int i;
        HashSet<Character>hs = new HashSet<>();
        for (i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hs.add(ch)==false){
                System.out.println("String contains duplicate");
                break;


            }


        }
        if(i==s.length()){
            System.out.println("No duplicate");

        }
    }
}
