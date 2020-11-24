import javax.swing.JOptionPane;

public class JoptionArray {
	public static void printArray(String array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your Name?");
		String age = JOptionPane.showInputDialog("What is your Age?");
		String email = JOptionPane.showInputDialog("What is your Email?");
		String faculty = JOptionPane.showInputDialog("What is your Faculty?");
		String dep = JOptionPane.showInputDialog("What is your department?");
		String mob = JOptionPane.showInputDialog("What is your mobile?");
		String myData[] = { name, age, email, faculty, dep, mob };
		System.out.println("Hey, Here are your data: ");
		printArray(myData);
	}
}
