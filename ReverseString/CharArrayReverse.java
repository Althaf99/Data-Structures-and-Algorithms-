package ReverseString;

import java.util.Arrays;

public class CharArrayReverse {
    public CharArrayReverse(String text){
        char[] array = text.toCharArray();
        int length = text.length();
        int count = length-1;

        char[] textArray = new char[length];
        for (int i = 0 ; i < length ; i++){
            textArray[count] = array[i];
            count  = count -1;
        }
        
        System.out.print(Arrays.toString(textArray));
    }
}
