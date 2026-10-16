import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main() {
		while (true) {
			System.out.println("1.Kvadratlar bilan ishlash\n2.To'rtburchaklar bilan ishlash");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1: processSquare();
					break;
				
				case 2: processRectangle();
					break;
				
				default: sc.close();
					return;
			}
		}
	}
	
	private static void processSquare() {
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
	}
	
	private static void processRectangle() {
		
		RectangleShapeComparator rectangleShapeComparator = new RectangleShapeComparator();
		System.out.print("To'rtburchak uzunligini kiriting: ");
		int n = sc.nextInt();
		
		System.out.println("1 - to'rtburchak piksel qiymatlarini kiriting: ");
		
		int[][] pixels1 = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				pixels1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("2 - to'rtburchak piksel qiymatlarini kiriting: ");
		int[][] pixels2 = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				pixels2[i][j] = sc.nextInt();
			}
		}
		
		if (rectangleShapeComparator.equals(pixels1, pixels2)) {
			System.out.println("Ushbu to'rtburchaklar teng!");
		} else {
			System.out.println("Bular teng bo'la olmaydi!");
		}
	}
}
