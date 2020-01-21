package com.ashok.main.model;


/*This is encapsulation*/
public class CalculatorModel {
    private float firstNo;
    private float secondNo;

    public CalculatorModel() {
    }

    public CalculatorModel(float firstNo, float secondNo) {
        this.firstNo = firstNo;
        this.secondNo = secondNo;
    }

    public float getFirstNo() {
        return firstNo;
    }

    public void setFirstNo(float firstNo) {
        this.firstNo = firstNo;
    }

    public float getSecondNo() {
        return secondNo;
    }

    public void setSecondNo(float secondNo) {
        this.secondNo = secondNo;
    }
}
