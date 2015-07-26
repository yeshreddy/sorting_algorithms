/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;
/**
 *
 * @author yeswanth
 */
public class Selection_sort {
    
     public void sort(int arr[]){
         
        for(int i=0;i<arr.length;i++){
          int min=i;
          for(int j=i+1;j<arr.length;j++){
              if(arr[j]<arr[min])min=j;
          }
          int temp=arr[min];
          arr[min]=arr[i];
          arr[i]=temp;
        }
    }
}
