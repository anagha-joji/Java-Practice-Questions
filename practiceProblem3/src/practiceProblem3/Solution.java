package practiceProblem3;

import java.util.Scanner;

//class creation
public class Solution {

	public static void main(String[] args) {
		
		//The input provided by user is stored in num
		double num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numeric value : ");
		num = sc.nextDouble();
		sc.close();
		
		//printing out
		System.out.println("DOUBLE " + num);
		}

}
