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
        LinkedList head = new LinkedList();
        LinkedList n1 = new LinkedList(10, null);
        LinkedList n2 = new LinkedList(20, null);
        LinkedList n3 = new LinkedList(30, null);
        LinkedList n4 = new LinkedList(40, null);
        LinkedList n5 = new LinkedList(10, null);
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
