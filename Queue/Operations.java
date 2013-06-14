/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Herat
 */
public class Operations {
    public static void main(String[] args) {
        CircularQueue s = new CircularQueue(2);
        System.out.println(s.dequeue() + " " + s.r + " " + s.f);
        s.enqueue("adsad");
        s.enqueue("dfsdfsd");
        s.enqueue("dsf");
        System.out.println(s.dequeue() + " " + s.r + " " + s.f);
        s.printQueue();
    }
}
