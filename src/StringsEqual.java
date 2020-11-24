import java.util.Scanner;

public class StringsEqual {

	public static void main(String[] args) {
		String name1;
		String name2;
		Scanner in = new Scanner(System.in);
		System.out.println("Hey friend, Please enter two names:");
		name1 = in.next();
		name2 = in.next();
		System.out.println(name1.equals(name2));
		in.close();
	}

}
