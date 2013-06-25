/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashtable;

/**
 *
 * @author Herat
 */
public class Operation {
   public static void main(String[] args) {
       Hashtable_Chaining ho = new Hashtable_Chaining();
       ho.put("abc", "sdfsf");
       ho.put("abc", "adsdadasd");
       ho.put("abcd", "wwww");
       //ho.delete("abc");
       System.out.println(ho.delete("abc"));
       System.out.println(ho.get("abc"));
       System.out.println(ho.get("abcd"));
   } 
}
