import java.util.Scanner;
public class ScienCalculator
{
    public static void main (String [] args)
    {
        // This program will allow the user to perform a series of operations a common scientific calculator should do
        Scanner scanner = new Scanner(System.in); // Calling scanner

        // Declaring variables that will be used throughout the program
        double num1;
        double num2;
        double result = 0;
        double previousResult = 0;
        String operand1;
        String operand2;
        int option;
        double sumCalc = 0;
        int numCalc = 0;

        boolean calculator = true;

        while (calculator) // Loop to keep the program running
        {
            System.out.println("\nCurrent Result: " + result);
            System.out.println("\nCalculator Menu");
            System.out.println("\n---------------");
            System.out.println("\n0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");

            boolean menu = false;

            while (!menu) // Loop to avoid displaying the menu every repetition
            {
                System.out.print("\nEnter Menu Selection: ");
                option = scanner.nextInt();

                if (option == 0) //Checking for every option number possible
                {
                    System.out.println("\nThanks for using this calculator. Goodbye!");
                    menu = true;
                    calculator = false;
                }
                else if (option == 1) // Performing addition
                {
                    System.out.print("Enter first operand: ");
                    operand1 = scanner.next();

                    if (operand1.equals("RESULT"))// Allowing previous result input through string-to-double conversion
                    {
                        num1 = previousResult;
                    }
                    else
                    {
                        num1 = (Double.parseDouble(operand1));
                    }

                    System.out.print("Enter second operand: ");
                    operand2 = scanner.next();

                    if (operand2.equals("RESULT"))
                    {
                        result = num1 + previousResult;
                    }
                    else
                    {
                        num2 = (Double.parseDouble(operand2));
                        result = num1 + num2;
                    }

                    previousResult = result; // Storing result as previous result for future use
                    sumCalc += result;
                    numCalc++; // Storing number of calculations and total sum of calculations

                    menu = true;
                }
                else if (option == 2) // Performing subtraction
                {
                    System.out.print("Enter first operand: ");
                    operand1 = scanner.next();

                    if (operand1.equals("RESULT"))
                    {
                        num1 = previousResult;
                    }
                    else //comment for my debugging thanggg
                    {
                        num1 = (Double.parseDouble(operand1));
                    }

                    System.out.print("Enter second operand: ");
                    operand2 = scanner.next();

                    if (operand2.equals("RESULT"))
                    {
                        result = num1 - previousResult;
                    }
                    else
                    {
                        num2 = (Double.parseDouble(operand2));
                        result = num1 - num2;
                    }

                    previousResult = result;
                    sumCalc += result;
                    numCalc++;

                    menu = true; // Allowing return to the menu display
                }
                else if (option == 3) // Performing multiplication
                {
                    System.out.print("Enter first operand: ");
                    operand1 = scanner.next();

                    if (operand1.equals("RESULT"))
                    {
                        num1 = previousResult;
                    }
                    else
                    {
                        num1 = (Double.parseDouble(operand1));
                    }

                    System.out.print("Enter second operand: ");
                    operand2 = scanner.next();

                    if (operand2.equals("RESULT"))
                    {
                        result = num1 * previousResult;
                    }
                    else
                    {
                        num2 = (Double.parseDouble(operand2));
                        result = num1 * num2;
                    }

                    previousResult = result;
                    sumCalc += result;
                    numCalc++;

                    menu = true;
                }
                else if (option == 4) // Performing division
                {
                    System.out.print("Enter first operand: ");
                    operand1 = scanner.next();

                    if (operand1.equals("RESULT"))
                    {
                        num1 = previousResult;
                    }
                    else
                    {
                        num1 = (Double.parseDouble(operand1));
                    }

                    System.out.print("Enter second operand: ");
                    operand2 = scanner.next();

                    if (operand2.equals("RESULT"))
                    {
                        result = num1 / previousResult;
                    }
                    else
                    {
                        num2 = (Double.parseDouble(operand2));
                        result = num1 / num2;
                    }

                    previousResult = result;
                    sumCalc += result;
                    numCalc++;

                    menu =true;
                }
                else if (option == 5) // Performing exponentiation
                {
                    System.out.print("Enter first operand: ");
                    operand1 = scanner.next();

                    if (operand1.equals("RESULT"))
                    {
                        num1 = previousResult;
                    }
                    else
                    {
                        num1 = (Double.parseDouble(operand1));
                    }

                    System.out.print("Enter second operand: ");
                    operand2 = scanner.next();

                    if (operand2.equals("RESULT"))
                    {
                        result = Math.pow(num1 , previousResult);
                    }
                    else
                    {
                        num2 = (Double.parseDouble(operand2));
                        result = Math.pow(num1 , num2);
                    }

                    previousResult = result;
                    sumCalc += result;
                    numCalc++;

                    menu = true;
                }
                else if (option == 6) // Performing logarithm
                {
                    System.out.print("Enter first operand: ");
                    operand1 = scanner.next();

                    if (operand1.equals("RESULT"))
                    {
                        num1 = previousResult;
                    }
                    else
                    {
                        num1 = (Double.parseDouble(operand1));
                    }

                    System.out.print("Enter second operand: ");
                    operand2 = scanner.next();

                    if (operand2.equals("RESULT"))
                    {
                        result = Math.log(previousResult) / Math.log(num1);
                    }
                    else
                    {
                        num2 = (Double.parseDouble(operand2));
                        result = Math.log(num2) / Math.log(num1);
                    }

                    previousResult = result;
                    sumCalc += result;
                    numCalc++;

                    menu = true;
                }
                else if (option == 7) // Printing statistics
                {
                    if (sumCalc == 0)
                    {
                        System.out.println("\nError: No calculations yet to average!");
                    }
                    else
                    {
                        System.out.println("\nSum of calculations:" + sumCalc);
                        System.out.println("Number of calculations: " + numCalc);

                        if (Math.floor(sumCalc / numCalc * 100) / 100 == - 0.99)
                        {
                            System.out.println("Average of calculations: " +
                                                (Math.floor(sumCalc / numCalc * 100) / 100 + 0.01));
                        }
                        else
                        {
                            System.out.println("Average of calculations: " + Math.floor(sumCalc / numCalc * 100) / 100);
                        }
                    }
                }
                else // Invalid input case
                {
                    System.out.println("\nError: Invalid selection!");
                }
            }
        }
    }
}