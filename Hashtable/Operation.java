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
       Hashtable_LinearProbling ho = new Hashtable_LinearProbling(3);
       ho.put("abc", "sdfsf");
       ho.put("abc", "adsdadasd");
       System.out.println(ho.get("abc"));
       System.out.println(ho.get("abc"));
       ho.debugPrintWholeArray();
       ho.delete("abc");
       ho.debugPrintWholeArray();
   } 
}
