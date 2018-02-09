import javax.swing.JOptionPane;

public class Everythingisawesome {
	public static void main(String[] args) {

		String stuff = JOptionPane.showInputDialog("What do you like?");
		JOptionPane.showMessageDialog(null, stuff + " is awesome!");

	}
}
