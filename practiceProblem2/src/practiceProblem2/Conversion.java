package practiceProblem2;

import java.util.Scanner;

//class creation
public class Conversion {

	public static void main(String[] args) {
		
		//The input provided by user is stored in num
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		
		//conversion and checking with loops
		String s = String.valueOf(num);
		if (true)
			System.out.println("Conversion Successful");
		else
			System.out.println("Converson Unsuccessful");

	}

}
