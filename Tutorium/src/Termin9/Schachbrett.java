package Termin9;

public class Schachbrett {
	boolean[][] brett = new boolean[8][8];
	
	public void setzeTurm(int x, int y) {
		for (int row = 0; row < brett.length; row++) {
			for (int col = 0; col < brett[row].length; col++) {
				if (row == x || col == y) {
					brett[row][col] = true;
				}
			}
		}
	}
	
	public void gibBedrohteFelderAus() {
		for (int row = 0; row < brett.length; row++) {
			for (int col = 0; col < brett[row].length; col++) {
				System.out.print(brett[row][col] ? "X " : "O ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Schachbrett sb = new Schachbrett();
		sb.gibBedrohteFelderAus();
		sb.setzeTurm(3, 5);
		sb.gibBedrohteFelderAus();
	}
	
}
