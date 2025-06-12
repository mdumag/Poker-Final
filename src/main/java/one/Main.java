package one;

import javax.swing.*;

/**
 * Main class to create a JFrame and display the login panel.
 *
 * @author javiergs
 */
public class Main extends JFrame {
	
	public Main() {
		LoginNanny loginNanny = new LoginNanny(this);
		LoginPanel loginPanel = new LoginPanel(loginNanny);
		add(loginPanel);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setSize(400, 400);
		main.setLocationRelativeTo(null);
		main.setVisible(true);
	}
	
}

