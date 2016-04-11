package diceGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		//assigning variables, you can put MAXSCORE to another int to longer or shorten the game
		System.out.println("Hello, it's The Dice Game for 3 players");
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		final int MAXSCORE = 15;
		int[] playerScores = new int[3];
		int player1CurrentScore = 0;
		int player2CurrentScore = 0;
		int player3CurrentScore = 0;
		
		//main clause allows to break from inner loop to outer loop
		main:{
			
			//looping until some player score MAXSCORE
			while(!(playerScores[0] >= MAXSCORE) || !(playerScores[1] >= MAXSCORE) || !(playerScores[2] >= MAXSCORE)){
				System.out.println("PLAYER 1");
				
				//loop for one player
				while(player1CurrentScore <= MAXSCORE || playerScores[0] <= MAXSCORE){
					int toss = rand.nextInt(6) + 1;
					if(toss == 1){
						System.out.println("You tossed 1, you lost turn and points");
						player1CurrentScore = 0;
						break;
					}
					else{
						player1CurrentScore += toss;
						System.out.println("Your toss is " + toss + " and you current score is " + player1CurrentScore + " total score is " + playerScores[0]);
						if(player1CurrentScore >= MAXSCORE){
							playerScores[0] = player1CurrentScore;
							System.out.println("You won");
							break main;
						}
						else{
							System.out.println("Do you want to toss again? Pick \"1\" for yes, \"2\" for no");
							int a = input.nextInt();
							if(a == 1){
								continue;
							}
							else{
								playerScores[0] = player1CurrentScore;
								System.out.println("You end your turn, your total score is: " + playerScores[0]);
								player1CurrentScore = 0;
								break;
							}
						}
					}
					
				}
				System.out.println("PLAYER 2");
				
				while(player2CurrentScore <= MAXSCORE || playerScores[1] <= MAXSCORE){
					int toss = rand.nextInt(6) + 1;
					if(toss == 1){
						System.out.println("You tossed 1, you lost turn and points");
						break;
					}
					else{
						player2CurrentScore += toss;
						System.out.println("Your toss is " + toss + " and you current score is " + player2CurrentScore + " total score is " + playerScores[1]);
						if(player2CurrentScore >= MAXSCORE){
							playerScores[1] = player2CurrentScore;
							System.out.println("You won");
							break main;
						}
						else{
							System.out.println("Do you want to toss again? Pick \"1\" for yes, \"2\" for no");
							int a = input.nextInt();
							if(a == 1){
								continue;
							}
							else{
								playerScores[1] = player2CurrentScore;
								System.out.println("You end your turn, your total score is: " + playerScores[1]);
								player1CurrentScore = 0;
								break;
							}
						}
					}
					
				}
				
				System.out.println("PLAYER 3");
				
				while(player3CurrentScore <= MAXSCORE || playerScores[2] <= MAXSCORE){
					int toss = rand.nextInt(6) + 1;
					if(toss == 1){
						System.out.println("You tossed 1, you lost turn and points");
						break;
					}
					else{
						player3CurrentScore += toss;
						System.out.println("Your toss is " + toss + " and you current score is " + player3CurrentScore + " total score is " + playerScores[2]);
						if(player3CurrentScore >= MAXSCORE){
							playerScores[2] = player3CurrentScore;
							System.out.println("You won");
							break main;
						}
						else{
							System.out.println("Do you want to toss again? Pick \"1\" for yes, \"2\" for no");
							int a = input.nextInt();
							if(a == 1){
								continue;
							}
							else{
								playerScores[2] = player3CurrentScore;
								System.out.println("You end your turn, your total score is: " + playerScores[2]);
								player3CurrentScore = 0;
								break;
							}
						}
					}
					
				}
		
			
			}
			
			}
			
			
		//printing each player score	
		for(int i = 0; i < playerScores.length; i++){
			System.out.printf("Player %d: %s points \t", i+1, playerScores[i]);
		}
	}
}		

		
		
		
		
		
	


