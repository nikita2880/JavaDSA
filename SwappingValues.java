import java.util.Arrays;

public class SwappingValues {
    public static void main(String[] args)
    {
        int[] arr= {1,3,2,85,90};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i1, int i2)
    {
        int temp= arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }
}
