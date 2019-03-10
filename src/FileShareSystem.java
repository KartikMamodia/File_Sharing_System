import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FileShareSystem extends JFrame {
	static JFrame frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					frame= new JFrame();
					frame.setVisible(true);
					frame.setLayout(null);
					frame.setSize(450,300);
					new FileShareSystem();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public FileShareSystem() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLibraryManagement = new JLabel("Welcome to personal File System.!");
		lblLibraryManagement.setBounds(90,30,330,50);
		frame.add(lblLibraryManagement);
		lblLibraryManagement.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLibraryManagement.setForeground(Color.BLUE);
	/**************************************************************************************************/	
		JButton btnAdminLogin = new JButton("Create Account");
		btnAdminLogin.setBounds(90,90,250,50);
		frame.add(btnAdminLogin);
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			CreateAccount.main(new String[]{});
			frame.dispose();
			}
		});
		btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
	/**************************************************************************************************/		
		JButton btnLibrarianLogin = new JButton("Login");
		btnLibrarianLogin.setBounds(90,160,250,50);
		frame.add(btnLibrarianLogin);
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserLogin.main(new String[]{});
				frame.dispose();
			}
		});
		
		btnLibrarianLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
	/**************************************************************************************************/	
	}
}
