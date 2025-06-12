package one;

import javax.swing.*;
import java.awt.*;

/**
 * Create a panel for user login.
 *
 * @author javiergs
 */
public class LoginPanel extends JPanel {
	
	public LoginPanel(LoginNanny joinRoomNanny) {
		JLabel titleLabel = new JLabel("Let's start!");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel subtitleLabel = new JLabel("Join the room:");
		subtitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel accountLabel = new JLabel("Already have an account?");
		accountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		JTextField nameField = new JTextField("Enter your name");
		JButton enterButton = new JButton("Enter");
		JButton loginButton = new JButton("Login");
		
		setLayout(new GridLayout(6, 1));
		add(titleLabel);
		add(subtitleLabel);
		add(nameField);
		add(enterButton);
		add(accountLabel);
		add(loginButton);
		
		enterButton.addActionListener(e -> joinRoomNanny.enterRoom(nameField.getText()));
		loginButton.addActionListener(e -> joinRoomNanny.login(nameField.getText()));
	}
	
}

