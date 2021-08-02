package com.example.bmicalculator;

public class BmI_Class {
    private static double bmi;
    private static double weight_kg;
    private static double height_m;
    private static String state;

    public String getState() {

        return state;
    }

    public  void setState(double bmi) {
        if (bmi<18.5){
            this.state="underweight";
        } else if (bmi>= 18.5 && bmi <= 24.9){
            this.state=" Healthy Weight";
        } else if (bmi>= 25 && bmi <= 29.9){
            this.state=" overweight";
        } else if (bmi>30){
            this.state=" obese";
        }
    }

    public double getBmi() {
        return bmi;
    }

    public double getWeight_kg() {
        return weight_kg;
    }

    public void setWeight_kg(double weight_kg, String unit) {
        //convert weight to KG
        if (unit.equals("Pounds")){
           this.weight_kg=weight_kg*0.45359237;
        }
        else{
            this.weight_kg = weight_kg;
        }

    }

    public double getHeight_m() {
        return height_m;
    }

    public void setHeight_m(double height_m, String unit) {

        //convert height to Meters
        if (unit.equals("Inches")){
            this.height_m=height_m*0.0254;
        }
        else if (unit.equals("Centimeters")){
            this.height_m=height_m/100;
        }
        else{
            this.height_m = height_m;
        }

    }

    public void setBmi(double weight, double height) {

        this.bmi=weight/(height*height);
    }
}
