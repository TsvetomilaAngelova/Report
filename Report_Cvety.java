import java.util.Scanner;

public class Report_Cvety {

	public static void main(String[] args) {
		//

		Scanner sc = new Scanner(System.in);
		
		System.out.println("How does Ivo tasks ranging from 10 days?");
		int[] array = new int[] { 3, 5, 6, 8, 9, 11, 2, 5, 7, 10, 4 };
		int sum = 0;

		for (int index = 0; index < array.length; index++) {
			array[index] = array[index] + array[index];
			sum += array[index] / 2;
		}
		System.out.println("Finished tasks for all days: " + sum);

		while (true) {
			System.out.println("\n" + "How does Ivo tasks every day?");
			System.out.println("Enter day: ");
			int n = sc.nextInt();
			int[] day = new int[n];
			int[] tasks = { 3, 5, 6, 8, 9, 11, 2, 12, 7, 10, 4 };
			int sum1 = 0;
			
			for (int task = 0; task < day.length; task += n) {
				tasks[n] = tasks[n];
				sum1 = tasks[n];
			}
			System.out.println("Finished tasks:" + sum1 + " tasks");

		}
	}
}
