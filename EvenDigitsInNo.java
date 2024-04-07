import java.util.Arrays;

public class EvenDigitsInNo {
    public static void main(String[] args)
    {
        int[] nums= {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums)
    {
        int count = 0;
        for( int num:nums){
            if (even(num))
            {
                count++;
            }
        }
        return count;
    }

    /*static boolean even(int num)
    {
        if (nums<0)
        {
            num = num * -1;
        }
        int digits=0;
        while (num >0)
        {
            digits++;
            num = num/10;
        }

        if (digits %2 == 0)
        {
            return true;
        }
        else return false;
    } */

    static boolean even(int num)
    {
        
        int digits = (Integer.toString(num).length());
        if ( digits%2 == 0)
        {
            return true;
        }

        else return false;
    }
}

// To get no of digits - Shortcut

// return (int)(Math.log10(num))+1;
