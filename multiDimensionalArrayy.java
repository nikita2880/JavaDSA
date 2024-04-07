import java.util.Arrays;
import java.util.Scanner;

public class multiDimensionalArrayy {
   public static void main(String[] args)
    {
        // int[][] arr = new int[3][]; //2-D array (an array of arrays)

       int[][] aurr = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };

        int[][] arr = new int[2][2];
        System.out.println("Hello");

        //Input
        Scanner in = new Scanner(System.in);

        for(int i=0; i< arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                arr[i][j]= in.nextInt();
            }
        }

        // Output
        /*for(int i=0; i< arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/

        /* for(int i=0; i< arr.length; i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }*/

        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }

    } 
}
