/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SuffixTree;

/**
 *
 * @author Herat
 */
public class Operations {
    public static void main(String[] args) {
        SuffixTree h = new SuffixTree("");
        h.buildSuffixTree("xyzxyz");
        SuffixTree.printSuffixTree(h);
    }
}
