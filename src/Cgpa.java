public class Cgpa {
    public static void main(String[] args) {
        int math = 77, hindi = 88, eng = 78;
        int sum = math+hindi+eng;
        double total = 300;
        double percent = sum/total*100;
        double cgpa = percent/10;
        System.out.println(cgpa);
    }
}
