/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Scanner;



/**
 *
 * @author Student
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the capacity of the array");
        int num = sc.nextInt();
        int A[] = new int [num];
        System.out.println("Enter the Elements");
        for(int i=0;i<num;i++)
        {
            A[i]=sc.nextInt();
        }
        
        for(int j=0;j<=num;j++)
        {
            
            for(int k=j+1;k<num;k++)
            {
               int min_in=j;
               if(A[k]<A[min_in])
                    min_in=k;                
                
                int temp = A[min_in];
                A[min_in] = A[j];
                A[j] = temp;
                
            }
        }
        System.out.println("List after Selection Sort:");
        for (int l=0; l<num;l++){
            System.out.println(A[l]+" ");
        System.out.println();
    }
    }
    
    }
