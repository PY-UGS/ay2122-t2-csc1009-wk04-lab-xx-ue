package com.company;

public class BMI {
    private double weight;
    private double height;
    private static double poundTokg=0.45359237;
    private static  double inchTocm=0.0254;



    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public String getInterpretation(double Index){
        if (Index<18.5) {
            return "Underweight";
        }
        else if (Index<25.0){
            return "Normal";
        }
        else if(Index<30.0){
            return "Overweight";
        }
        else{
            return "Obese";
        }
    }
    public double getIndex(){
        double index=0;
        index=weight*poundTokg/((height*inchTocm)*(height*inchTocm));
        return index;
    }
}
