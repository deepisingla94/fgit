package gitPackage;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "Deepika";
        String result = "";
        for (int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            result = result + ch;


        }
        System.out.println(result);
    }
}
