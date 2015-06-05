import java.util.Scanner;

public class Report_CvetyA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

			System.out.println("How does Ivo tasks ranging from 10 days?");

			int[] tasks = new int[] { 2, 5, 9, 7, 1, 6, 3, 4, 8, 7, 6 };
			int sum = 0;
			for (int i = 0; i < tasks.length; i++) {
				tasks[i] = tasks[i] + tasks[i];
				sum += tasks[i] / 2;
			}
			System.out.println("Finished tasks for all 10th days: " + sum);

				System.out.println("Enter day from 2nd day: ");
				int m = sc.nextInt();
				int[] days1 = new int[m];
				System.out.println("Enter day to 7th day : ");
				int s = sc.nextInt();
				int[] days = new int[s];
				int[] tasks1 = new int[] { 2, 5, 9, 7, 1, 6, 3, 4, 8, 7, 6 };
				int sumN = 0;

				for (int k = 2; k < tasks1.length - 3; k++) {
					tasks1[k] = tasks1[k] + tasks1[k];
					sumN += tasks1[k] / 2;
				}
				System.out.println("Finished tasks from 2nd to 7th days: "+ sumN);

					System.out.println("Enter day from 3rd day: ");
					int p = sc.nextInt();
					int[] days2 = new int[p];
					System.out.println("Enter day to 10th day : ");
					int l = sc.nextInt();
					int[] days3 = new int[l];
					int[] tasks3 = new int[] { 2, 5, 9, 7, 1, 6, 3, 4, 8, 7, 6 };
					int sumM = 0;

					for (int j = 3; j < tasks3.length; j++) {
						tasks3[j] = tasks3[j] + tasks3[j];
						sumM += tasks3[j] / 2;
					}
					System.out.println("Finished tasks from 3rd to 10th days: "+ sumM);

					
						System.out.println("Enter day from 4th day: ");
						int f = sc.nextInt();
						int[] days4 = new int[f];
						System.out.println("Enter day to 8th day : ");
						int e = sc.nextInt();
						int[] days5 = new int[e];
						int[] tasks4 = new int[] { 2, 5, 9, 7, 1, 6, 3, 4, 8,
								7, 6 };
						int sumR = 0;

						for (int h = 4; h < tasks4.length - 2; h++) {
							tasks4[h] = tasks4[h] + tasks4[h];
							sumR += tasks4[h] / 2;
						}
						System.out.println("Finished tasks from 4rd to 8th days: "+ sumR);

						
							System.out.println("Enter day from 5th day: ");
							int m1 = sc.nextInt();
							int[] days6 = new int[m1];
							System.out.println("Enter day to 9th day : ");
							int s1 = sc.nextInt();
							int[] days7 = new int[s1];
							int[] tasks6 = new int[] { 2, 5, 9, 7, 1, 6, 3, 4,
									8, 7, 6 };
							int sumT = 0;

							for (int c = 5; c < tasks6.length - 1; c++) {
								tasks6[c] = tasks6[c] + tasks6[c];
								sumT += tasks6[c] / 2;
							}
							System.out.println("Finished tasks from 5th to 9th days: "+ sumT);
									
						
								System.out.println("Enter day from 7th day: ");
								int y = sc.nextInt();
								int[] days8 = new int[y];
								System.out.println("Enter day to 10th day : ");
								int w = sc.nextInt();
								int[] days9 = new int[w];
								int[] tasks7 = new int[] { 2, 5, 9, 7, 1, 6, 3,
										4, 8, 7, 6 };
								int sumD = 0;

								for (int g = 7; g < tasks1.length; g++) {
									tasks7[g] = tasks7[g];
									sumD += tasks7[g];
								}
								System.out.println("Finished tasks from 7th to 10th days: "+ sumD);

								while (true) {
									System.out.println("\n"	+ "How does Ivo tasks every day?");
									System.out.println("Enter day: ");
									int n = sc.nextInt();
									int[] day = new int[n];
									int[] tasks2 = { 2, 5, 9, 7, 1, 6, 3, 4, 8,
											7, 6 };
									int sum1 = 0;

									for (int task = 0; task < day.length; task += n) {
										tasks2[n] = tasks2[n];
										sum1 = tasks2[n];
									}
									System.out.println("Finished tasks:" + sum1+ " tasks");
								}
							}
}

