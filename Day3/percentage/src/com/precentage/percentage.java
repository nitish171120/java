package com.precentage;
import java.util.Scanner;
public class percentage {
    Scanner sc = new Scanner(System.in);
    int maths;
    int english;
    int sst;
    int hindi;
    int science;

    public void getDetails(){
        System.out.println("Enter Marks of Mathematics: ");
        maths=sc.nextInt();

        System.out.println("Enter marks of english: ");
        english=sc.nextInt();

        System.out.println("Enter marks of sst: ");
        sst = sc.nextInt();

        System.out.println("Enter marks of hindi: ");
        hindi = sc.nextInt();

        System.out.println("Enter marks of science: ");
        science = sc.nextInt();
    }

    public void grade(){

        float percentage;
        int totalMarks= maths+english+sst+hindi+science;
        double fraction;
        percentage= (float) (totalMarks*0.2);
        String grade;

        if (percentage<=100 && percentage>=90){
            grade="A";
        }
        else if(percentage>=80 && percentage<90){
            grade="B";
        }
        else if (percentage>=70 && percentage<80){
            grade="C";
        }
        else if (percentage>=60 && percentage<70){
            grade="D";
        }
        else if (percentage>=50 && percentage<60){
            grade="E";
        }
        else {
            grade="you need lot of hard work";
        }
        System.out.println("your total marks: "+totalMarks);
        System.out.println("your percentage: "+percentage);
        System.out.println("Grade: "+grade);
    }
}
