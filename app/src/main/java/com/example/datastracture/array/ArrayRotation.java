package com.example.datastracture.array;

import java.util.Scanner;

public class ArrayRotation {
  public static void main(String args[]){
    int []arr=new int[]{1,2,3,4,5,6,7};
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number to rotate array by d element");
    int d=scanner.nextInt();
    //case:1
    for (int i=0;i<d;i++)
      leftRotateByOne(arr);

    for (int i:arr) {
      System.out.print(""+i);
    }


  }

 static void leftRotateByOne(int arr[]){
    int i, temp;
    temp = arr[0];
    for (i = 0; i < arr.length - 1; i++)
      arr[i] = arr[i + 1];
    arr[i] = temp;
  }
}
