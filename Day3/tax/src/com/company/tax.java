package com.company;
import java.util.Scanner;
public class tax {
    Scanner sc=new Scanner(System.in);
    String empname, taxpercent;
    int edate,emonth,eyear,salary,annualSalary,age;
    float taxAmt;
    int cmonth=10, cdate=14, cyear=2020;
    public void getDetails(){
        System.out.println("Enter name: ");
        epname=sc.nextLine();
        System.out.println("Enter birth date: ");
        edate=sc.nextInt();
        System.out.println("Enter birth month: ");
        emonth=sc.nextInt();
        System.out.println("Enter birth year: ");
        eyear=sc.nextInt();
    }

    public void showDeatils(){
        annualSalary= salary*12;
        if(annualSalary>=500000){
            taxpercent="20%";
            taxAmt=(float) (annualSalary*0.2);
        }
        else if(annualSalary>=400000 && annualSalary<500000){
            taxpercent="15%";
            taxAmt=(float) (annualSalary*0.15);
        }
        else if (annualSalary>=300000 && annualSalary<400000){
            taxpercent="10%";
            taxAmt=-(float) (annualSalary*0.1);
        }
        else if(annualSalary>=200000 && annualSalary<300000){
            taxpercent="5%";
            taxAmt=(float) (annualSalary*0.05);
        }
        else{
            taxpercent="0%";
            taxAmt=annualSalary*0;
        }
        // age calculate

        if(emonth<cmonth){
            age=cyear-eyear;
        }
        else{
            if(cdate<edate || cmonth<emonth){
                age=cyear-eyear-1;
            }
            else {
                age=cyear-eyear;
            }
            System.out.println("employee name is:"+empname);
            System.out.println("employee age:"+age);
            System.out.println("annual salary is :"+annualSalary);
            System.out.println("tax percentage :"+taxpercent);
            System.out.println("tax Amount :"+taxAmt);

        }

    }

}
