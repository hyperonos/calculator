package calculator;

import java.util.Scanner;

public class Calculator {
	static Scanner tara = new Scanner(System.in);

	public static void main(String[] args) {
		String islem;
		int ilk, son;
		System.out.println("Say� giriniz");
		ilk = tara.nextInt();
		System.out.println("��lemi giriniz.");
		islem = tara.next();
		System.out.println("Say� giriniz");
		son = tara.nextInt();
		if (islem.equals("+")) {
			ilk = ilk + son;
		} else if (islem.equals("-")) {
			ilk = ilk - son;
		} else if (islem.equals("*")) {
			ilk = ilk * son;
		} else if (islem.equals("/")) {
			ilk = ilk / son;
		}
		System.out.println(ilk);
		System.out.println("Devam etmek istiyorsan�z herhangi bir karakter girin. �stemiyorsan�z c yaz�n");
		islem = tara.next();
		while (!(islem.equals("c"))) {
			System.out.println("��lemi giriniz.");
			islem = tara.next();
			System.out.println("Say� giriniz");
			son = tara.nextInt();
			if (islem.equals("+")) {
				ilk = ilk + son;
			} else if (islem.equals("-")) {
				ilk = ilk - son;
			} else if (islem.equals("*")) {
				ilk = ilk * son;
			} else if (islem.equals("/")) {
				ilk = ilk / son;
			}

			System.out.println(ilk);
			System.out.println("Devam etmek istiyorsan�z herhangi bir karakter girin. �stemiyorsan�z c yaz�n");
			islem = tara.next();
		}

	}

}
