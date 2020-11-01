package com.company;

public class array {
    int [] arr= new int[] {1,2,3,4,5};

    public void getDetails(){
        System.out.println("Elements of given array present on odd position:");
        for(int i=0;i<arr.length;i=i+2){
            System.out.println(arr[i]);
        }
    }

}

