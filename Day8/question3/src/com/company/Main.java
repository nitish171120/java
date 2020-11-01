package com.company;

public class Main {

    public static void main(String[] args) {
        account obj[] = new account[2] ;
        obj[0] = new account();
        obj[1] = new account();
        obj[0].setData(1,2);
        obj[1].setData(3,4);
        System.out.println("For Array Element 0");
        obj[0].showData();
        System.out.println("For Array Element 1");
        obj[1].showData();

    }
}
