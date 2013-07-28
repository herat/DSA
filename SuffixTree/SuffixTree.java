/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SuffixTree;

import java.util.*;
/**
 *
 * @author Herat
 */
public class SuffixTree {
    String value;
    ArrayList<SuffixTree> next;

    SuffixTree(String value) {
        this.value = value;
        next = new ArrayList<SuffixTree>();
    }
    
    String[] sort(String[] array) {
        String t;
        for(int i=0;i<array.length;i++) {
            for(int j=i+1;j<array.length;j++) {
                if(array[j].length() > array[i].length()) {
                    t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                }
            }
        }
        return array;
    }
    
    String[] suffixes(String s) {
        String[] array = new String[s.length()+1];
        int i = 0;
        for(i=0;i<s.length();i++) {
            array[i] = s.substring(i) + "$";
        }
        array[i] = "$";
        return sort(array);
    }
    
    String[] matchFind(String s1, String s2) {
        String[] result = new String[]{"","",""};
        int min = Math.min(s1.length(),s2.length());
        int i = 1;
        for(i=0;i<min;i++) {
            if(s1.charAt(i) == s2.charAt(i)) {
                result[0] += s1.charAt(i)+"";
            }
            else {
                break;
            }
        }
        for(int j=i;j<s1.length();j++)
            result[1] += s1.charAt(j)+"";
        for(int j=i;j<s2.length();j++)
            result[2] += s2.charAt(j)+"";
        return result;
    }
    
    void buildSuffixTree(String s) {
        String[] suffixes = suffixes(s);
        boolean match = false;
        SuffixTree node = this;
        
        for(String str : suffixes) {
            match = false;
            SuffixTree found = this;
            SuffixTree prev = this;
            String matched = "";
            for(SuffixTree t : node.next) {
                while(t.value.startsWith(str.substring(0, str.length()-1))) {
                    match = true;
                    prev = found;
                    found = t;
                    matched = matchFind(str, found.value)[0];
                    if(t.next.isEmpty())
                        break;
                    for(SuffixTree t1 : t.next) {
                        if(t1.value.startsWith(str.substring(0, str.length()-1))) {
                            match = true;
                            prev = found;
                            found = t1;
                            t = t1;
                            matched = matchFind(str, found.value)[0];
                            break;
                        }
                    }                   
                }
            }
            String ty = found.value;
            if(matched.length() > 0) {
                found.value = matched;
            }
            if(matchFind(str, ty)[1].length() > 0) {
                SuffixTree new_node1 = new SuffixTree(matchFind(str, ty)[1]);
                found.next.add(new_node1);
            }
            if(matchFind(str, ty)[2].length() > 0) {
                SuffixTree new_node2 = new SuffixTree(matchFind(str, ty)[2]);
                found.next.add(new_node2);
            }
        }
        this.next.add(new SuffixTree("$"));
    } 
    
    void buildGeneralizedSuffixTree(String[] array) {
        
    }
    
    static void printSuffixTree(SuffixTree head) {
        if(head == null)
            return;
        System.out.println(head.value);
        for(SuffixTree s: head.next) {
            printSuffixTree(s);
        }
    }
}
