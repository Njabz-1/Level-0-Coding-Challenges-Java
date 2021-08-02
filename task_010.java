public class task_010 {
    
    public static void main(String[] args) {
        String input1 = "computers";
        String input2 = "house";
        printCommon(input1, input2);
    }
 
    static void printCommon(String input1, String input2)
    {
        int characters_max = 26;
        int[] array1 = new int[characters_max ];
        int[] array2 = new int[characters_max ];
 
        int length1 = input1.length();
        int length2 = input2.length();
 
        for (int i = 0 ; i < length1 ; i++)
        array1[input1.charAt(i) - 'a'] += 1;
 
        for (int i = 0 ; i < length2 ; i++)
        array2[input2.charAt(i) - 'a'] += 1;
 
        for (int i = 0 ; i < characters_max  ; i++)
        {
            if (array1[i] != 0 && array2[i] != 0)
            {

                for (int j = 0 ; j < Math.min(array1[i], array2[i]) ; j++)
                    System.out.print(((char)(i + 'a')));
            }
        }
    }
    
}
