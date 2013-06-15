/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Herat
 */
public class CircularLinkedList {
    int element;
    CircularLinkedList next;

    public CircularLinkedList() {
        element = 0;
        next = null;
    }
    
    public CircularLinkedList(int n,CircularLinkedList next) {
        this.element = n;
        this.next = next;
    }
    
    boolean insertEnd(CircularLinkedList head, CircularLinkedList n) {
        CircularLinkedList t = head;
        while(t.next != head) {
            t = t.next;
        }
        t.next = n;
        n.next = head;
        return true; 
    }
    
    boolean insertBeg(CircularLinkedList head, CircularLinkedList n) {
        n.next = head.next;
        head.next = n;
        return true;
    }
    
    boolean insertAfter(CircularLinkedList head, int search, CircularLinkedList n) {
        if(head.next == null)
            return false;
        CircularLinkedList t = head.next;
        while(t != head && t.element != search) {
            t = t.next;
        }
        if(t == head)
            return false;
        n.next = t.next;
        t.next = n;
        return true;
    }
    
    boolean deleteFirst(CircularLinkedList head, int element) {
        if(head.next == null) 
            return false;
        CircularLinkedList t = head.next;
        CircularLinkedList prev = head;
        while(t != head && t.element != element) {
            prev = t;
            t = t.next;
        }
        if(t == head)
            return false;
        prev.next = t.next;
        return true;
    }
    
    boolean deleteAll(CircularLinkedList head, int element) {
        if(head.next == null) 
            return false;
        CircularLinkedList t = head.next;
        CircularLinkedList prev = head;
        boolean found = false;
        while(t != head) {
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
    
    void printList(CircularLinkedList head) {
        CircularLinkedList t = head.next;
        while(t != head) { 
            System.out.print(t.element+" ");
            t = t.next;
        }
    }
}
