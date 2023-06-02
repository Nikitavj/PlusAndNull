package Krestiki;

public class StatusPole {
	
	public void actualPole(String[][] pole) {
		
		
		for (int i = 0; i < pole.length; i++) {
			for (int j = 0; j < pole[i].length; j++) {
				if ( i < (pole.length - 1) && j < (pole[i].length - 1)) {
					System.out.print( pole[i][j] + "_|_");
				}
				if ( j == pole[i].length - 1) {
					System.out.print( pole[i][j]);
				}
				if ( i == pole.length - 1 && j < pole[i].length - 1) {
					System.out.print( pole[i][j] + " | ");
				}	
			}
			System.out.println();
		}
	}
}
