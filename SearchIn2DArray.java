import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args)
    {
        int[][] arr = {
            {2,4},
            {18,6,15},
            {85,1,9}
        };
        int target = 9;
        int[] ans= search(arr, target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target)
    {
        for( int row=0; row<arr.length; row++)
        {
            for ( int col =0; col < arr[row]. length; col++)
            {
                if ( arr[row][col] == target)
                {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
