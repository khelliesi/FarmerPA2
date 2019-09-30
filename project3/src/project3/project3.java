package project3;
import java.util.Scanner;
public class project3 {
	public static void main(String[] args) {
		
		//prompt to rate each topic
		Scanner scnr = new Scanner(System.in);
		//topics
		
		String[] topics = {"Movies", "Games", "School", "Food", "Politics"};
		
		//receive ratings
		
		int [][] ratings = new int [topics.length][];
		int i, j;
		int numUsers = 0;
		int rating = 0;
		
		
		for (i = 0; i < rating; i++)
		{
			ratings[i] = new int[10];
			for (j = 0; j < ratings[i].length; j++);
			ratings[i][j] = 0;
		}
		
		// get number of users
		
		System.out.print("How many users will be rating?");
		numUsers = scnr.nextInt();
		
		//user input within loop
		System.out.println("Please rate the following topics from 1(least important) to 10 (most important)");
		
		for (j = 0; j < topics.length; j++)
		{
			System.out.print("Enter desired rating for " + topics[j] + ": ");
			rating = scnr.nextInt();
		}
		System.out.print("Thank you! Program ends :)");
		
	}
}
