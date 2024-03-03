package pattern;

public class Search {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6,7,8};
        int expected = 14;
        int left = 0;
        int right = a.length-1;
        while(left<right){
            int mid = (left +right)/2;
            if(a[mid]==expected){
                System.out.println("element found at loaction " + mid );
                break;


            } else if (a[mid]>expected) {
                right = mid-1;

            }
            else {
                left = mid+1;

            }


        }
        if(left>=right){
            System.out.println("element not found ");

        }

    }
}
