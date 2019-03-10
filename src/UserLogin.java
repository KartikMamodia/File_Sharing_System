import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class UserLogin extends JFrame {
	static JFrame frame;
	private JPanel contentPane;
	private JTextField textField_email;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JFrame();
					frame.setVisible(true);
					frame.setSize(400,300);
					frame.setLayout(null);
					
					new UserLogin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserLogin() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel loginForm = new JLabel("Sign-in");
		loginForm.setBounds(100,10,180,30);
		frame.add(loginForm);
		loginForm.setForeground(Color.GRAY);
		loginForm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel userEmail = new JLabel("Email-id");
		userEmail.setBounds(30,80,100,30);
		frame.add(userEmail);
		JLabel userPassword = new JLabel("Enter Password:");
		userPassword.setBounds(30,130,100,30);
		frame.add(userPassword);
		
		textField_email = new JTextField();
		textField_email.setBounds(140,80,180,30);
		frame.add(textField_email);
		textField_email.setColumns(10);
		
		
		passwordField=new JPasswordField();
		passwordField.setBounds(140,130,180,30);
		frame.add(passwordField);
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(150,170,100,50);
		frame.add(btnLogin);

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(280,170,80,40);
		frame.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			FileShareSystem.main(new String[]{});
			frame.dispose();
			}
		});

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String email=textField_email.getText();
			String password=String.valueOf(passwordField.getPassword());
			//System.out.println(name+" "+password);
			if(UserDB.validate(email, password)){
				UserSuccess.main(email);
				frame.dispose();
			}else{
				JOptionPane.showMessageDialog(UserLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				textField_email.setText("");
				passwordField.setText("");
			}
			}
		});
	}
}
