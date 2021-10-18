/*
    Buuble Sort:Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.It's stable and inplace sorting algorithm.
*/

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args){
        int[] array = {60,50,30,80,100,20};
        bubbleSortAlgo(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSortAlgo(int[] array){
        boolean swapped;
        for(int i=0;i<array.length;i++){
            swapped = false;
            for(int j=1;j<array.length-i;j++){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    
}
