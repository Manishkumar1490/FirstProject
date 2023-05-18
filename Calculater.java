 import java .util.*;
 import java.util.Scanner;
 public class Calculater {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1= sc.nextDouble();
        System.out.println("Enter the second number");
        double num2 = sc.nextDouble();
        System.out.println("Enter the operater(+,-,*,/,%)");
        char operater = sc.next().charAt(0);
        
        switch(operater){
            case '+':
                 System.out.println("Add is = "+(num1+num2));
                 break;
            case '-':
                 System.out.println("substraction is = "+(num1-num2));
                 break;
            case '*':
                 System.out.println("Multiply is = "+(num1*num2));
                 break;
            case '/':
                 System.out.println("Division is = "+(num1/num2));
                 break;
            case '%':
                 System.out.println("Reminder is = "+(num1%num2));
                 break;
            default:
                 System.out.println("Enter the invalid operater");
                
        }   
    }
    
}
