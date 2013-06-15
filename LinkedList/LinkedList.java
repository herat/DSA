/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Herat
 */
public class LinkedList {
    int element;
    LinkedList next;

    public LinkedList() {
        element = 0;
        next = null;
    }
    
    public LinkedList(int n,LinkedList next) {
        this.element = n;
        this.next = next;
    }
    
    boolean insertEnd(LinkedList head, LinkedList n) {
        LinkedList t = head;
        while(t.next != null) {
            t = t.next;
        }
        t.next = n;
        return true; 
    }
    
    boolean insertBeg(LinkedList head, LinkedList n) {
        n.next = head.next;
        head.next = n;
        return true;
    }
    
    boolean insertAfter(LinkedList head, int search, LinkedList n) {
        if(head.next == null)
            return false;
        LinkedList t = head.next;
        while(t != null && t.element != search) {
            t = t.next;
        }
        if(t == null)
            return false;
        n.next = t.next;
        t.next = n;
        return true;
    }
    
    boolean deleteFirst(LinkedList head, int element) {
        if(head.next == null) 
            return false;
        LinkedList t = head.next;
        LinkedList prev = head;
        while(t != null && t.element != element) {
            prev = t;
            t = t.next;
        }
        if(t == null)
            return false;
        prev.next = t.next;
        return true;
    }
    
    boolean deleteAll(LinkedList head, int element) {
        if(head.next == null) 
            return false;
        LinkedList t = head.next;
        LinkedList prev = head;
        boolean found = false;
        while(t != null) {
            if(t.element == element) {
                found = true;
                prev.next = t.next;
            } else {
                prev = t;
            }
            t = t.next;
        }
        if(found)
            return true;
        else 
            return false;
    }
    
    void printList(LinkedList head) {
        LinkedList t = head.next;
        while(t != null) { 
            System.out.print(t.element+" ");
            t = t.next;
        }
    }
}
