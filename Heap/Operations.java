/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Heap;

/**
 *
 * @author Herat
 */
public class Operations {
    public static void main(String[] args) {
        Heap h = new Heap(10);
        h.insert(10);
        h.insert(20);
        h.insert(5);
        h.insert(30);
        h.insert(1);
        h.printHeap(0);
        System.out.println("---");
        System.out.println(h.deleteMax());
        System.out.println("---");
        h.printHeap(0);
        System.out.println("---");
        System.out.println(h.deleteMax());
        System.out.println("---");
        h.printHeap(0);
    }
}
