package practiceProblem4;

import java.util.Scanner;

//class creation
public class Solution {

	public static void main(String[] args) {
		
		//The input provided by user is stored in num
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		
		//checking using loop
		if(num % 2 == 0)
			System.out.println("GOOD");
		else
			System.out.println("BAD");

	}

}
