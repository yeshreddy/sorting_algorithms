/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author yeswanth
 */
public class Bubble_sort {
    public void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int bubble=0;
            for(int j=1;j<arr.length-i;j++){
                if(arr[bubble]>arr[j]){
                    int temp=arr[bubble];
                    arr[bubble]=arr[j];
                    arr[j]=temp;
                }
                bubble=j;
            }
        }
    }    
}
