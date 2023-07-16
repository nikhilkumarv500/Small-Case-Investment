import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

//import dataStructureLinkedList.LinkedList;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;



public class UserFrame {

	public static int imag=0;

	GMain gob = new GMain();
	
	protected static int money = 0;
	public JFrame frame;
	private JTextField txtWelcomeUser;
	private JLabel lblNewLabel;
	public JTextField MoneyValue;
	public JButton SellSC;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserFrame window = new UserFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
//	int oriind=0;
//	void gindexsave(int n) {
//		oriind=n; 
//	}
//	int gindexreturn() {
//		return oriind;
//	}

	/**
	 * Create the application.
	 */
	public UserFrame() {
		initialize(0,0,null);
		MoneyValue.setText(Integer.toString(money));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(int Pin,int Amt,String Stock) {
		frame = new JFrame();
		frame.setBounds(100, 100, 491, 415);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtWelcomeUser = new JTextField();
		txtWelcomeUser.setBackground(Color.WHITE);
		txtWelcomeUser.setEditable(false);
		txtWelcomeUser.setFont(new Font("Tahoma", Font.BOLD, 31));
		txtWelcomeUser.setText("MAIN MENU");
		txtWelcomeUser.setBounds(130, 36, 201, 47);
		frame.getContentPane().add(txtWelcomeUser);
		txtWelcomeUser.setColumns(10);
		
		lblNewLabel = new JLabel("Wallet");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(289, 112, 69, 38);
		frame.getContentPane().add(lblNewLabel);
		
		MoneyValue =new JTextField();
		MoneyValue.setBackground(Color.WHITE);
		MoneyValue.setEditable(false);
		MoneyValue.setFont(new Font("Tahoma", Font.PLAIN, 19));
		MoneyValue.setBounds(345, 112, 107, 38);
		frame.getContentPane().add(MoneyValue);
		MoneyValue.setColumns(10);
		
	
		
		MoneyValue.setText(Integer.toString(money));
		
		//LinkedList user1 = new LinkedList();
		
		JButton Moneybtn = new JButton("ADD MONEY");
		Moneybtn.setFont(new Font("Tahoma", Font.PLAIN, 19));
		Moneybtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DebitFrame debit = new 	DebitFrame();				
				frame.setVisible(false);
				debit.frame.setVisible(true);
				
				//DebitFrame.main(null);
			}
		});
		Moneybtn.setBounds(22, 105, 190, 47);
		frame.getContentPane().add(Moneybtn);
		
		JButton BuySC = new JButton("Buy SmallCase");
		BuySC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				
				
				BuyingSC next = new BuyingSC();
				
				
				AllWeatherFrame AW = new AllWeatherFrame();
				String tmpAW=AW.AWppval+"%";
				next.AWprofit.setText(tmpAW);
				
				TopFive TT = new TopFive();
				String tmpTT=TT.AWppval+"%";
				next.TTprofit.setText(tmpTT);
				
				Green ge = new Green();
				String tmpge = ge.AWppval+"%";
				next.GEprofit.setText(tmpge);
				
				Tata hot = new Tata();
				String tmphot = hot.AWppval+"%";
				next.tataprofit.setText(tmphot);
				
				Electric em = new Electric();
				String tmpEM = em.AWppval+"%";
				next.EMprofit.setText(tmpEM);
				
				
//				BuyingSC  = new BuyingSC();
				try {
					next.sort();
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				next.MoneyValue.setText(Integer.toString(money));
				next.frame.setVisible(true);
				
				//BuyingSC.main(null);
				
				
				
			}
		});
		BuySC.setFont(new Font("Tahoma", Font.PLAIN, 19));
		BuySC.setBounds(22, 171, 190, 47);
		frame.getContentPane().add(BuySC);
		
		
		JButton btnNewButton = new JButton("Display SmallCase");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JOptionPane.showMessageDialog(null,"Balance amount: "+ money);
				

				

//				/*------------------------------------------------*/
//				tmpa.setText(null);
//				
//				GMain gob = new GMain();
//				
//
//				String [] arr;
//				arr=gob.gdis();
//
//				for(int i=0;i<gob.stin;i++) {	
//					
//					if(arr[i]!=null) {
////						System.out.println(arr[i]);
//						tmpa.append((arr[i])+"\n");
//						
//					}
//						
//				}
//				/*-------------------------------------------------*/
				
				GMain chk = new GMain();
				chk.gdis();
				if(chk.stin==-1) {
					
					JOptionPane.showMessageDialog(null, "NO SmallCase Buyed!");
				}
				else
				{
				
				
						frame.setVisible(false);
						
						AllWeatherFrame ob1 = new AllWeatherFrame();
						ob1.AWpp();
						
						TopFive ob2 = new TopFive();
						ob2.AWpp();
						
						Green ge = new Green();
						ge.AWpp();
						
						Tata hot = new Tata();
						hot.AWpp();

						Electric em = new Electric();
						em.AWpp();

						
						
						Display dis = null;
						try {
							dis = new Display();
						} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
		
						try {
							dis.display();
						} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						
						

						
						
						
						dis.frame.setVisible(true);
				
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(22, 308, 190, 47);
		frame.getContentPane().add(btnNewButton);
		
		SellSC = new JButton("Sell SmallCase");
		SellSC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				GMain chk = new GMain();
				chk.gdis();
				
				if(chk.stin==-1) {
					
					JOptionPane.showMessageDialog(null, "NO SmallCase Buyed!");
				}
				else
				{
				
				
						frame.setVisible(false);
						
						Sell dis = null;
						try {
							dis = new Sell();
						} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
		
						try {
							dis.display();
						} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						
						
//						AllWeatherFrame ob1 = new AllWeatherFrame();
//						ob1.AWpp();
				

						
						
						
						dis.frame.setVisible(true);
				
				}
				
				
				
			}
		});
		SellSC.setFont(new Font("Tahoma", Font.PLAIN, 19));
		SellSC.setBounds(22, 239, 190, 47);
		frame.getContentPane().add(SellSC);
		
		JButton btnNewButton_1 = new JButton("LOGOUT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				password back = new password(); 
				back.frame.setVisible(true);
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_1.setBounds(334, 312, 118, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}
