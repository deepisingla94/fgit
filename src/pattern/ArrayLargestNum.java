package pattern;

import java.util.Arrays;

public class ArrayLargestNum {
    public static void main(String[] args) {
     int[][] a = {{1,2,3},{2,4,5}};
     int[][] b= {{3,2,5},{1,3,9}};
     int[][] c= new int[a.length][a[0].length];
     for(int i=0;i<a.length;i++){
         for(int j=0;j<a[0].length;j++){
            c[i][j]= a[i][j]+ b[i][j];



         }





     }
        for(int i=0;i<c.length;i++){
            System.out.println( Arrays.toString(c[i]));



        }
    }


        }


