public class Chapter2practiceset {
    public static void main(String[] args) {
        //float a = 7/4.0f * 9/2.0f;
       // System.out.println(a);
        //problem 2
        char number = 'B';
        char grade = (char) (number + 8) ;
        System.out.println(grade);
        //decrypting
        char grad = (char) (grade-8);
        System.out.println(grad);
        //v*v-u*u/2as
        int v = 5, u = 3, a = 1, s = 2;
        System.out.println((v*v-u*u)/(2*a*s));
    }
}
