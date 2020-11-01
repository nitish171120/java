package com.company;

public class sum {
    int[] array={10,20,30,40,50};
    int sum=0;
    public void getDetails(){
        for (int num: array){
            sum=sum+num;
        }
        System.out.println("Sum of array elements is:"+sum);
    }
}
