package com.github.hojenski.reverese_numbers;
import java.util.Scanner;

public class reverse_numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Pomyśl liczbę od 0 do 1000 a ja ją zgadnę w 10 próbach");
		System.out.println();
		System.out.println("Gotowy? (TAK LUB NIE)");
		scan.nextLine();

		int min = 0;
		int max = 1000;

		boolean answer = false;
		String input = "";

		while (answer != true) {

			int guess = ((max - min) / 2) + min;
			System.out.println("Zgaduję: " + guess);
			System.out.println();
			System.out.print("Odpowiedz: \"za duzo\", \"za malo\" lub \"zgadles\": ");
			;

			input = scan.nextLine();
			if (input.equalsIgnoreCase("zgadłeś")) {
				System.out.println("Wygrałem!!!");
				answer = true;
				break;
			} else if (input.equalsIgnoreCase("za duzo")) {
				max = guess;
			} else if (input.equalsIgnoreCase("za malo")) {
				min = guess;
			} else {
				System.out.println("nie oszukuj");
			}

		}

	}

}