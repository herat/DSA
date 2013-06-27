/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trie;

/**
 *
 * @author Herat
 */
public class Operations {
    public static void main(String[] args) {
        Trie head = new Trie('.', "");
        head.put("abc", "1");
        head.put("adf", "2");
        head.put("bbt", "3");
        head.put("abc", "4");
        
        System.out.println(Trie.get(head,"abc",0));
        System.out.println(Trie.get(head,"adf",0));
        System.out.println(Trie.get(head,"bbt",0));
        System.out.println(Trie.get(head,"t",0));
        
        Trie.printTrieDebug(head);
    }
}
