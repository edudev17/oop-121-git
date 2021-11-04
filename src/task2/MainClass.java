package task2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator") + "|\n");

		System.out.print("Enter maximum number of apples in the inventory: ");
		int n = sc.nextInt();
		
		AppleList myArr = new AppleList(n);
		
		//Apple apl;
		String sort, color;
		double diameter;
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the apple sort: ");
			sort = sc.next();
			System.out.print("Enter the apple color: ");
			color = sc.next();
			System.out.print("Enter the apple diameter: ");
			diameter = sc.nextDouble();

			Apple myApl = new Apple(sort, color, diameter);

			myArr.addApple(myApl, i);
		}
		System.out.println("-------------------------------------");
		myArr.printList();
		sc.close();
	}
}