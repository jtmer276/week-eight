/********
Name: Jules Merrill
Date: 3-25-2024
Project: Odd Sum
*********/

import java.util.*;

public class OddSum {
    public static void main(String[] args){
        int num = 0;
        int index = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();


        for(int i = 1; i <= num; i+=2){

            index += i;
            

            }
            System.out.print("The sum is: " + index);
            input.close();

            }

    }
    

