package project2;
import java.util.Scanner;
public class bmi {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);	
	
	//prompt for lb or kg
	System.out.print("How would you like to enter your weight? (1 for lb or 2 for kg)");
	int weightInput;
	weightInput = in.nextInt();
	
	/* IF statement where if user enters 'lb' it takes them to the input for 
	 * pounds and if they enter kg for kilograms
	 * 2 statements that execute depending on input
	 */
	if (weightInput == 1)
	{
		System.out.print("Please enter your weight in pounds: ");
		int weightPounds = 0;
		weightPounds = in.nextInt();
		System.out.print("Thank you\nPlease enter your height in inches: ");
		int heightInches = in.nextInt();
		
		int bmi1 = (703 * weightPounds)/(heightInches * heightInches);
		
		System.out.println("Your BMI is: " + bmi1);
		System.out.println("According to the National Heart, Lung and Blood Institute, ");
		if (bmi1 < 18)
			System.out.println("you are underweight.");
		if (bmi1 >= 18 && bmi1 <= 24)
			System.out.println("you are a normal weight.");
		if (bmi1 >= 25 && bmi1 <= 29)
			System.out.println("you are overweight.");
		if (bmi1 >= 30)
			System.out.println("you are obese.");
	}
	if (weightInput == 2)
		System.out.print("Please enter your weight in kilograms: ");
		int weightKilos = 0;
		weightKilos = in.nextInt();
		System.out.print("Thank you\nPlease enter your height in meters: ");
		int heightMeters = in.nextInt();
		int bmi2 = weightKilos / (heightMeters * heightMeters);
		
		System.out.println("Your BMI is: " + bmi2);
		System.out.println("According to the National Heart, Lung and Blood Institute");
		
		if (bmi2 < 18)
			System.out.println("you are underweight.");
		if (bmi2 >= 18 && bmi2 <= 24)
			System.out.println("you are a normal weight.");
		if (bmi2 >= 25 && bmi2 <= 29)
			System.out.println("you are overweight.");
		if (bmi2 >= 30)
			System.out.println("you are obese.");
		
	
	//prompt for weight and height
	
	
	//else
	//calc mode
	
	
	//get weight
	
	
	//get height
	
	
	//calculate BMI
	
	
	//display BMI
	
	
	
}
	
}
