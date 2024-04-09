// Floor is the greatest number that is smaller or equal to target number

public class FloorOfNumberBS {
    public static void main(String[] args)
    {
        int[] arr = {14,16,34,52,68,71,73,95,99};
        int target = 68;
        System.out.println(floorNumber(arr, target));
    }

    static int floorNumber( int[] arr, int target)
    {
        int start=0;
        int end= arr.length -1;
        if ( target > arr[arr.length-1])
        {
            return -1;
        }
        
        while (start <= end)
        {
            int mid = start + (end - start)/2;

            if ( target < arr[mid])
            {
                end = mid -1;
            }

            else if ( target > arr[ mid ])
            {
                start = mid +1;
            }

            else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
