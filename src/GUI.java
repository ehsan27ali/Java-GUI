import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	

	private static JFrame frame;
	private static JPanel panel;
	private static JLabel username_label;
	private static JTextField username_text;
	private static JLabel password_label;
	private static JPasswordField password_text;
	private static JButton login_button;
	private static JLabel successful_login;
	
	public static void main(String[] args) {
		
		frame = new JFrame();
		panel = new JPanel();
		frame.setSize(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		username_label = new JLabel("Username: ");
		username_label.setBounds(10, 20, 80, 25);
		panel.add(username_label);
		
		username_text = new JTextField();
		username_text.setBounds(100, 20, 165, 25);
		panel.add(username_text);
		
		password_label = new JLabel("Password: ");
		password_label.setBounds(10, 50, 80, 25);
		panel.add(password_label);
		
		password_text = new JPasswordField();
		password_text.setBounds(100, 50, 165, 25);
		panel.add(password_text);
		
		login_button = new JButton("Login");
		login_button.setBounds(10, 80, 80, 25);
		login_button.addActionListener(new GUI());
		panel.add(login_button);
		
		
		successful_login = new JLabel();
		successful_login.setBounds(10, 110, 300, 25);
		panel.add(successful_login);
		
		
		
		
		
		
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(username_text.getText()+ " " + password_text.getText());
		
		if(username_text.getText().equals("ehsan27ali") && password_text.getText().equals("password"))
			successful_login.setText("Login successful.");
	}

}