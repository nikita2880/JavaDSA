import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        // Intialized

        for(int i=0; i<2; i++)
        {
            list.add(new ArrayList<>());
        }

        // input
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
    
}
