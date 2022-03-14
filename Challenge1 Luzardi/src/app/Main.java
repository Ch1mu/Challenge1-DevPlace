package app;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
 System.out.println(isPrime(13)); //1
 
// passVerification(); //2

 System.out.println(salaryCalculator(1, 1, "franco",11)); //3
 
 //guessTheNumber();
 
 System.out.println(numbers());
	}
	
	
	// 1
	public static boolean  isPrime(int number)
	{
		 if (number == 0 || number == 1) //that numbers aren't prime, but they are only divisible between 1 and themself
		 {
			    return false;
		 }
		 for(int i = 2; i<number; i++) 
		 {
			 if(number%i == 0) //here I look if they are divisible by a number between 2 and the number
			 {
				 return false;
			 }
		 }
		 return true;
	}
	
	
	
//2
	
	//Function that does the "Press to Continue"
	static public void pressToFinish()
	{
	    String pass;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Press Enter to Finish running this program...");
	    try
	    {
	        pass = scan.nextLine();
	        System.exit(0); //when pressing Enter  it finish the program
	    }
	    catch(Exception e)
	    {
	    	
	    }
	}
	
	public static void passVerification()
	{
		 Scanner scan = new Scanner(System.in);
		 int attempts = 0;
		 String password = "";
		 String password2 = "";
		 System.out.println("Enter your Password");
		 password = scan.nextLine();
		 
		 while(!password.equals(password2) && attempts!=3)
		 {
			 System.out.println("Repeat your Password");
			 password2 = scan.nextLine();
			 attempts++;
		 }
		 if(attempts == 3) //if attempts reach 3 you should excercise your memory
		 {
			 System.out.println("You should excercise your memory");
			 
		 }
		 else if (password.equals(password2))
		 {
			 System.out.println("Congratulations you remembered your password! ");
		 }
		 
		 pressToFinish();
		
	}
	
	
	//3
	
	public static String  salaryCalculator(float moneyPerHour, float hours, String name, int antiquityYears)
	{
		float total = 0;
		String data = "";
		total = moneyPerHour * hours;
		if(antiquityYears > 10) //if antiquity >10 then add this to employee salary
		{
			total+= antiquityYears *30;
		}
		 data += "Name: " + name + ", Antiquity: " + antiquityYears + " Years, Salary: " + total;
		 return data;
	}
	

	//4
	
	public static void guessTheNumber()
	{
		Scanner scan = new Scanner(System.in);
		
		Random rnd = new Random();
		int number = rnd.nextInt(1000); //random int between 0 and 1000
		int guess = -1;
		while(guess != number)
		{
		System.out.println("Enter a number to Guess!");
		
		guess = scan.nextInt();
		
		if(guess > number)
		{
			System.out.println("Lower...");
		}
		else if(guess < number)
		{
			System.out.println("Upper...");
		}
		else if(guess ==  number)
		{
			System.out.println("Congratulations the number was: " + number);
		}
		}
	}
	
	//5
	
	public static String numbers()
	{
		Scanner scan = new Scanner(System.in);
		String data = "";
		int number = 0;
		int upper = 0;
		int lower = 999999999; //this is because if i put 0, the program put 0 for the lower num
		int ulSum = 0;
		int sumAll = 0;
		while(number != -1)
		{
			System.out.println("Enter a number (Enter -1 to finish)");
			number = scan.nextInt();
			
			if(number > upper && number != -1) //a
				upper = number;
			
			else if(number < lower  && number != -1) //b
				lower = number;
			sumAll += number; //c
			
				
		}
		ulSum = upper + lower; //d
		data += "Lower: " + lower + ", Upper: " + upper + ", Upper plus Lowers: " + ulSum + ", Sum of all numbers: " + sumAll;
		return data;
	}
	
}


