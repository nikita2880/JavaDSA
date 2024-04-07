public class LinearSearchString {
    public static void main(String[] args)
    {
        String str = "Nikita";
        char target = 'i';
        System.out.println(search(str, target));

    }
    
    static boolean search(String str, char target)
    {
        if (str.length() == 0)
        {
            return false;
        }

        // for( int i=0; i< str.length(); i++)
        // {
        //     if (target ==  str.charAt(i))
        //     {
        //         return true;
        //     }
        // }

        // for each loop

        for( char ch : str.toCharArray())
        {
            if (ch == target)
            {
                return true;
            }
        }

        return false;
    }
}
