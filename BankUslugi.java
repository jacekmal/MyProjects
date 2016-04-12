package diceGame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class BankUslugi {

	Scanner input = new Scanner(System.in);
	static int money = 0;
	static int moneyOnDeposit = 0;
	public boolean checkPin(int a){
		if(a == 1234){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean checkNumberAcc(String a){
		if(a == "1234123412341234"){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void prepareCreateDeposit(){
		System.out.println("Creating Deposit");
		System.out.println("How much money you want to deposit?");
		int deposit = input.nextInt();
		System.out.println("What interest rate you want?");
		double interestRate = input.nextDouble();
		createDeposit(deposit, interestRate);
	}
	public void createDeposit(int a, double b){
		moneyOnDeposit = a;
		b = (b + 100) / 100;
		System.out.println("You created deposit with " + a + "$");
		for(int i = 1; i <= 5; i++){
			a *=b;
			System.out.printf("Year " + i + ": " + a + "\n" );
		}
		System.out.println("You have now " + money + "$ and " + moneyOnDeposit + "$ on deposit");
	}
	
	public void prepareCredit(){
		System.out.println("Credit Section");
		System.out.println("How much money do you want to borrow?");
		int creditMoney = input.nextInt();
		System.out.println("You want credit with rate of interest of 5% and length of 20 years, o with rate of interests of 4% and length of 30 years?");
		System.out.println("Pick \"1\" for first proposition or \"2\" for second");
		int option = input.nextInt();
		if(option == 1){
			takeOutALoan(creditMoney, 5, 20);
		}
		else{
			takeOutALoan(creditMoney, 4, 30);
		}
		
	}
	
	public void takeOutALoan(int amountOfLoan, double rateOfInterests, int lengthOfLoan){
		rateOfInterests = rateOfInterests / 100;
		double q = 1 + (rateOfInterests / 12 );
		System.out.println(q);
		double installments = amountOfLoan * Math.pow(q, (lengthOfLoan * 12)) * ((q - 1) / (Math.pow(q, lengthOfLoan * 12) - 1));
		double sum = installments * lengthOfLoan * 12;
		double onlyInstallments = sum - amountOfLoan;
		System.out.printf("You want to take %d loan, for %d years, you will have to return %.2f and your monthly installment is %.2f\n", amountOfLoan, lengthOfLoan, sum, installments);
		System.out.printf("So taxes and bank interest is %.2f", onlyInstallments);
		
	}
	
	public void depositMoney(int amountOfMoney){
		money += amountOfMoney;
		System.out.println("You have now " + money + "$ and " + moneyOnDeposit + "$ on deposit");
	}
	
	public void withdrawMoney(int amountOfmoney){
		money -= amountOfmoney;
		System.out.println("You have now " + money + "$ and " + moneyOnDeposit + "$ on deposit");
	}
	
	public void checkAccount(){
		System.out.println("You have now " + money + "$ and " + moneyOnDeposit + "$ on deposit");
	}
	
	public void prepareDeposit(){
		System.out.println("How much money you want to deposit?");
		 int depositMoney = input.nextInt();
		 depositMoney(depositMoney);
	}
	public void prepareWithdraw(){
		System.out.println("How much money you want to deposit?");
		 int withdrawMoney = input.nextInt();
		 withdrawMoney(withdrawMoney);
	}
	public static Connection getConnection() throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
			System.out.println("Connected");

		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return null;
	}
}
