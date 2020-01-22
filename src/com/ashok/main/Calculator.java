package com.ashok.main;

import com.ashok.main.model.CalculatorModel;

import java.util.Scanner;

public class Calculator  {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        CalculatorModel model = new CalculatorModel (); /*CalculatorModel class is encapsulation.*/

        System.out.println("Enter first Number");
        model.setFirstNo(scanner.nextFloat());

        System.out.println("Enter second Number");
        model.setSecondNo(scanner.nextFloat());

        System.out.println("Enter operation (for additon type '+',for substraction type '-',for multiplication type '*' and for division type '/'");
        String operation = scanner.next();

        scanner.close();

        switch (operation){
            case "+":
                System.out.println(new Calculator().addition(model.getFirstNo(),model.getSecondNo()));
                break;
            case "-":
                System.out.println(new Calculator().substraction(model.getFirstNo(),model.getSecondNo()));
                break;
            case "*":
                System.out.println(new Calculator().multiplication(model.getFirstNo(),model.getSecondNo()));
                break;
            case "/":
                System.out.println(new Calculator().division(model.getFirstNo(),model.getSecondNo()));

            default:
                System.out.println("You have  enter wrong option for operation!");

        }
    }

    public float addition(float firstNo, float secondNo){ return firstNo + secondNo; }

    public float substraction(float firstNo, float secondNo){ return firstNo - secondNo; }

    public float multiplication(float firstNo, float secondNo){ return firstNo * secondNo; }

    public float division(float firstNo, float secondNo){ return firstNo / secondNo; }

}
