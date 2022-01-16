package HashMap;

import java.util.HashMap;

public class CountWords{
    // Write a Java Program to count the number of charactors in a word using HashMap.
    HashMap hashMap = new HashMap<Character,Integer>();
    public CountWords(String word){
        int count = 1;
        char[] array = word.toCharArray();
        for (int i = 0 ; i < word.length() ; i++){
            if (hashMap.containsKey(array[i])){
                hashMap.put(array[i], count++);
            }else{
                hashMap.put(array[i], 1);
            }
        }
            System.out.println(hashMap.entrySet());
    }
}