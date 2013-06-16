/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Herat
 */
public class CircularDoubleLinkedList {
    int element;
    CircularDoubleLinkedList next;
    CircularDoubleLinkedList prev;

    public CircularDoubleLinkedList() {
        element = 0;
        next = null;
        prev = null;
    }
    
    public CircularDoubleLinkedList(int n) {
        this.element = n;
    }
    
    boolean insertEnd(CircularDoubleLinkedList head, CircularDoubleLinkedList n) {
        CircularDoubleLinkedList t = head.prev;
        t.next = n;
        n.next = head;
        head.prev = n;
        return true; 
    }
    
    boolean insertBeg(CircularDoubleLinkedList head, CircularDoubleLinkedList n) {
        n.next = head.next;
        head.next = n;
        n.prev = head;
        return true;
    }
    
    boolean insertAfter(CircularDoubleLinkedList head, int search, CircularDoubleLinkedList n) {
        if(head.next == null)
            return false;
        CircularDoubleLinkedList t = head.next;
        while(t != head && t.element != search) {
            t = t.next;
        }
        if(t == head)
            return false;
        n.next = t.next;
        n.prev = t;
        if(t.next != null)
            t.next.prev = n;
        t.next = n;
        return true;
    }
    
    boolean deleteFirst(CircularDoubleLinkedList head, int element) {
        if(head.next == null) 
            return false;
        CircularDoubleLinkedList t = head.next;
        CircularDoubleLinkedList prev = head;
        while(t != head && t.element != element) {
            prev = t;
            t = t.next;
        }
        if(t == head)
            return false;
        prev.next = t.next;
        if(t.next != null)
            t.next.prev = prev;
        return true;
    }
    
    boolean deleteAll(CircularDoubleLinkedList head, int element) {
        if(head.next == null) 
            return false;
        CircularDoubleLinkedList t = head.next;
        CircularDoubleLinkedList prev = head;
        boolean found = false;
        while(t != head) {
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
    
    void printList(CircularDoubleLinkedList head) {
        CircularDoubleLinkedList t = head.next;
        while(t != head) { 
            System.out.print(t.element+" ");
            t = t.next;
        }
        System.out.println();
    }
}
