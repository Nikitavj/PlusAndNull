package Krestiki;

import java.util.Random;
import java.util.Scanner;

public class GameCycle {

	public void process ( int razmerPole) {
		
		int[][] kontrPole = new int[razmerPole][razmerPole];
		
		String[][] pole = new String[razmerPole][razmerPole];
		for (int i = 0; i < pole.length; i++) {
			for (int j = 0; j < pole[i].length; j++) {
				pole[i][j] = " ";
			}
		}
		
		boolean rezGame = false;
		while (true) {
			System.out.println("Ход бота:"); // ход бота
			rezGame = botStep(pole, kontrPole);	 
			new StatusPole().actualPole(pole);
			if(rezGame) break;
			
			System.out.println("Ход игрока:"); // ход игрока
			rezGame = manStep(pole, kontrPole);
			new StatusPole().actualPole(pole);
			if(rezGame) break;
		}
	}
	
	public boolean botStep( String[][] pole, int[][] kontrPole) { // метод бота
		boolean statusGame = false;
		do {
			Random rand = new Random(); 
			int i = rand.nextInt(pole.length); 
			int j = rand.nextInt(pole.length);
			if (kontrPole[i][j] == 0) {
				kontrPole[i][j] = -1; 
				pole[i][j] = "O";
				break;
			} 
		} while (true);
		
		return new EndGame().result(kontrPole);
	}
	
	public boolean manStep( String[][] pole, int[][] kontrPole) { // метод игрока
		
			while (true) {
				Scanner scan = new Scanner(System.in);
				int i = scan.nextInt(); 
				int j = scan.nextInt();
				if ( i > pole.length - 1 || j > pole.length - 1) {
					System.out.println("Введите занчение до " + "0" + (pole.length - 1));
					continue;
				}
				if (kontrPole[i][j] != 0) {
					System.out.println("Ячейка занята, введите значение свободной ячейки!");
					continue;
				}
				if (kontrPole[i][j] == 0) {
				pole[i][j] = "X";
				kontrPole[i][j] = 1;
				break;
				}
			}	
			return new EndGame().result(kontrPole);
	}
}
