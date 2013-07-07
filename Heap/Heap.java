/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Heap;

/**
 *
 * @author Herat
 */
public class Heap {
    private int[] array;
    private int counter;
    Heap(int n) {
        array = new int[n];
        counter = -1;
    }
    void insert(int element) {
        counter++;
        array[counter] = element;
        int ind = counter;
        int tmp;
        while(ind > 0 && array[ind/2] < array[ind]) {
            tmp = array[ind/2];
            array[ind/2] = array[ind];
            array[ind] = tmp;
            ind = ind / 2;
        }
    }
    int deleteMax() {
        if(counter < 0) return -1;
        int tmp = array[0];
        array[0] = array[counter];
        array[counter] = tmp;
        counter--;
        int ind = 0;
        int nind,tmp1;
        while(ind <= counter) {
            nind = -1;
            if(array[ind] < array[ind*2+1] && ind*2+1 <= counter) 
                nind = ind*2+1;
            if(ind*2+2 <= counter && array[ind*2+2] > array[ind*2+1] && array[ind] < array[ind*2+2]) 
                nind = ind*2+2;
            if(nind == -1) break;
            tmp1 = array[ind];
            array[ind] = array[nind];
            array[nind] = tmp1;
            ind = nind;
        }
        return tmp;
    }
    void printHeap(int ind) {
        if(ind > counter || ind < 0)
            return;
        System.out.println(array[ind]);
        printHeap(2*ind + 1);
        printHeap(2*ind + 2);
    }
}
