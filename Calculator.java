package calculator;

import java.util.Scanner;

public class Calculator {
	static Scanner tara = new Scanner(System.in);

	public static void main(String[] args) {
		String islem;
		int ilk, son;
		System.out.println("Sayý giriniz");
		ilk = tara.nextInt();
		System.out.println("Ýþlemi giriniz.");
		islem = tara.next();
		System.out.println("Sayý giriniz");
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
		System.out.println("Devam etmek istiyorsanýz herhangi bir karakter girin. Ýstemiyorsanýz c yazýn");
		islem = tara.next();
		while (!(islem.equals("c"))) {
			System.out.println("Ýþlemi giriniz.");
			islem = tara.next();
			System.out.println("Sayý giriniz");
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
			System.out.println("Devam etmek istiyorsanýz herhangi bir karakter girin. Ýstemiyorsanýz c yazýn");
			islem = tara.next();
		}

	}

}
