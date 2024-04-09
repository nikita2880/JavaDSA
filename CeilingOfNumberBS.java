// Question : Ceiling of number: You are given a ascending order array.
// find ceiling of a given number. Ceiling: is smallest element in array greater or equal to targer.
// ARR= [4,6,7,9,12,46,85] target = 12 then ceiling is 46
// if target = 5 , ceiling is 7
// if target is 9, ceiling is 9


public class CeilingOfNumberBS {
    public static void main( String[] args)
    {
        int[] arr = { 4,8,21,52,65,88,89,95};
        int target = 92;
        System.out.println (ceilingNo(arr, target));
    }

    static int ceilingNo( int[] arr, int target)
    {
        int start=0;
        int end= arr.length -1;
        
        while ( start <= end)
        {
            int mid = start + (end - start)/2;
            if ( target < arr[mid])
            {
                end = mid -1;
            }

            else if ( target > arr[mid])
            {
                start = mid +1;
            }

            else {
                return arr[mid] ;
            }
        }
        return arr[start];
    }
}
