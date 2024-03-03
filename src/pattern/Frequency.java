package pattern;

import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        String s = "Deepika";
        int i;
        HashMap<Character,Integer> hm = new HashMap<>();
        for (i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)==false){
                hm.put(ch,1);


            }
            else {
                int count = hm.get(ch);
                count++;
                hm.put(ch,count);

            }


        }
        System.out.println(hm);
        for (char c: hm.keySet()){
            System.out.println(c + " " +hm.get(c));
        }
    }
}
