/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Herat
 */
public class DoubleLinkedList {
    int element;
    DoubleLinkedList next;
    DoubleLinkedList prev;

    public DoubleLinkedList() {
        element = 0;
        next = null;
        prev = null;
    }
    
    public DoubleLinkedList(int n) {
        this.element = n;
        this.next = null;
        this.prev = null;
    }
    
    boolean insertEnd(DoubleLinkedList head, DoubleLinkedList n) {
        DoubleLinkedList t = head;
        while(t.next != null) {
            t = t.next;
        }
        t.next = n;
        n.prev = t;
        return true; 
    }
    
    boolean insertBeg(DoubleLinkedList head, DoubleLinkedList n) {
        n.next = head.next;
        n.prev = head;
        head.next = n;
        return true;
    }
    
    boolean insertAfter(DoubleLinkedList head, int search, DoubleLinkedList n) {
        if(head.next == null)
            return false;
        DoubleLinkedList t = head.next;
        while(t != null && t.element != search) {
            t = t.next;
        }
        if(t == null)
            return false;
        n.next = t.next;
        n.prev = t;
        if(t.next != null)
            t.next.prev = n;
        t.next = n;
        return true;
    }
    
    boolean deleteFirst(DoubleLinkedList head, int element) {
        if(head.next == null) 
            return false;
        DoubleLinkedList t = head.next;
        DoubleLinkedList prev = head;
        while(t != null && t.element != element) {
            prev = t;
            t = t.next;
        }
        if(t == null)
            return false;
        prev.next = t.next;
        if(t.next != null)
            t.next.prev = prev;
        return true;
    }
    
    boolean deleteAll(DoubleLinkedList head, int element) {
        if(head.next == null) 
            return false;
        DoubleLinkedList t = head.next;
        DoubleLinkedList prev = head;
        boolean found = false;
        while(t != null) {
            if(t.element == element) {
                found = true;
                prev.next = t.next;
                if(t.next != null)
                    t.next.prev = prev;
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
    
    void printList(DoubleLinkedList head) {
        DoubleLinkedList t = head.next;
        while(t != null) { 
            System.out.print(t.element+" ");
            t = t.next;
        }
        System.out.println();
    }
}
