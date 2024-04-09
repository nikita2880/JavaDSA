public class BinarySearch {
    public static void main(String[] args)
    {
        // Binary search says:
        // arr needs to be sorted
        // first, find the middle element
        // second, select the relevant array left or right array and change start and end.
        // if mid ele == target, then answer is found
        // else check arr and again choose relevant array left or right

        int[] arr = {4,8,9,25,37,41,78,84,96};
        int target = 99;
        System.out.println("Found at : " + binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target)
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
