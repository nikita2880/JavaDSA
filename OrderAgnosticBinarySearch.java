import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args)
    {
        // if arr is given in descending order
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the values of array.");
        for ( int i =0; i< arr.length; i++)
        {
            arr[i]= in.nextInt();
        }

        System.out.println("Enter the target value.");
        int target = in.nextInt();
        int start =0;
        int end= arr.length-1;
        if ( arr[start] < arr[end])
        {
            System.out.println( "Ascending: Found at : " + ascBS(arr, target) );
        }

        else{
            System.out.println( "Descending: Found at : " +descBS(arr, target));
        }
    }

    // First check the array is in ascending or descending order by checking first and last
    

    static int descBS( int[] arr, int target )
    {
        int start =0; 
        int end = arr.length-1;

        while( start < end)
        {
            int mid = start + ( end - start) /2;

            if ( target > arr[mid])
            {
                end = mid -1;
            }

            else if ( target < arr[mid])
            {
                start = mid + 1;
            }

            else 
            {
                return mid;
            }
        }
        return -1;

    }
    static int ascBS(int[] arr, int target)
    {

        int start =0 ;
        int end = arr.length -1;
        int mid; 

        while ( start <= end)
        {
            mid = start + (end - start) / 2; 
            if ( target < arr[mid])
            {
                end = mid-1;
            }

            else if ( target > arr[mid])
            {
                start= mid +1;
            }
            else {
                return mid ;
            }
        }

        return -1;
    }
}
