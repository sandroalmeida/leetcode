package info.sandroalmeida.hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Check if the message words are present on magazine set.
* */
public class CheckMessage {

    // problem with this solution
    // I didn't consider the frequency of words
    public static boolean solution(String[] message, String[] magazine){
        Set<String> magazineSet = new HashSet<>();
        for(String s: magazine){
            magazineSet.add(s);
        }
        for(String s: message){
            if(!magazineSet.contains(s))
                return false;
        }
        return true;
    }

    //This solution not only consider the single words like the Set before
    //but how many times these words appears and if this quantity is enough for the message
    public static boolean solution2(String[] message, String[] magazine){
        Map<String, Integer> magazineFrequency = getFrequency(magazine);
        Map<String, Integer> messageFrequency = getFrequency(message);

        for(Map.Entry<String,Integer> entry: messageFrequency.entrySet()){
            Integer magazineValue = magazineFrequency.get(entry.getKey());
            if(magazineValue == null || entry.getValue() > magazineValue)
                return false;
        }
        return true;
    }

    public static Map<String, Integer> getFrequency(String[] input){
        Map<String, Integer> map = new HashMap<>();
        for(String s : input){
            if(map.containsKey(s))
                map.put(s, (map.get(s) + 1));
            else
                map.put(s, 1);
        }
        return map;
    }

    //This is an optimization on the solution 2, here we will use just one Hashmap
    public static boolean solution3(String[] message, String[] magazine) {
        Map<String, Integer> magazineFrequency = getFrequency(magazine);

        for(String s: message){
            Integer magazineValue = magazineFrequency.get(s);
            if(magazineValue == null)
                return false;
            else{
                if(magazineValue > 1)
                    magazineFrequency.put(s, (magazineValue - 1));
                else
                    magazineFrequency.remove(s);
            }
        }
        return true;
    }

}
