package practiceProblem6;

import java.util.Scanner;

//class creation
public class Summation {

	public static void main(String[] args) {
		
		//The input provided by user is stored in num
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		num = sc.nextInt();
		
		int[] numbers = new int[num]; //array creation
		int k = numbers.length; //array length
		
		//loops and logic
		for(int i=0;i<num;i++)
			numbers[i] = sc.nextInt();
		sc.close();
		
		int p = 0;
		for(int j=0;j<k;j++)
			p = p + numbers[j];
		System.out.println ("Output: " +p);
		}


}
