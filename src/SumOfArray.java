import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		double sum = 0.0;
		Scanner in = new Scanner(System.in);
		double myList[] = new double[5];
		System.out.println("Hey Friend, Pleaes enter five numbers: ");
		for (int i = 0; i < 5; i++) {
			myList[i] = in.nextDouble();
		}
		for (int i = 0; i < 5; i++) {
			sum += myList[i];
		}
		System.out.println("Sum of the Numbers= " + sum);
		in.close();
	}

}
