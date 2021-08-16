package training.simplilearn.assinment_1_new;
import  java.util.Scanner;

public class Arithmetic_Calculator {
	
	
	// Functions for  Addition
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public  double add(double a, double b) {
		return a + b;
	}
	
	// Functions for Subtraction
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public  double sub(double a, double b) {
		return a - b;
	}
	
	// Function for multiplication
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public  double mul(double a, double b) {
		return a * b;
	}
	
	// Function for division
	
	public int div(int a, int b) {
		return a / b;
	}
	
	public  double div(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {
		Arithmetic_Calculator ac = new Arithmetic_Calculator();
		double number1, number2;
		char operator;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter first number : ");
			number1 = scanner.nextDouble();
			System.out.println("Enter operator : ");
			operator = scanner.next().charAt(0);
			System.out.println("Enter second number  : ");
			number2 = scanner.nextDouble();
			
			switch(operator) {
			case '+':
				if(number1 % 1 == 0 && number2 % 1 == 0) {
					int temp1 = (int)number1;
					int temp2 = (int)number2;
					System.out.println("Answer = " + ac.add(temp1, temp2));
				} else {
					System.out.println("Answer = " + ac.add(number1, number2));
				}
				break;
			
				
			case '-':
				if(number1 % 1 == 0 && number2 % 1 == 0) {
					int temp1 = (int)number1;
					int temp2 = (int)number2;
					System.out.println("Answer = " + ac.sub(temp1, temp2));
				} else {
					System.out.println("Answer = " + ac.sub(number1, number2));
				}
				break;
				
			case '*':
				if(number1 % 1 == 0 && number2 % 1 == 0) {
					int temp1 = (int)number1;
					int temp2 = (int)number2;
					System.out.println("Answer = " + ac.mul(temp1, temp2));
				} else {
					System.out.println("Answer = " + ac.mul(number1, number2));
				}
				break;
				
			case '/':
				if(number1 == 0 && number2 == 0) {
					System.out.println("Please try with a non zero value !");
				} else if(number2 == 0) {
					System.out.println("Please try with a non zero value !");
				} else {
					if(number1 % 1 == 0 && number2 % 1 == 0) {
						int temp1 = (int)number1;
						int temp2 = (int)number2;
						System.out.println("Answer = " + ac.div(temp1, temp2));
					} else {
						System.out.println("Answer = " + ac.div(number1, number2));
					}
				}
				break;
				
			default:
				System.out.println("Please try  with a valid operator (+, -, *, /) !");
			}
			System.out.println("Enter y for continue and n for exit :");
			char action = scanner.next().charAt(0);
			while(action != 'y' || action != 'Y' || action != 'n' || action != 'N') {
				if(action == 'y' || action == 'Y' || action == 'n' || action == 'N')
					break;
				else {
					System.out.println("Please enter a valid action y/n or Y/N !");
					action = scanner.next().charAt(0);
				}
			}
			if(action == 'n' || action == 'N')
				break;
		}
		scanner.close();
		}
	}

