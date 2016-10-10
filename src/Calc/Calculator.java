package Calc;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by rodneytressler on 10/10/16.
 */
public class Calculator {


    public static ArrayList<String> list = new ArrayList<>();

    public static void calc() {
        while (true) {
            System.out.println("Please choose an option: " + "\n" + "");
            Scanner o = new Scanner(System.in);
            System.out.println("Please enter your first value");
            Scanner r1 = new Scanner(System.in);
            int response1 = r1.nextInt();
            System.out.println("Please enter your operator");
            Scanner r2 = new Scanner(System.in);
            String response2 = r2.next();
            System.out.println("Please enter your second value");
            Scanner r3 = new Scanner(System.in);
            int response3 = r3.nextInt();

            if (response2.equals("+")) {
                int sum;
                sum = response1 + response3;
                list.add(response1 + " + " + response3 + " = " + sum);
                System.out.println("The sum of " + response1 + " and " + response3 + " is " + sum);
                System.out.println("Previous Calculations: " + list);
            } else if (response2.equals("-")) {
                int difference;
                difference = response1 - response3;
                list.add(response1 + " - " + response3 + " = " + difference);
                System.out.println("The difference of " + response1 + " and " + response3 + " is " + difference);
                System.out.println("Previous Calculations: " + list);
            } else if (response2.equals("*")) {
                int product;
                product = response1 * response3;
                list.add(response1 + " * " + response3 + " = " + product);
                System.out.println("The product of " + response1 + " and " + response3 + " is " + product);
                System.out.println("Previous Calculations: " + list);
            } else if (response2.equals("/")) {
                int quotient;
                quotient = response1 / response3;
                list.add(response1 + " / " + response3 + " = " + quotient);
                System.out.println("The quotient of " + response1 + " and " + response3 + " is " + quotient);
                System.out.println("Previous Calculations: " + list);
            } else {
                System.out.println("Please enter a proper value");
            }
            System.out.println("Would you like to calculate further?");
            Scanner r4 = new Scanner(System.in);
            String response4 = r4.nextLine();
            if (response4.toLowerCase().equals("no") || response4.toLowerCase().equals("n")) {
                break;
            }
            }

        }

    }

