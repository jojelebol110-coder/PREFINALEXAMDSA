/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlayerRankingSystem;

/**
 *
 * @author Computer Lab 3
 */
public class QuickSort {
    static void displayArray(int[] arr) {
        for (int number : arr){
            System.out.println(number + " ");
        }
        System.out.println();
    }
    static int partition(int[] arr, int left, int rigth) {
        int pivot = arr[right];
        
        System.out.println("\nPivot: " + pivot );
        int i = left - 1;
        for (int j = left; j < rigth; j++) {
            System.out.println("Comparing " + arr[j] + " and " + pivot + ". .");
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                System.out.println("Noving " + arr[i] + "to the left");
                
                System.out.println("Current List: ");
                displayArray(arr);
            }
        }
    }
}
