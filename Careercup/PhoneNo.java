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
public class PhoneNo {
    static Hashtable<String,String[]> map;
    static ArrayList<String> permutations(String no) {
        ArrayList<String> result = new ArrayList<>();
        if(no.length() == 1) {
            for(String s : map.get(no)) {
                result.add(s);
            }
            return result;
        }
        for(String s : map.get(no.charAt(0)+"")) {
            for(String t : permutations(no.substring(1))) {
                result.add(s+t);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        map = new Hashtable<>();
        map.put("2", new String[] {"A","B","C"});
        map.put("3", new String[] {"D","E","F"});
        map.put("4", new String[] {"G","H","I"});
        map.put("5", new String[] {"J","K","L"});
        map.put("6", new String[] {"M","N","O"});
        map.put("7", new String[] {"P","R","S"});
        map.put("8", new String[] {"T","U","V"});
        map.put("9", new String[] {"W","X","Y"});
                
        /*for(String s : permutations("6273793687")) {
            System.out.println(s);
        }*/
        ArrayList<Object> a = new ArrayList<Object>();
    	a.add(2);
    	a.add(3.3);
    	a.add("Hi");
    	System.out.print(a.get(0) +"  " + a.get(1) + "  " + a.get(2));
    }
}
