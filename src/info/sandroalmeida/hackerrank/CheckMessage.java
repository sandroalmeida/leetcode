package info.sandroalmeida.hackerrank;

import java.util.HashSet;
import java.util.Set;

/*
Check if the message words are present on magazine set.
* */
public class CheckMessage {

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
}
