package javaWithHarry;

import java.util.Scanner;

public class FindPercentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks 0 <Marks< 100");

		System.out.println("Enter the subject 1");
		int sub1 = sc.nextInt();

		System.out.println("Enter the subject 2");
		int sub2 = sc.nextInt();

		System.out.println("Enter the subject 3");
		int sub3 = sc.nextInt();

		System.out.println("Enter the subject 4");
		int sub4 = sc.nextInt();

		System.out.println("Enter the subject 5");
		int sub5 = sc.nextInt();

		int sum = sub1 + sub2 + sub3 + sub4 + sub5;
		System.out.println(sum);

		int totalMarks = 500;
		float percentage = (sum * 100) / totalMarks;
		System.out.println(" Percentage=" + percentage);

	}

}
