import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Tata {

	public JFrame frame;
	private JTextField BuyValue;
	public JTextField Wallet;
	public JTextField profit;
	
	static double AWppval=14.23; 
	static int ppchk=1; 
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tata window = new Tata();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	void AWpp() {
		
				
		switch(ppchk) {
			
		case 1: AWppval-=12.3;
				BigDecimal b1 = new BigDecimal(AWppval).setScale(2, RoundingMode.HALF_UP);
				AWppval = b1.doubleValue();
				ppchk++;
				break;
				
		case 2: AWppval-=0.3;
				BigDecimal b2 = new BigDecimal(AWppval).setScale(2, RoundingMode.HALF_UP);
				AWppval = b2.doubleValue();
				ppchk++;
				break;
		
		case 3: AWppval+=5.3;
				BigDecimal b3 = new BigDecimal(AWppval).setScale(2, RoundingMode.HALF_UP);
				AWppval = b3.doubleValue();
				ppchk++;
				break;
		
		case 4: AWppval-=0.9;
				BigDecimal b4 = new BigDecimal(AWppval).setScale(2, RoundingMode.HALF_UP);
				AWppval = b4.doubleValue();
				ppchk++;
				break;
		
		default : 
					AWppval+=8.7;
					BigDecimal b5 = new BigDecimal(AWppval).setScale(2, RoundingMode.HALF_UP);
					AWppval = b5.doubleValue();
					ppchk=1;
					break;
				
		}	
		
	}
	
	
	/**
	 * Create the application.
	 */
	public Tata() {
		initialize(0,0,null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(int Pin,int Amt,String Stock) {
		frame = new JFrame();
		frame.setBounds(100, 100, 441, 539);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Small Case: House of Tata");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(37, 34, 325, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea txtrMininum = new JTextArea();
		txtrMininum.setEditable(false);
		txtrMininum.setText("This smallcase will invest in few companies under Tata group.\r\n\r\nTata Consultancy service : 30%\r\nTata Motars Tata Steel : 20%\r\nTitan Tata Capital : 15%\r\nTata power : 25%\r\nTata digital and Electronics : 10% \r\n\r\nMininum Investment : 6000");
		txtrMininum.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrMininum.setBounds(37, 78, 360, 148);
		frame.getContentPane().add(txtrMininum);
		UserFrame back =new  UserFrame();
		
		
		
		JButton btnNewButton = new JButton("BUY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int value = Integer.parseInt(BuyValue.getText());
				
				
				//UserFrame back =new  UserFrame();
				int M=back.money;
				//int M=1000000000;
				
				
				if(value>=1000)
				{
				
				if(value<=M)
				{
					int balance=M - value;
					back.money=balance;
//					back.user1.insert(123,value,"All Weather");
					
					GMain gob=new GMain();
//					System.out.println("before:");
//					gob.testprint();
					
					gob.Gadd(4, value, "House_of_Tata",AWppval);
					AWpp();
					
					
//					System.out.println("After:");
//					gob.testprint();
//					gob.Gadd(3, value, "walmart");

//					System.out.println("Value of n = "+gob.n);
//					gob.gdis();					

//					System.out.println("------------------------------------------------");
//					String [] arr;
//					arr=gob.gdis();
////					System.out.println("stin: "+gob.stin);
//					for(int i=0;i<gob.stin;i++) {	
//							
//						if(arr[i]!=null) {
//							System.out.println(arr[i]);
//							
//						}
//							
//					}
//					System.out.println("------------------------------------------------");
					


////					back.tmpa.setText((arr[i]));
//					System.out.println(arr[0])ss;
					
					JOptionPane.showMessageDialog(null, "SmallCase Buyed");
					
					back.MoneyValue.setText(Integer.toString(back.money));
					frame.setVisible(false);
					back.frame.setVisible(true);
					
//					Node head = new Node (Pin,Amt,Stock);
//					head = back.user1.head ; 
//					while(head!=null)
//					{
//						if(head.SCPin==123)
//							JOptionPane.showMessageDialog(null, (Integer.toString(head.SCPin))+" "+(head.SCStock)+" "+(Integer.toString(head.SCAmt)));	
//						head=head.next;					
//					}
										
					
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
		btnNewButton.setBounds(34, 437, 148, 49);
		frame.getContentPane().add(btnNewButton);
		
		BuyValue = new JTextField();
		BuyValue.setFont(new Font("Tahoma", Font.PLAIN, 19));
		BuyValue.setText("6000");
		BuyValue.setBounds(312, 233, 82, 49);
		frame.getContentPane().add(BuyValue);
		BuyValue.setColumns(10);
		
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
				ob.tataprofit.setText(tmp);
				
				
				TopFive TT = new TopFive();
				TT.AWpp();
				String tmpTT=TT.AWppval+"%";
				ob.TTprofit.setText(tmpTT);
				
				AllWeatherFrame all = new AllWeatherFrame();
				all.AWpp();
				String tmpall = all.AWppval+"%";
				ob.AWprofit.setText(tmpall);
				
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
		btnNewButton_1.setBounds(249, 437, 148, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JTextArea Preview = new JTextArea();
		Preview.setBounds(37, 292, 360, 127);
		frame.getContentPane().add(Preview);
		
		JButton btnPreview = new JButton("Preview");
		btnPreview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float tc,tm,tt,tp,td;
				
				int value=Integer.parseInt(BuyValue.getText());
				
				if(value>=6000)
				{
				
				tc = (value*30)/100;
				tm = (value*20)/100;
				tt = (value*15)/100;
				tp = (value*25)/100;
				td = (value*10)/100;
				
				Preview.setText(
						"Tata Consultancy service(30%) = " +(Float.toString(tc))+ "\nTata Motars Tata Steel(20%) = " +(Float.toString(tm))+  "\nTata Motars Tata Steel(20%) = " +(Float.toString(tm))+  "\nTata power(25%) = " +(Float.toString(tp))+  "\nTata digital and Electronics(10%) = " +(Float.toString(td))
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
		btnPreview.setBounds(37, 231, 148, 49);
		frame.getContentPane().add(btnPreview);
		
		Wallet = new JTextField();
		Wallet.setEditable(false);
		Wallet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Wallet.setBounds(324, 13, 70, 20);
		frame.getContentPane().add(Wallet);
		Wallet.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Wallet :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(269, 16, 56, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Profit:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(37, 13, 56, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		profit = new JTextField();
		profit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		profit.setEditable(false);
		profit.setColumns(10);
		profit.setBounds(81, 13, 95, 20);
		frame.getContentPane().add(profit);
		
		textField = new JTextField();
		textField.setText("Amt:");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(256, 234, 46, 48);
		frame.getContentPane().add(textField);
	}
}
