import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Popcorn p = new Popcorn("Caramel");
	Microwave m = new Microwave();
	m.startMicrowave();
	m.putInMicrowave(p);
	String flavor = JOptionPane.showInputDialog("What flavor do you want your Popcorn to be");
	String time = JOptionPane.showInputDialog("How long do you want it to cook?");
	int t = Integer.parseInt(time); 
	m.setTime(t);
	Popcorn p2 = new Popcorn(flavor);
	
}
}

