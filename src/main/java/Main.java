import java.util.Scanner;

public class Main {
	public static void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Shakl uzunligini kiriting: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println("1 - shakl piksel qiymatlarini kiriting: ");
		int[][] pixels1 = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				pixels1[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Shakl uzunligini kiriting: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("2 - shakl piksel qiymatlarini kiriting: ");
		int[][] pixels2 = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				pixels2[i][j] = sc.nextInt();
			}
		}
		
		if (RectangleShapeComparator.equals(pixels1, pixels2)) {
			System.out.println("Ushbu shakllar teng!");
		} else {
			System.out.println("Bular teng bo'la olmaydi!");
		}
	}
}
