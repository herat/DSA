/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Herat
 */
public class Stack {
    String[] stack;
    int top;
    
    Stack(int elements) {
        stack = new String[elements];
        top = -1;
    }
    
    boolean push(String element) {
        if((top+1) >= stack.length) {
            String[] tmp = new String[stack.length];
            tmp = stack;
            stack = new String[stack.length * 2];
            for(int i=0;i<tmp.length;i++)
                stack[i] = tmp[i];
        }
        stack[top+1] = element;
        top++;
        return true;
    }
    
    String pop() {
        if(top == -1) {
            return null;
        } else {
            top--;
            return stack[top+1];
        }
    }
    
    String peek() {
        if(top == -1) {
            return null;
        } else {
            return stack[top];
        }
    }
}
