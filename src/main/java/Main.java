import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Birinchi shaklning uzunligini kiriting: ");
		int shape1Len = sc.nextInt();
		System.out.print("Birinchi shaklning kengligini kiriting: ");
		int shape1Width = sc.nextInt();
		
		System.out.println("1 - shakl piksel qiymatlarini kiriting: ");
		int[][] pixels1 = new int[shape1Len][shape1Width];
		for (int i = 0; i < shape1Len; i++) {
			for (int j = 0; j < shape1Width; j++) {
				pixels1[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Ikkinchi shaklning uzunligini kiriting: ");
		int shape2Len = sc.nextInt();
		System.out.print("Ikkinchi shaklning kengligini kiriting: ");
		int shape2Width = sc.nextInt();
		System.out.println("2 - shakl piksel qiymatlarini kiriting: ");
		int[][] pixels2 = new int[shape2Len][shape2Width];
		for (int i = 0; i < shape2Len; i++) {
			for (int j = 0; j < shape2Width; j++) {
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
