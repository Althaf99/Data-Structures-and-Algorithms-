package HashMap;

import java.util.HashMap;

// Write a Java Program to count the number of words in a string using HashMap.
public class CountWords2 {
    public CountWords2(String phrase){
        HashMap hashmap = new HashMap<String , Integer>();
        String[] splitPhrase = phrase.split(" ");
        int count = 1;
        for (int i = 0 ; i < splitPhrase.length ; i++){
            if (hashmap.containsKey(splitPhrase[i])){
                hashmap.put(splitPhrase[i], count++);
            }else{
                hashmap.put(splitPhrase[i], 1);
            }
        }
        System.out.println(hashmap.entrySet());
    }
}
