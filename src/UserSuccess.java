import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserSuccess extends JFrame {
	static JFrame frame;
	private JPanel contentPane;
 	static JLabel l; 
	
	public static void main(String email) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JFrame();
					frame.setSize(500,300);
					frame.setLayout(null);
					frame.setVisible(true);
					new UserSuccess(email);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UserSuccess(String email) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 433);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		l=new JLabel("User Email: "+email);
		l.setBounds(110,45,300,60);
		frame.add(l);
		l.setFont(new Font("Tahoma", Font.PLAIN, 13));


		JLabel lblStudentSection = new JLabel("Welcome");
		lblStudentSection.setBounds(180,10,100,50);
		frame.add(lblStudentSection);
		lblStudentSection.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton btnIssueButton = new JButton("Add Data");
		btnIssueButton.setBounds(120,90,220,30);
		frame.add(btnIssueButton);
		
		btnIssueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			filechooser.main(email);
			frame.dispose();
			}
		});
		btnIssueButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		
		JButton btnFine = new JButton("Delete My Data");
		btnFine.setBounds(120,170,220,30);
		frame.add(btnFine);
		btnFine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteMyData.main(email);
				frame.dispose();
			}
		});
		btnFine.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnViewIssuedBooks = new JButton("View My Data");
		btnViewIssuedBooks.setBounds(120,130,220,30);
		frame.add(btnViewIssuedBooks);
		btnViewIssuedBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewMyData.main(email);
			}
		});
		btnViewIssuedBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(180,210,110,30);
		frame.add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileShareSystem.main(new String[]{});
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
	}

}
