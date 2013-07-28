/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Careercup;
import java.util.*;
/**
 *
 * @author Herat
 */
public class FacebookInterview {
    static boolean match(char[] pattern, char[] string,int i,int j,ArrayList<Character> expected) {
        if(string.length == 0 && pattern.length != 0)
            return false;
        if(j >= string.length) {
            for(int g = 0;g < expected.size();g += 2) {
                if(!((g+1) < expected.size() && expected.get(g+1) == '*'))
                    return false;
            }
            return true;
        }
        if(i < pattern.length) {
            expected.add(pattern[i]);
            i++;
            while(i < pattern.length) {
                if(pattern[i] == '*') {
                    i++;
                    expected.add(pattern[i-1]);
                    if(i < pattern.length) {
                        expected.add(pattern[i]);
                        i++;
                    }
                } else if(pattern[i] != '*') {
                    break;
                }                    
            }
        }
        if(expected.contains(string[j])) {
            int ind = expected.indexOf(string[j]);
            
            if((ind-1) >= 0) {
                if(ind - 1 <= 0)
                    return false;
                int h = 1;
                while(h <= ind-1) {
                    if(expected.get(h) != '*')
                        return false;
                    h += 2;
                }                 
            }            
            if(!((ind+1) < expected.size() && expected.get(ind+1) == '*')) {
                for(int d = 0;d <= ind;d++)
                    expected.remove(0); 
            } else {
                for(int d = 0;d <= ind-1;d++)
                    expected.remove(0);
            }
            return match(pattern, string, i, ++j, expected);
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(match("a*bbbc*".toCharArray(), 
                "abbb".toCharArray(),
                0,0, new ArrayList<Character>()));
    }
}
