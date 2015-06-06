import java.util.Scanner;

public class Report_CvetyA {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How does Ivo tasks ranging for 15th days?");

		int[] tasks = new int[] { 2, 5, 9, 7, 1, 6, 3, 4, 8, 7, 6, 9, 10, 13, 4 };
		int sum = 0;
		for (int i = 0; i < tasks.length; i++) {
			tasks[i] = tasks[i] + tasks[i];
			sum += tasks[i] / 2;
		}
		System.out.println("Finished tasks for 15th all days: " + sum);

		System.out.println("Enter day from: ");
		int m = sc.nextInt();
		int[] days1 = new int[m];
		System.out.println("Enter day to: ");
		int s = sc.nextInt();
		int[] days = new int[s];
		int[] tasks1 = new int[] { 2 ,5, 9, 7, 1, 6, 3, 4, 8, 7, 6, 9, 10, 13, 4 };
		int sumN = 0;

		for (int k = m; k < s; k++) {
			sumN += tasks1[k];
		}
		System.out.println("Finished tasks for all days: " + sumN);

		System.out.println("Enter day from: ");
		int p = sc.nextInt();
		int[] days2 = new int[p];
		System.out.println("Enter day to: ");
		int l = sc.nextInt();
		int[] days3 = new int[l];
		int[] tasks3 = new int[] { 2, 5, 9, 7, 1, 6, 3, 4, 8, 7, 6, 9, 10, 13, 4 };
		int sumM = 0;

		for (int j = p; j < l; j++) {	
			sumM += tasks3[j];
		}
		System.out.println("Finished tasks for all days: " + sumM);

		System.out.println("Enter day from: ");
		int f = sc.nextInt();
		int[] days4 = new int[f];
		System.out.println("Enter day to: ");
		int e = sc.nextInt();
		int[] days5 = new int[e];
		int[] tasks4 = new int[] { 2, 5, 9, 7, 1, 6, 3, 4, 8, 7, 6, 9, 10, 13, 4 };
		int sumR = 0;

		for (int h = f; h < e; h++) {
			sumR += tasks4[h];
		}
		System.out.println("Finished tasks for all days: " + sumR);

		System.out.println("Enter day from: ");
		int m1 = sc.nextInt();
		int[] days6 = new int[m1];
		System.out.println("Enter day to: ");
		int s1 = sc.nextInt();
		int[] days7 = new int[s1];
		int[] tasks6 = new int[] { 2, 5, 9, 7, 1, 6, 3, 4, 8, 7, 6, 9, 10, 13, 4 };
		int sumT = 0;

		for (int c = m1; c < s1; c++) {
			sumT += tasks6[c];
		}
		System.out.println("Finished tasks for all days: " + sumT);

		System.out.println("Enter day from: ");
		int y = sc.nextInt();
		int[] days8 = new int[y];
		System.out.println("Enter day to: ");
		int w = sc.nextInt();
		int[] days9 = new int[w];
		int[] tasks7 = new int[] { 2, 5, 9, 7, 1, 6, 3, 4, 8, 7, 6, 9, 10, 13, 4};
		int sumD = 0;

		for (int g = y; g < w; g++) {
			sumD += tasks7[g];
		}
		System.out.println("Finished tasks for all days: " + sumD);
		
		while (true) {
			System.out.println("\n" + "How does Ivo tasks every day?");
			System.out.println("Enter day: ");
			int n = sc.nextInt();
			int[] day = new int[n];
			int[] tasks2 = { 2, 5, 9, 7, 1, 6, 3, 4, 8, 7, 6, 9, 10, 13, 4 };
			int sum1 = 0;

			for (int task = 0; task < day.length; task += n) {
				tasks2[n] = tasks2[n];
				sum1 = tasks2[n];
			}
			System.out.println("Finished tasks:" + sum1 + " tasks");
		}
	}
}
