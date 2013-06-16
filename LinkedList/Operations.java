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
        CircularDoubleLinkedList head = new CircularDoubleLinkedList();
        head.next = head;
        head.prev = head;
        CircularDoubleLinkedList n1 = new CircularDoubleLinkedList(10);
        CircularDoubleLinkedList n2 = new CircularDoubleLinkedList(20);
        CircularDoubleLinkedList n3 = new CircularDoubleLinkedList(30);
        CircularDoubleLinkedList n4 = new CircularDoubleLinkedList(40);
        CircularDoubleLinkedList n5 = new CircularDoubleLinkedList(10);
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
