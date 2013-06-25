/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashtable;

/**
 *
 * @author Herat
 */

class LinkedListNode {
    String key;
    String value;
    LinkedListNode next;
}

public class Hashtable_Chaining {
    LinkedListNode[] array;

    public Hashtable_Chaining() {
        array = new LinkedListNode[50];
        for(int i=0;i<array.length;i++) {
            array[i] = new LinkedListNode();
            array[i].key = "-1";
            array[i].value = "-1";
            array[i].next = null;
        }
    }
    
    public Hashtable_Chaining(int capacity) {
        array = new LinkedListNode[capacity];
        for(int i=0;i<array.length;i++) {
            array[i] = new LinkedListNode();
            array[i].key = "-1";
            array[i].value = "-1";
            array[i].next = null;
        }
    }
    
    public int getIndex(String key) {
        return Math.abs(key.hashCode()%array.length);
    }
    
    public void put(String key, String value) {
        int index = getIndex(key);
        LinkedListNode new_node = new LinkedListNode();
        new_node.key = key;
        new_node.value = value;
        new_node.next = null;
        if(array[index].next == null) {
            array[index].next = new_node;
        } else {
            LinkedListNode t = array[index].next;
            while(t.next != null) t=t.next;
            t.next = new_node;
        }
    }
    
    public boolean delete(String key) {
        int index = getIndex(key);
        if(array[index].next == null) {
            return false;
        } else {
            LinkedListNode t = array[index].next;
            LinkedListNode p = array[index];
            while(t != null && t.value.equals(key)) {
                p = t;
                t=t.next;
            }
            if(t == null)
                return false;
            else {
                p.next = t.next;
                return true;
            }
        }
    }
    
    public String get(String key) {
        int index = getIndex(key);
        if(array[index].next == null) {
            return "-1";
        } else {
            LinkedListNode t = array[index].next;
            while(t != null && t.value.equals(key)) t=t.next;
            if(t == null)
                return "-1";
            else
                return t.value;
        }
    }
    
}
