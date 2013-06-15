/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Herat
 */
public class Operations {
    public static void main(String[] args) {
        CircularLinkedList head = new CircularLinkedList();
        head.next = head;
        CircularLinkedList n1 = new CircularLinkedList(10, null);
        CircularLinkedList n2 = new CircularLinkedList(20, null);
        CircularLinkedList n3 = new CircularLinkedList(30, null);
        CircularLinkedList n4 = new CircularLinkedList(40, null);
        CircularLinkedList n5 = new CircularLinkedList(10, null);
        head.insertEnd(head, n1);
        head.insertEnd(head, n2);
        head.insertAfter(head,10,n3);
        head.insertEnd(head, n4);
        head.insertAfter(head,30, n5);
        head.printList(head);
        head.deleteAll(head, 10);
        head.printList(head);
    }
}
