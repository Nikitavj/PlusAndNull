package Krestiki;

public class EndGame {

	public boolean result(int[][] mas) {
		
		int rez = 0;
		
		for ( int i = 0; i < mas.length; i++) { // проверка строк на победу
			int rezult = 0;
			for (int j = 0; j < mas[i].length; j++) {
				if ( mas[i][j] != 0) { 
				rezult += mas[i][j];
				}
			}
			if ( rezult == -(mas.length)) {
				rez = -1;
			}
			if ( rezult == (mas.length)) {
				rez = 1;
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			int rezult = 0;
			for (int j = 0; j < mas[i].length; j++) { // проверка столбцов на победу
				if ( mas[j][i] != 0) { 
				rezult += mas[j][i]; 
				}
			}
			if ( rezult == -(mas.length)) {
				rez = -1;
			}
			if ( rezult == (mas.length)) {
				rez = 1;
			}
		}
		
		int rezult1 = 0;
		for ( int i = 0; i < mas.length; i++) { // проверка первой диагонали сверху вниз на победу
			if ( mas[i][i] != 0) { 
			rezult1 += mas[i][i];
			}
		}
			if ( rezult1 == -(mas.length)) {
				rez = -1;
			}
			if ( rezult1 == (mas.length)) {
				rez = 1;
			}
		
			int rezult2 = 0;
			for ( int i = mas.length - 1, j = 0; j < mas.length -1 && i >= 0; j++, i--) { // проверка первой диагонали сверху вниз на победу
				if ( mas[i][j] != 0) { 
				rezult2 += mas[i][j];
				}
			}
				if ( rezult2 == -(mas.length)) {
					rez = -1;
				}
				if ( rezult2 == (mas.length)) {
					rez = 1;
				}	
		
		switch (rez) {
		case 1: 
			System.out.println("Ты победил!");
			break;
		case -1: 
			System.out.println("Ты проиграл!");
			break;	
		}		
				
		int nichia = 0; // условие НИЧЬЯ
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if ( mas[i][j] == 0) {
					nichia++;
				}
			}
		}
		if( nichia == 0) {
			System.out.println("Ничья!");
			rez = 2;
		}

		boolean statusGame = false;
		if ( rez == 1 || rez == 2 || rez == -1) {
			statusGame = true;
		} 
		return statusGame;
	}
}

	
