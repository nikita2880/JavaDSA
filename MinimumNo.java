public class MinimumNo {
    public static void main(String[] args)
    {
        int[] arr = {4,8,1,5,62};
        System.out.println(min(arr));

    }

    static int min(int[] arr)
    {
        int minval = arr[0];

        for (int i=1; i< arr.length; i++)
        {
            if (arr[i] < minval)
            {
                minval = arr[i];
            }
        }
        return minval;
    }
}
