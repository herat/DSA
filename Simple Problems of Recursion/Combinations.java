/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Herat
 */
public class Combinations {
    public static ArrayList<String> combine(String s) {
        if(s.length() == 1) {
            ArrayList<String> result = new ArrayList<String>();
            result.add(s);
            return result;
        }
        ArrayList<String> interm = new ArrayList<String>();
        interm = combine(s.substring(1));
        ArrayList<String> result = new ArrayList<String>();
        for(String ty : interm) {
            result.add(ty);
            result.add(s.charAt(0) + ty);
        }
        result.add(s.charAt(0)+"");
        return result;
    }
    public static void main(String [] args) {
        for(String s : combine("abcd")) {
            System.out.println(s);
        }
    }
}
