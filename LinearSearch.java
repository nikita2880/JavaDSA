import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args)
    {
        int[] arr={15,47,72,6,90};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element to find.");
        int ele;
        ele= in.nextInt();
        boolean found=false;
        int index=0;

        for ( int i=0; i< arr.length; i++)
        {
            if (arr[i] == ele)
            {
                found = true;
                index= i;
                break;
            }
        }
        if (found)
        {
            System.out.println("Found at " + index + " index.");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
