
package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of columns:");
        int columns=sc.nextInt();
        System.out.println("enter number of columns:");
        int rows=sc.nextInt();
        int [][] numbers=new int [columns] [rows];
        
         System.out.println("enter numbers");
         for(int i=0;i<columns;i++){
          for(int j=0;j<rows;j++){
          numbers[i][j]=sc.nextInt();
          }    
    }
     System.out.println("the numbers are");
         for(int i=0;i<columns;i++){
          for(int j=0;j<rows;j++){
          System.out.println(numbers [i][j]);
          }    
    }  
         System.out.println();
    }
    
}
