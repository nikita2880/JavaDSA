public class RichestCustomerWealth {
    public static void main(String[] args)
    {
        int[][] arr = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth( int[][] arr)
    {
        int sum =0;
        int max=0;
       
        for ( int row =0; row < arr.length; row++)
        {
            for (int col =0; col <arr[row].length; col++)
            {
                sum = sum + arr[row][col]; 
            }
            if (max< sum)
            {
                max= sum;
                
            }
            sum=0;
        }
        return max;
    }
}
