package gitPackage;

public class SecondLargest {
    public static void main(String[] args) {
        int a[] = {6,9,4,5,8,3};
        int max1 = a[0];
        int max2 = a[0];
        for (int i=1;i<a.length;i++ ){
            if (a[i]>max1){
                max2 = max1;
                max1 = a[i];



            }
           else if(a[i]<max1&&a[i]>max2){
                max2 = a[i];


            }


        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
