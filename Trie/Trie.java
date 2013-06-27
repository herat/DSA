/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trie;

import java.util.*;
/**
 *
 * @author Herat
 */
public class Trie {
    char key_char;
    String value;
    ArrayList<Trie> next;
    
    Trie(char key_char, String value) {
        this.key_char = key_char;
        this.value = value;
        this.next = new ArrayList<Trie>();
    }
    
    void put(String key,String value) {
        int i = 0;
        ArrayList<Trie> tmp = this.next;
        ArrayList<Trie> tmp1 = this.next;
        Trie prev = this;
        boolean b = false;
        while(true) {
            b = false;
            for(Trie t : tmp) {
                if(t.key_char == key.charAt(i)) {
                    prev = t;
                    tmp1 = t.next;
                    i++;
                    b = true;
                    break;
                }
            }
            if(!b)
                break;
            tmp = tmp1;
        }
        if(i == key.length()) {
            prev.value = value;
            return;
        }
        for(int j=i;j<key.length();j++) {
            Trie new_node = new Trie(key.charAt(j), "");
            prev.next.add(new_node);
            prev = new_node;
        }
        prev.value = value;
    }
    
    static String get(Trie head, String key, int match) {
        if(head == null)
            return "-1";
        if(match == key.length() && !head.value.equals(""))
            return head.value;
        else if(match == key.length() && head.value.equals(""))
            return "-1";
        for(Trie t : head.next) {
            if(t.key_char == key.charAt(match)) {
                return get(t,key,match+1);
            } 
        }
        return "-1";
    }
    
    static void printTrieDebug(Trie t) {
        if(t == null)
            return;
        System.out.println("Key : "+t.key_char+" Value : "+t.value);
        for(Trie tmp : t.next) {
            printTrieDebug(tmp);
        }
    }
}
