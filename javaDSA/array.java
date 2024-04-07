package javaDSA;
import java.util.*;
public class array {
    
    public static void main(String[] args)
    {
        // Array in java

        int[] arr = new int[5]; // Declaration of array and memory creation.(heap memory)
        int[] arr1={12,6,7};
        int arrrayy[] = new int[9]; // new is used to create an object in heap memory - dynamic memory allocation
        // another method

        int[] ros;  // declaration
        ros= new int[5]; // memory creation in heap memory
        String[] strngarr = new String[10];
        System.out.println(arr[1]);
        System.out.println(strngarr[4]);
        System.out.println(strngarr.length);

        //INPUT

        Scanner in = new Scanner(System.in);
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println(arr[2]);

        for(int num:arr){
            System.out.println(num + " ");
        }
    }
}
