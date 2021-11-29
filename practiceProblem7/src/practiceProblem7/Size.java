package practiceProblem7;

import java.util.Scanner;

//class creation
public class Size {

	public static void main(String[] args) {
		
		//The input provided by user is stored in num
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		
		//if loop
		if (num>=1 && num<=30)
			System.out.println("SMALL");
		else if(num>=31 && num<=60)
			System.out.println("MEDIUM");
		else if(num>=61 && num<=100)
			System.out.println("LARGE");
		}

}
