import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class password {

	public JFrame frame;
	public JTextField textField;
	public JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					password window = new password();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public password() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 511, 347);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
//		Color c =new Color(255,255,204); /*----light Yellow---*/
//		frame.getContentPane().setBackground(c);  /*-----------------------*/

		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(194, 68, 93, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lbljfshg = new JLabel("USER NAME");
		lbljfshg.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lbljfshg.setBounds(56, 127, 123, 25);
		frame.getContentPane().add(lbljfshg);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(56, 180, 123, 25);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField.setBounds(243, 129, 153, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 19));
		password.setBounds(243, 184, 153, 25);
		frame.getContentPane().add(password);
		
		JButton Loginbtn = new JButton("LOGIN");
		Loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username= textField.getText();
				String pass=password.getText();
				
				
				if(username.contains("true") && pass.contains("true"))
				{
					textField.setText(null);
					password.setText(null);
					frame.setVisible(false);
					UserFrame next=new UserFrame();
					next.frame.setVisible(true);
					
					//frame1.main(null);
					//frame.dispose();
					//frame.setVisible(false);

					//dummycase openn=new dummycase();
					//openn.setVisible(true);
					//frame.setVisible(true);
										
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid login","ERROR",JOptionPane.ERROR_MESSAGE);
				//	,"ERROR",JOptionPane.ERROR_MESSAGE
					textField.setText(null);
					password.setText(null);
				}
			}
		});
		Loginbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Loginbtn.setBounds(36, 247, 93, 35);
		frame.getContentPane().add(Loginbtn);
		
		JButton Resetbtn = new JButton("RESET");
		Resetbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				password.setText(null);
			}
		});
		Resetbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Resetbtn.setBounds(200, 247, 93, 35);
		frame.getContentPane().add(Resetbtn);
		
		JButton Exitbtn = new JButton("EXIT");
		Exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
			
		});
		Exitbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Exitbtn.setBounds(375, 247, 93, 35);
		frame.getContentPane().add(Exitbtn);
		
		JLabel lblWelcomeToSmallcase = new JLabel("Welcome to Smallcase Investment");
		lblWelcomeToSmallcase.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblWelcomeToSmallcase.setBounds(36, 10, 439, 61);
		frame.getContentPane().add(lblWelcomeToSmallcase);
	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
	}
}
