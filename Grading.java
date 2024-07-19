package practice;

import java.util.*;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter percentage");
		Scanner sc= new Scanner(System.in);
		int grade;
		int percentage=sc.nextInt();
		if(percentage>=90) {
			System.out.println("A");
		}
		else if(percentage>=70 && percentage<90) {
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}

	}

}
