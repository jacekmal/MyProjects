package diceGame;

import java.util.Random;
import java.util.Scanner;

public class testy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int player1Score = 0;
		int player1CurrentScore = 0;
		final int MAXSCORE= 15;
		
		while(player1CurrentScore <= MAXSCORE || player1Score <= MAXSCORE){
			int toss = rand.nextInt(6) + 1;
			if(toss == 1){
				System.out.println("You tossed 1, you lost turn and points");
				break;
			}
			else{
				player1CurrentScore += toss;
				System.out.println("Your toss is " + toss + " and you current score is " + player1CurrentScore + " total score is " + player1Score);
				if(player1CurrentScore >= MAXSCORE){
					System.out.println("You won");
					break;
				}
				else{
					System.out.println("Do you want to toss again? Pick \"1\" for yes, \"2\" for no");
					int a = input.nextInt();
					if(a == 1){
						continue;
					}
					else{
						player1Score = player1CurrentScore;
						System.out.println("You end your turn, your total score is: " + player1Score);
						player1CurrentScore = 0;
						break;
					}
				}
			}
			
		}
		
	}
}
