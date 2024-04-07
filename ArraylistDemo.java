import java.util.ArrayList;
import java.util.Scanner;
public class ArraylistDemo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>();

        // Addition
        list.add(10);
        list.add(4);

        // contain funtion
        System.out.println(list.contains(70));
        
        // set function
        list.set(0,99);

        // remove index
        list.remove(1);

        System.out.println(list);

        // input
        for(int i=0; i<5; i++)
        {
            list.add(in.nextInt());
        }

        System.out.println(list);

        // output 
        for(int j=0; j<5; j++)
        {
            System.out.println(list.get(j));
        }
        
    }
}
