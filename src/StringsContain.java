import java.util.Scanner;

public class StringsContain {

	public static void main(String[] args) {
		String text1;
		String text2;
		Scanner in = new Scanner(System.in);
		System.out.println("Hey friend, Please enter two texts:");
		text1 = in.nextLine();
		text2 = in.nextLine();
		System.out.println(text1.contains(text2));
		in.close();
	}

}