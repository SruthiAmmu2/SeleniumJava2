import java.util.Scanner;

public class ClassProgram {

	public static void main(String[] args) {
		
		int num1,num2,sum,sub,mul;
		
		Scanner in = new Scanner(System.in);  
		
		System.out.println("\n");
		
		System.out.print("Enter the first Number : ");  
		num1 = in.nextInt(); 
		
		System.out.print("Enter the second Number : ");  
		num2 = in.nextInt(); 
		
		
		sum = num1 + num2; 
		System.out.println("Addition Result: " +sum);
		
		sub = num1 - num2; 
		System.out.println("The difference is : "+sub);
		
		mul = num1 * num2; 
		System.out.println("The product is : "+mul);

	}

}
