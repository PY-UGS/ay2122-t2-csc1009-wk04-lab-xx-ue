package com.company;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        BMI new_BMI =new BMI();
        Scanner input=new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double Weight=input.nextDouble();
        System.out.println("Enter height in inches: ");
        double Height=input.nextDouble();

        new_BMI.setHeight(Height);
        new_BMI.getHeight();
        new_BMI.setWeight(Weight);
        new_BMI.getWeight();
        System.out.println("BMI is: "+new_BMI.getIndex());
        System.out.println(new_BMI.getInterpretation(new_BMI.getIndex()));
    }
}
