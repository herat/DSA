/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author Herat
 */
public class Operations {
    public static void main(String[] args) {
        BinarySearchTree root = new BinarySearchTree(20);
        BinarySearchTree n1 = new BinarySearchTree(10);
        BinarySearchTree n5 = new BinarySearchTree(1);
        BinarySearchTree n4 = new BinarySearchTree(2);
        BinarySearchTree n3 = new BinarySearchTree(7);
        BinarySearchTree n2 = new BinarySearchTree(30);
        root.insert(n2, root);
        root.insert(n1, root);
        root.insert(n4, root);
        root.insert(n5, root);
        root.insert(n3, root);
        root.inOrder(root);
        root.delete(20, root);
        System.out.println();
        root.inOrder(root);
        System.out.println("\nSearching 20:" + root.search(20, root).data);
    }
}
