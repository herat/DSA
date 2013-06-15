/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Herat
 */
public class DoubleEnded {
    String[] queue;
    int r,f;
    
    void printQueue() {
        for(int i=0;i<queue.length;i++) {
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    
    DoubleEnded(int capacity) {
        r = -1;
        f = -1;
        queue = new String[capacity];
    }
    
    boolean enqueueBack(String element) {
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
    
    boolean enqueueFront(String element) {
        if(f-1 < 0)
            return false;
        queue[f-1] = element;
        f++;
        return true;
    }
    
    String dequeueFront() {
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
    
    String dequeueBack() {
        if(r == -1) {
            return null;
        } else {
            if(r == f) {
                int t = f;
                r = -1;
                f = -1;
                return queue[t]; 
            } else {
                int t = r;
                r--;
                if(r < 0)
                    r = queue.length - 1;
                return queue[t]; 
            }
        }
    }
}
