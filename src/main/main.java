package main;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String input = sc.nextLine();
			if(input.equals("exit")) return ;
			char result = LetterGrade.letterGrade(Integer.parseInt(input));
			System.out.println(result);
		}
    }
}
