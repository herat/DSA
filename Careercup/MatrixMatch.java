/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Careercup;

import java.util.*;
/**
 *
 * @author Herat
 */
public class MatrixMatch {
    static void partition(int []a, int size) {
        int pivot = a[0];
        int left, right;
        int tmp;
        for(left = 1, right = size-1; left < size && right > 0 && left < right; )
        {
            if(a[left] >= pivot && a[right] < pivot)
            {
                tmp = a[left];
                a[left] = a[right];
                a[right] = tmp;
                //swap(left, right, a);
            }
            if(a[left] < pivot) left++;
            if(a[right] >= pivot) right--;
        }
        tmp = pivot;
        a[0] = a[right];
        a[right] = tmp;
        for(int i : a) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] ary = new int[]{8,2,5,13,8,19,12,6,3,11,10,7,9};
        partition(ary,ary.length);
    }
}
