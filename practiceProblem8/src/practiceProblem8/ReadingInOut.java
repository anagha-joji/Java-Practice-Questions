package practiceProblem8;

import java.util.Scanner;

//class creation
public class ReadingInOut {

	public static void main(String[] args) {
		//The input provided by user is stored in myNum1
		Scanner sc = new Scanner(System.in);
		String myString1 = sc.nextLine();
		int myNum1 = sc.nextInt();
		sc.close();
		
		//printing out
		System.out.println(myString1);
		System.out.println(myNum1);

	}

}
