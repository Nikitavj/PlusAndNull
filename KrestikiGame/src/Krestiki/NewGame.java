package Krestiki;

import java.util.Arrays;
import java.util.Scanner;

public class NewGame {

	public static void main(String[] args) {
		
		
		
		
		System.out.println("КРЕКСТИКИ-НОЛИКИ"
				+ "\n"
				+ "\nТы играешь за X."
				+ "\nБот играет за O."
				+ "\nВводишь координаты целевой ячейки, начиная с 0.");//приветствие
		System.out.println();
		System.out.println("Введи размер поля, целое число более двух:");
		int sizePole = 0;
		do {
			sizePole = new Scanner(System.in).nextInt();
			if ( sizePole < 3) {
				System.out.println("Введи целое число больше 2:");
			} else {
				break;
			}
			
		} while (true);

		
		
		new GameCycle().process(sizePole);// процесс игры
		
		System.out.println("Игра окончена...");
	}
}
