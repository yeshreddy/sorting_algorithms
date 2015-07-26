/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import insertionsort.Insertion_sort;
import java.util.Arrays;
import selectionsort.Selection_sort;

/**
 *
 * @author yeswanth
 */
public class Test {
    public static void main(String args[]){
        int arr[]={3,1,5,2,6,7,0};
        Selection_sort s=new Selection_sort();
        //Insertion_sort i=new Insertion_sort();
        s.sort(arr);
        System.out.println("sorted array is "+Arrays.toString(arr));
    }
}
