public class MaxValueOfArray {
    public static void main(String[] args){
        int[] arr = {84,12,96,1,5};
        System.out.println(max(arr));
    }

    static int max(int[] arr)
    {
        int maxi=0;
        for(int i=0; i<arr.length; i++)
        {
            if( arr[i] > maxi)
            {
                maxi= arr[i];
            }
        }
        return maxi;
    }
}
