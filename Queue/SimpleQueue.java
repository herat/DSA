/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Herat
 */
public class SimpleQueue {
    String[] queue;
    int r,f;
    
    void printQueue() {
        for(int i=0;i<queue.length;i++) {
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    
    SimpleQueue(int capacity) {
        r = -1;
        f = -1;
        queue = new String[capacity];
    }
    
    boolean enqueue(String element) {
        if(r+1 >= queue.length) {
            String[] tmp = new String[queue.length];
            tmp = queue;
            queue = new String[queue.length * 2];
            for(int i=0;i<tmp.length;i++)
                queue[i] = tmp[i];
        }        
        queue[r+1] = element;
        r++;
        if(f == -1) {
            f++;
        }
        return true;
    }
    
    String dequeue() {
        if(f == -1) {
            return null;
        } else {
            if(r == f) {
                int t = f;
                r = -1;
                f = -1;
                return queue[t]; 
            } else {
                f++;
                return queue[f-1]; 
            }
        }
    }
}
