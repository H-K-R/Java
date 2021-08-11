//java menu program
 
import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
 
    char operator;
    Double number1=0.0, number2=0.0, result;
 
    // create an object of Scanner class
    Scanner input = new Scanner(System.in);
 
    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, /, or 0 (to exit) ");
    operator = input.next().charAt(0);
 
	if(operator != '0')
	{
    	// ask users to enter numbers
    	System.out.println("Enter first number");
    	number1 = input.nextDouble();
 
    	System.out.println("Enter second number");
    	number2 = input.nextDouble();
	}
 
    switch (operator) {
 
      // performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;
 
      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;
 
      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;
 
      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;
	  //perform exit operation
	  case '0':
	  	System.out.println("Program exited.");
	  	System.exit(0);
 
      default:
        System.out.println("You did not make a valid choice, please run the program again.");
        System.exit(0);
    }
 
    input.close();
  }
}