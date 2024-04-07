public class MaxValueInARange {
    public static void main(String[] args)
    {
        int[] arr={1,54,84,65,22,3};
        System.out.println(max(arr,1,4));
    }

    static int max(int[] arr, int i1, int i2)
    {
        if (i2 > i1)
        {
            return -1;
        }
        
        int maxval= arr[0];
        for( int i= i1; i<=i2; i++)
        {
            if( arr[i] > maxval)
            {
                maxval=arr[i];
            }
        }
        return maxval;
    }
}
