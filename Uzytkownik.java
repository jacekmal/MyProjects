package diceGame;

import java.util.Scanner;

public class Uzytkownik extends BankUslugi {

	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		int exit = 1;
		
		//Menu loop
		while(exit != 0){
		Uzytkownik jacek = new Uzytkownik();
		System.out.println();
		System.out.println("Welcome to our bank, what you want to do");
		System.out.println("Pick 1 if you want to check your bank account");
		System.out.println("Pick 2 if you want to deposit money");
		System.out.println("Pick 3 if you want to withdraw money");
		System.out.println("Pick 4 if you want to create deposit");
		System.out.println("Pick 5 if you want to take a loan");
		System.out.println("Pick 6 if you want to quit");
		
		int option = input.nextInt();
		
		switch(option){
		case 1: jacek.checkAccount(); break;
		case 2: jacek.prepareDeposit(); break;
		case 3: jacek.prepareWithdraw(); break;
		case 4: jacek.prepareCreateDeposit(); break;
		case 5: jacek.prepareCredit(); break;
		case 6: exit = 0; break;
		}
		}
	}

}
