import java.util.Scanner;
class Simple_Calculator  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("----------------Simple Calculator------------------");
		
		System.out.print("Enter First number: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Enter Second number: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Choose operation: + - * /");
		char operation = sc.next().charAt(0);
		
		double result = 0;
		
		switch (operation)
		{
		   case '+':
			   result = num1 + num2;
		       break;
		
		   case '-':
			   result = num1 - num2;
		       break;
			 
		   case '*':
			   result = num1 * num2;
		       break;
			   
		   case '/':
		       if (num2 != 0)
		       {
			     result = num1 / num2;
		       }
			   else{
				   
				   System.out.println(" Error! Division by zero " );
				   sc.close();
				   return;
			   }
			   break;
			default:
				System.out.println("Invalid operater");
			    sc.close();
				return;
		 }
		 System.out.println( "result: "+ result );
		 sc.close();
	}
}
