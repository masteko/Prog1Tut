package Termin7;

public class Array {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		fillWithTwoLoops(arr);
		print(arr);
		
		System.out.println("----------------");
		int[][] simple = new int[5][5];
		for (int i = 0; i < simple.length; i++) {
			simple[i][i] = i + 1;
		}
		print(simple);
		
		System.out.println("----------------");
		
		int[][] arr2 = new int[5][5];
		fillWithOneLoop(arr2);
		print(arr2);

	}
	
	public static void fillWithTwoLoops(int[][] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for(int j = 0; j < arr[i].length; j++) {
				if (i + j == 4) {
					arr[i][j] = j + 1;		
					break;
				}
			}
		}	
	}
	
	
	
	
	public static void fillWithOneLoop(int[][] arr) {
		for (int i = arr.length -1; i >= 0; i--) {
			arr[i][arr.length - 1 - i] = arr.length - i;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}	
	}
}
