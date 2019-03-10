import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class DeleteMyData extends JFrame {
	static JFrame frame;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField_content;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String email) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JFrame();
					frame.setVisible(true);
					frame.setSize(400,300);
					frame.setLayout(null);
					
					new DeleteMyData(email);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DeleteMyData(String email) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel loginForm = new JLabel("Delete My Data.!");
		loginForm.setBounds(100,10,180,30);
		frame.add(loginForm);
		loginForm.setForeground(Color.GRAY);
		loginForm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel userEmail = new JLabel("Enter ID");
		userEmail.setBounds(30,80,100,30);
		frame.add(userEmail);
		JLabel userPassword = new JLabel("Enter Password:");
		userPassword.setBounds(30,130,100,30);
		frame.add(userPassword);
		
		textField_content = new JTextField();
		textField_content.setBounds(140,80,180,30);
		frame.add(textField_content);
		textField_content.setColumns(10);
		
		
		passwordField=new JPasswordField();
		passwordField.setBounds(140,130,180,30);
		frame.add(passwordField);
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(150,170,100,50);
		frame.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int id=Integer.parseInt(textField_content.getText());
			String password=String.valueOf(passwordField.getPassword());
			//System.out.println(name+" "+password);
			int i=DataDB.delete(id,email,password);
			if(i>0){
				JOptionPane.showMessageDialog(DeleteMyData.this,"Content deleted successfully!");
				UserSuccess.main(email);
			
				frame.dispose();
				
			}else{
				JOptionPane.showMessageDialog(DeleteMyData.this,"Sorry, unable to Delete!");
			}
			}
		});
	}
}
