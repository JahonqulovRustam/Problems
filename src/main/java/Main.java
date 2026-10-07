import java.util.Scanner;

public class Main {
	
	public static void main() {
		
		Scanner sc = new Scanner(System.in);
		SquareShapeComparator comparator = new SquareShapeComparator();
		
		System.out.print("Kvadrat uzunligini kiriting: ");
		int n = sc.nextInt();
		
		System.out.println("1- kvadrat piksel qiymatlarini kiriting: ");
		
		int[][] pixels1 = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				pixels1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("2-kvadrat piksel qiymatlarini kiriting: ");
		int[][] pixels2 = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				pixels2[i][j] = sc.nextInt();
			}
		}
		
		if (comparator.equals(pixels1, pixels2)) {
			System.out.println("Ushbu kvadratlar teng!");
		} else {
			System.out.println("Bular teng bo'la olmaydi!");
		}
		
		sc.close();
	}
}
