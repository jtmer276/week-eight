/********
Name: Jules Merrill
Date: 3-25-3034
Project: Factorial
 ******/

import java.util.*;

public class factorial{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int num2 = 1;

        for(int counter = num; counter != 0; counter-- ){
            num2 *= num;
            num --;
        }
        System.out.println("The factorial is: " + num2);
        input.close();
    }
}