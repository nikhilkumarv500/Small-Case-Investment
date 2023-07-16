import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class DebitFrame {

	public JFrame frame;
	private JTextField CardNo;
	private JTextField AddedAmtValue;
	private JPasswordField PinCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DebitFrame window = new DebitFrame();
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
	public DebitFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 443, 435);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SECURE BANKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(74, 24, 275, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Card Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(28, 117, 132, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		CardNo = new JTextField();
		CardNo.setFont(new Font("Tahoma", Font.PLAIN, 19));
		CardNo.setBounds(196, 122, 193, 35);
		frame.getContentPane().add(CardNo);
		CardNo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pin Code");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(28, 185, 132, 42);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Amount");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(28, 257, 132, 42);
		frame.getContentPane().add(lblNewLabel_3);
		
		AddedAmtValue = new JTextField();
		AddedAmtValue.setFont(new Font("Tahoma", Font.PLAIN, 19));
		AddedAmtValue.setColumns(10);
		AddedAmtValue.setBounds(196, 260, 193, 35);
		frame.getContentPane().add(AddedAmtValue);
		
		JButton AddAmtBTN = new JButton("ADD");
		AddAmtBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cno=CardNo.getText();
				String pin=PinCode.getText();
				
				int cash=0;
				UserFrame menu = new UserFrame();
				//int a=menu.money;
				
				if((cno.contains("1") && pin.contains("1")) || (cno.contains("1234123412341234") && pin.contains("1234"))  ) 
				{
					//JOptionPane.showMessageDialog(null, menu.money);
					cash = menu.money + (Integer.parseInt(AddedAmtValue.getText()) );
					menu.money=cash;
					AddedAmtValue.setText(null);
					JOptionPane.showMessageDialog(null, "Transaction Successfull");
					
					menu.MoneyValue.setText(Integer.toString(menu.money));
					
					frame.setVisible(false);
					menu.frame.setVisible(true);
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Card number or password","ERROR",JOptionPane.ERROR_MESSAGE);
					PinCode.setText(null);
				}
				
			}
		});
		AddAmtBTN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		AddAmtBTN.setBounds(28, 331, 132, 42);
		frame.getContentPane().add(AddAmtBTN);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserFrame menu = new UserFrame();
				menu.MoneyValue.setText(Integer.toString(menu.money));
				frame.setVisible(false);
				menu.frame.setVisible(true);	
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBounds(242, 331, 147, 42);
		frame.getContentPane().add(btnBack);
		
		PinCode = new JPasswordField();
		PinCode.setFont(new Font("Tahoma", Font.PLAIN, 19));
		PinCode.setBounds(196, 194, 193, 35);
		frame.getContentPane().add(PinCode);
	}
}
