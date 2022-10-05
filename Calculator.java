import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		float num1;
		float num2;
		float result;
		char operator;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = scan.nextFloat();
		
		System.out.println("Enter second number");
		num2 = scan.nextFloat();

		System.out.println("Multiply (*), Add (+), Subtract (-), Divide (/)");
		System.out.println("Enter operator: * or / or + or -");
		operator = scan.next().charAt(0);

		switch(operator){
			
			case '-':
				result = num1 - num2;
				System.out.println(num1+" - "+num2+" = "+result);
				break;
			case '+':
				result = num1 + num2;
				System.out.println(num1+" + "+num2+" = "+result);
				break;
			case '/':
				result = num1 / num2;
				System.out.println(num1+" / "+num2+" = "+result);
				break;
			case '*':
				result = num1 * num2;
				System.out.println(num1+" x "+num2+" = "+result);
				break;
			default:
				System.out.println("Invalid operator");
				break;

		}

		scan.close();
	}
}