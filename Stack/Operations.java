/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Herat
 */
public class Operations {
    public static void main(String[] args) {
        Stack s = new Stack(1);
        System.out.println(s.push("asd"));
        System.out.println(s.push("aasad"));
        System.out.println(s.peek()+ " " +s.top);
    }
}
