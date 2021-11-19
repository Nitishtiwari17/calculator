package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Double num1,num2;
        Scanner Scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        num1=Scanner.nextDouble();
        System.out.println("enter the second number");
        num2=Scanner.nextDouble();
        System.out.println("enter the opertor('+','-','*','/'):");
        char operator=Scanner.next().charAt(0);

        Scanner.close();
        Double output;
        switch (operator){
            case '+':
                output=num1+num2;
                break;
            case '-':
                output=num1-num2;
                break;
            case '*':
                output=num1*num2;
                break;
            case '/':
                output=num1/num2;
                break;
            default:
                System.out.println("you have entered wrong operator");
                return;
        }
        System.out.println(num1+" "+operator+" "+num2+": "+output);

	// write your code here
    }
}
