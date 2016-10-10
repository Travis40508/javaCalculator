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
            System.out.println("Please choose an option: " + "\n" +
                               "1. Calculator" + "\n" +
                               "2. Tip Calculator" + "\n" +
                               "3. Help" + "\n" +
                               "4. Quit");
            Scanner o = new Scanner(System.in);
            String options = o.nextLine();
            if (options.toLowerCase().equals("1")) {
                System.out.println("Please enter your first value");
                Scanner r1 = new Scanner(System.in);
                double response1 = r1.nextDouble();
                System.out.println("Please enter your operator (+, -, *, or /)");
                Scanner r2 = new Scanner(System.in);
                String response2 = r2.next();
                System.out.println("Please enter your second value");
                Scanner r3 = new Scanner(System.in);
                double response3 = r3.nextDouble();

                if (response2.equals("+")) {
                    double sum;
                    sum = Math.round((response1 + response3) * 100.00) / 100.00;
                    list.add(response1 + " + " + response3 + " = " + sum);
                    System.out.println("The sum of " + response1 + " and " + response3 + " is " + sum);
                    System.out.println("Previous Calculations: " + list);
                } else if (response2.equals("-")) {
                    double difference;
                    difference = Math.round((response1 - response3) * 100.00) / 100.00;
                    list.add(response1 + " - " + response3 + " = " + difference);
                    System.out.println("The difference of " + response1 + " and " + response3 + " is " + difference);
                    System.out.println("Previous Calculations: " + list);
                } else if (response2.equals("*")) {
                    double product;
                    product = Math.round((response1 * response3) * 100.00) / 100.00;
                    list.add(response1 + " * " + response3 + " = " + product);
                    System.out.println("The product of " + response1 + " and " + response3 + " is " + product);
                    System.out.println("Previous Calculations: " + list);
                } else if (response2.equals("/")) {
                    double quotient;
                    quotient = Math.round((response1 / response3) * 100.00) / 100.00;
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
            } else if (options.equals("2")) {
                System.out.println("Please enter your bill amount");
                Scanner b = new Scanner(System.in);
                double bill = Math.round(b.nextDouble() * 100.00)/100.00;
                System.out.println("Please enter a tip amount in decimal form (0.15 instead of 15%");
                Scanner t = new Scanner(System.in);
                double tip = t.nextDouble();
                double tipCalc = Math.round(bill * tip * 100.00)/100.00;
                System.out.println("Your Tip Amount is: " + tipCalc + " and your total is: " + (bill + tipCalc));

            } else if (options.equals("3")) {
                System.out.println("A calculator is a valuable tool for calculating numerical Amounts. One can use a calculator for calculating two number's sum, such as 3 + 4, or maybe dividing two numbers, such as 4 / 2. One can use it to calculate the tip, by selecting the second option, or for any other numerical calculation one can imagine. Enjoy, and thank you for using Tressler Industries Technology!");
            } else if (options.equals("4")) {
                System.out.println("Please Come Back!");
                break;
            }

            }

        }

    }

