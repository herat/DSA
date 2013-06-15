/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Herat
 */
public class DoubleEndedCircular {
    String[] queue;
    int r,f;
    
    void printQueue() {
        for(int i=0;i<queue.length;i++) {
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    
    DoubleEndedCircular(int capacity) {
        r = -1;
        f = -1;
        queue = new String[capacity];
    }
    
    boolean enqueueBack(String element) {
        if( (f == 0 && ((r+1) >= queue.length)) || (r < f && (r+1)%queue.length >= f)) {
            String[] tmp = new String[queue.length];
            tmp = queue;
            queue = new String[queue.length * 2];
            int i=0;
            while(i < tmp.length) {
                queue[i] = tmp[f];
                f++;
                f %= tmp.length;
                i++;
            }
            f = 0;
            r = tmp.length-1;
        }        
        queue[(r+1)%queue.length] = element;
        r++;
        r %= queue.length;
        if(f == -1) {
            f++;
        }
        return true;
    }
    
    boolean enqueueFront(String element) {
        if(f == -1) {
            return false;
        }
        f--;
        if(f < 0)
            f = queue.length-1;
        if( f <= r ) {
            f++;
            f %= queue.length;
            return false;
        }        
        queue[f] = element;
        if(r == -1) {
            r=f;
        }
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
                int pt = f;
                f++;
                f %= queue.length;
                return queue[pt]; 
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
                int pt = r;
                r--;
                if(r < 0)
                    r = queue.length-1;
                return queue[pt]; 
            }
        }
    }
}
