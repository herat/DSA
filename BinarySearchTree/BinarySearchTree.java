/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author Herat
 */
public class BinarySearchTree {
    int data;
    BinarySearchTree left;
    BinarySearchTree right;

    public BinarySearchTree() {
        data = 0;
        left = null;
        right = null;
    }
    
    public BinarySearchTree(int value) {
        data = value;
        left = null;
        right = null;
    }
    
    void insert(BinarySearchTree node, BinarySearchTree root) {
        BinarySearchTree t = root;
        BinarySearchTree prev = root;
        while(true) {
            prev = t;
            if(t.data > node.data) {
                t = t.left;
                if(t == null) {
                    prev.left = node;
                    break;
                }
            } else {
                t = t.right;
                if(t == null) {
                    prev.right = node;
                    break;
                }
            }
        }
    }
    
    BinarySearchTree search(int key, BinarySearchTree node) {
       if(node == null)
           return null;
       else if(node.data == key)
           return node;
       else if(node.data > key)
           return search(key, node.left);
       else
           return search(key, node.right);
    }
    
    boolean delete(int node, BinarySearchTree root) {
        BinarySearchTree prev = root;
        BinarySearchTree t = root;
        while((t != null) && (t.data != node)) {
            prev = t;
            if(t.data > node) {
                t = t.left;
            } else {
                t = t.right;
            }
        }
        if(t == null)
            return false;
        if(t.left == null && t.right == null) {
            if(prev.equals(t)) {
               prev = null;
               t = null;
               return true;
            }
            if(prev.left.data == node) {
                prev.left = null;
            } else {
                prev.right = null;
            }
        } else if(t.left == null || t.right == null) {
            if(prev.left.data == node) {
                if(t.left != null) {
                    prev.left = t.left;
                } else {
                    prev.left = t.right;
                }
            } else {
                if(t.left != null) {
                    prev.right = t.left;
                } else {
                    prev.right = t.right;
                }
            }
        } else {
            BinarySearchTree min = t.right;
            BinarySearchTree minPrev = prev;
            while(min.left != null) {
                minPrev = min;
                min = min.left;
            }
            if(!minPrev.equals(t)) {
                if(min.right == null)
                    minPrev.left = null;
                else
                    minPrev.left = min.right;
            } else {
                t.right = null;
            }
            t.data = min.data;
        }
        return true;
    }
    
    void inOrder(BinarySearchTree node) {
        if(node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    
}
