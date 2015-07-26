/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author yeswanth
 */
import java.util.*;
public class Insertion_sort {
    public void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int tobe=arr[i];
            for(int j=0;j<i;j++){
                if(tobe<arr[j]){
                    shift(arr,j,i);
                    arr[j]=tobe;
                    break;
                }
            }
           System.out.println("sorted array is "+Arrays.toString(arr)); 
        }
    }
    public void shift(int arr[],int start,int end){
        int temp=arr[start];
        for(int i=start+1;i<=end;i++){
            int t=arr[i];
            arr[i]=temp;
            temp=t;
        }
    }
    public static void main(String args[]){
        int arr[]={3,1,5,2,6,7,0};
        Insertion_sort i=new Insertion_sort();
        i.sort(arr);
        System.out.println("sorted array is "+Arrays.toString(arr));
    }
}
