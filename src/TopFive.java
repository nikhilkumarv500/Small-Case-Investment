import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.awt.event.ActionEvent;

public class TopFive {

	public JFrame frame;
	public JTextField profit;
	public JTextField Wallet;
	private JTextField BuyValue;

	static double AWppval= 8.23; 
	static int ppchk=1; 
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TopFive window = new TopFive();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	void AWpp() {
		
		
		switch(ppchk) {
			
		case 1: AWppval+=2.3;
				BigDecimal b1 = new BigDecimal(AWppval).setScale(2, RoundingMode.HALF_UP);
				AWppval = b1.doubleValue();
				ppchk++;
				break;
				
		case 2: AWppval-=8.3;
				BigDecimal b2 = new BigDecimal(AWppval).setScale(2, RoundingMode.HALF_UP);
				AWppval = b2.doubleValue();
				ppchk++;
				break;
		
		case 3: AWppval+=2.3;
				BigDecimal b3 = new BigDecimal(AWppval).setScale(2, RoundingMode.HALF_UP);
				AWppval = b3.doubleValue();
				ppchk++;
				break;
		
		case 4: AWppval-=1.9;
				BigDecimal b4 = new BigDecimal(AWppval).setScale(2, RoundingMode.HALF_UP);
				AWppval = b4.doubleValue();
				ppchk++;
				break;
		
		default : 
					AWppval+=1.7;
					BigDecimal b5 = new BigDecimal(AWppval).setScale(2, RoundingMode.HALF_UP);
					AWppval = b5.doubleValue();
					ppchk=1;
					break;
				
		}	
		
	}
	
	/**
	 * Create the application.
	 */
	public TopFive() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 448, 575);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Profit:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(44, 10, 53, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		profit = new JTextField();
		profit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		profit.setEditable(false);
		profit.setColumns(10);
		profit.setBounds(85, 10, 75, 20);
		frame.getContentPane().add(profit);
		
		JLabel lblNewLabel_1 = new JLabel("Wallet:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(274, 13, 56, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		Wallet = new JTextField();
		Wallet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Wallet.setEditable(false);
		Wallet.setColumns(10);
		Wallet.setBounds(329, 10, 75, 20);
		frame.getContentPane().add(Wallet);
		
		JLabel lblSmallCaseTop = new JLabel("Small Case: Top Three IT");
		lblSmallCaseTop.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSmallCaseTop.setBounds(44, 46, 327, 49);
		frame.getContentPane().add(lblSmallCaseTop);
		
		JTextArea txtrWrongDesccripionThis = new JTextArea();
		txtrWrongDesccripionThis.setText("This small case invests in top 3 IT companies using Nifty IT\r\nindex.\r\n\r\nTata Consultancy service : 45%\r\nInfosys : 35%\r\nHCL Technologies : 20%\r\n\r\nMininum Investment : 2000");
		txtrWrongDesccripionThis.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrWrongDesccripionThis.setEditable(false);
		txtrWrongDesccripionThis.setBounds(44, 90, 360, 135);
		frame.getContentPane().add(txtrWrongDesccripionThis);
		
		JTextArea Preview = new JTextArea();
		Preview.setBounds(44, 307, 360, 127);
		frame.getContentPane().add(Preview);
		
		JButton btnPreview = new JButton("Preview");
		btnPreview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float tata,infosys,hcl;
				
				int value=Integer.parseInt(BuyValue.getText());
				
				if(value>=2000)
				{
				
				tata = (value*45)/100;
				infosys = (value*35)/100;
				hcl = (value*20)/100;
				
				Preview.setText(
						"Tata Consultancy service(45%) = " +(Float.toString(tata))+ "\nInfosys(35%) = " +(Float.toString(infosys))+  "\nHCL Technologies(20%) = " +(Float.toString(hcl))
							);
				Preview.append("\n-----------------------------\nTotal = " +value);						
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Order");
				}
				
			}
		});
		btnPreview.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnPreview.setBounds(41, 235, 148, 49);
		frame.getContentPane().add(btnPreview);
		
		BuyValue = new JTextField();
		BuyValue.setText("2000");
		BuyValue.setFont(new Font("Tahoma", Font.PLAIN, 19));
		BuyValue.setColumns(10);
		BuyValue.setBounds(329, 235, 75, 49);
		frame.getContentPane().add(BuyValue);
		

		
		JButton btnNewButton = new JButton("BUY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int value = Integer.parseInt(BuyValue.getText());
				
				
				UserFrame back =new  UserFrame();
				int M=back.money;
				//int M=1000000000;
				
				
				if(value>=2000)
				{
				
				if(value<=M)
				{
					int balance=M - value;
					back.money=balance;

					
					GMain gob=new GMain();

					
					gob.Gadd(2, value, "Top_Three_IT",AWppval);
					AWpp();
					
					

					
					JOptionPane.showMessageDialog(null, "SmallCase Buyed");
					
					back.MoneyValue.setText(Integer.toString(back.money));
					frame.setVisible(false);
					back.frame.setVisible(true);
					
				
				}
				else {
					JOptionPane.showMessageDialog(null, "Insufficient Balance");
				}
				
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Order");
				}
						
				
			}
			
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton.setBounds(41, 460, 148, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//back.money=9999;
				frame.setVisible(false);
				UserFrame back =new  UserFrame();
				
				BuyingSC ob = new BuyingSC();
				ob.MoneyValue.setText(Integer.toString(back.money));
				AWpp();
				String tmp=AWppval+"%";
				ob.TTprofit.setText(tmp);
				
				
				
				AllWeatherFrame  AW= new AllWeatherFrame();
				AW.AWpp();
				String tmpAW=AW.AWppval+"%";
				ob.AWprofit.setText(tmpAW);
				
				Tata hot = new Tata();
				hot.AWpp();
				String tmphot = hot.AWppval+"%";
				ob.tataprofit.setText(tmphot);
				
				Green ge = new Green();
				ge.AWpp();
				String tmpge = ge.AWppval+"%";
				ob.GEprofit.setText(tmpge);
				
				Electric em = new Electric();
				em.AWpp();
				String tmpEM = em.AWppval+"%";
				ob.EMprofit.setText(tmpEM);
				
				try {
					ob.sort();
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				ob.frame.setVisible(true);
				
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_1.setBounds(256, 460, 148, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setText("Amt:");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(268, 235, 46, 48);
		frame.getContentPane().add(textField);
	}
}
