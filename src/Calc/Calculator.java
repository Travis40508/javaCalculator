package Calc;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by rodneytressler on 10/10/16.
 */
public class Calculator {


    public static ArrayList<String> list = new ArrayList<>();

    public static void calc() throws IOException{
        String fileName = "history.txt";
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
        while (true) {
            System.out.println("Please choose an option: " + "\n" +
                               "1. Calculator" + "\n" +
                               "2. Tip Calculator" + "\n" +
                               "3. Help" + "\n" +
                               "4. Clear History" + "\n" +
                               "5. Calculate Grocery Tax" + "\n" +
                               "6. Quit");
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
                    System.out.println("Calculation History: " + list);
                } else if (response2.equals("-")) {
                    double difference;
                    difference = Math.round((response1 - response3) * 100.00) / 100.00;
                    list.add(response1 + " - " + response3 + " = " + difference);
                    System.out.println("The difference of " + response1 + " and " + response3 + " is " + difference);
                    System.out.println("Calculation History: " + list);
                } else if (response2.equals("*")) {
                    double product;
                    product = Math.round((response1 * response3) * 100.00) / 100.00;
                    list.add(response1 + " * " + response3 + " = " + product);
                    System.out.println("The product of " + response1 + " and " + response3 + " is " + product);
                    System.out.println("Calculation History: " + list);
                } else if (response2.equals("/")) {
                    double quotient;
                    quotient = Math.round((response1 / response3) * 100.00) / 100.00;
                    list.add(response1 + " / " + response3 + " = " + quotient);
                    System.out.println("The quotient of " + response1 + " and " + response3 + " is " + quotient);
                    System.out.println("Calculation History: " + list);
                } else {
                    System.out.println("Please enter a proper value");
                }

            } else if (options.equals("2")) {
                System.out.println("Please enter your bill amount");
                Scanner b = new Scanner(System.in);
                double bill = Math.round(b.nextDouble() * 100.00)/100.00;
                System.out.println("Please enter a tip amount in decimal form (0.15 instead of 15%");
                Scanner t = new Scanner(System.in);
                double tip = t.nextDouble();
                double tipCalc = Math.round(bill * tip * 100.00)/100.00;
                list.add("Tip Calculation: " + bill + " * " + tip + " = " + Math.round(bill * tip * 100.00) / 100.00);
                System.out.println("Your Tip Amount is: " + tipCalc + " and your total is: " + (bill + tipCalc));
                System.out.println("Calculation History: " + list);
            } else if (options.equals("3")) {
                System.out.println("Calculator will allow you to calculate various totals, such as addition, subtraction, multiplication, or division. Tip Calculator will allow you to calculate the tip on your meal. Help is this nifty helper. Clear History will erase your calculations history, Grocery Calculator will calculate the sales tax for the state of Kentucky based on your grocery total, and Quit will exit the app and clear your history. Enjoy!");
            } else if (options.equals("4")) {
                list.clear();

            } else if (options.equals("5")) {
                System.out.println("Please Enter your Grocery Item Total (Before Taxes)");
                Scanner g = new Scanner(System.in);
                Scanner s = new Scanner(System.in);
                double state = s.nextDouble();
                System.out.println("Please enter your state tax in decimal format (.06, not 6%)");
                double grocery = Math.round(g.nextDouble() * 100.00) /100.00;
                double tax = Math.round(grocery * state * 100.00) / 100.00;
                list.add("Grocery Tax: " + tax);
                System.out.println("Your Tax Amount is: " + tax);
                System.out.println("Calculation History: " + list);

            } else if (options.equals("6")) {
                System.out.println("Please Come Back!");
                outFile.println(list);
                outFile.close();
                break;
            }

            }

        }

    }

