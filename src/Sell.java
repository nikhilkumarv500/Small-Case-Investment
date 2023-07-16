import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Sell {

	public JFrame frame;
	private JTextField MoneyValue;
	private JTextPane smallcase;
	private JTextPane amt;
	private JTextPane ppold;
	private JTextPane pppre;
	private JTextPane proamt;
	private JTextPane id;
	
	public StyledDocument docSC;  
	public StyledDocument docamt;
	public StyledDocument docppold;
	public StyledDocument docpppre;
	public StyledDocument docproamt;
	public StyledDocument docid;
	private JTextField txtEnterIdThat;
	private JTextField sellid;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		Display ob=new Display();
//		ob.display();
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sell window = new Sell();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws BadLocationException 
	 */
	void display() throws BadLocationException {
		
		smallcase.setText("");
		amt.setText("");
		ppold.setText("");
		id.setText("");
		pppre.setText("");
		proamt.setText("");
		
		
//		int choice=1;
		
		GMain gob = new GMain();
//		gob.Gadd(1, 1000, "dfbsdg", 88.57);


		 
		 
		String [] arr;
		arr = gob.gdis();


		
		if(gob.stin!=-1)
		{
				for(int i=0;i<=gob.stin;i++) {
					if(arr[i]!=null) {
						
						int x=(int)(arr[i].charAt(0))-48;
						String dis = arr[i].substring(1,arr[i].length());
//						System.out.println(dis);
		
		//				docSC.insertString(docSC.getLength(), "hfgh", null);
						
						String tmp[] = dis.split(" ");
						
//						if(choice==1) {
//							smallcase.setText(tmp[0]+"\n");
//							amt.setText(tmp[1]+"\n");
//							ppold.setText(tmp[2]+"\n");
//							id.setText(Integer.toString(x)+"\n");
//							choice=2;
//							
//							switch(x)
//							{ 
//								case 1: AllWeatherFrame ob1 = new AllWeatherFrame(); 
//										pppre.setText(Double.toString(ob1.AWppval)+"\n");
//										int cal1 = (int)(Integer.parseInt(tmp[1])*ob1.AWppval)/100;
//										proamt.setText(Integer.toString(cal1)+"\n");
//										break;
//										
//								case 2: TopFive ob2 = new TopFive();
//										pppre.setText(Double.toString(ob2.AWppval)+"\n");
//										int cal2 = (int)(Integer.parseInt(tmp[1])*ob2.AWppval)/100;
//										proamt.setText(Integer.toString(cal2)+"\n");
//										break;
//							
//							}
//						}
//						else
//						{
							docSC.insertString(docSC.getLength(), tmp[0]+"\n", null);
							docamt.insertString(docamt.getLength(), tmp[1]+"\n", null);
							docppold.insertString(docppold.getLength(), tmp[2]+"\n", null);
							docid.insertString(docid.getLength(), Integer.toString(x)+"\n", null);
							
							
							switch(x)
							{ 
								case 1: AllWeatherFrame ob1 = new AllWeatherFrame(); 
										docpppre.insertString(docpppre.getLength(),(Double.toString(ob1.AWppval))+"\n", null);
										int cal1 = (int)(Integer.parseInt(tmp[1])*ob1.AWppval)/100;
										docproamt.insertString(docproamt.getLength(), Integer.toString(cal1)+"\n", null);
										break;
										
								case 2: TopFive ob2 = new TopFive();
										docpppre.insertString(docpppre.getLength(),(Double.toString(ob2.AWppval))+"\n", null);
										int cal2 = (int)(Integer.parseInt(tmp[1])*ob2.AWppval)/100;
										docproamt.insertString(docproamt.getLength(), Integer.toString(cal2)+"\n", null);
										break;
										
								case 3:Green ge = new Green();
										docpppre.insertString(docpppre.getLength(),(Double.toString(ge.AWppval))+"\n", null);
										int cal3 = (int)(Integer.parseInt(tmp[1])*ge.AWppval)/100;
										docproamt.insertString(docproamt.getLength(), Integer.toString(cal3)+"\n", null);
										break;
							
								case 4:Tata hot = new Tata();
									docpppre.insertString(docpppre.getLength(),(Double.toString(hot.AWppval))+"\n", null);
									int cal4 = (int)(Integer.parseInt(tmp[1])*hot.AWppval)/100;
									docproamt.insertString(docproamt.getLength(), Integer.toString(cal4)+"\n", null);
									break;	
									
									
								case 5 : Electric em = new Electric();
										docpppre.insertString(docpppre.getLength(),(Double.toString(em.AWppval))+"\n", null);
										int cal5 = (int)(Integer.parseInt(tmp[1])*em.AWppval)/100;
										docproamt.insertString(docproamt.getLength(), Integer.toString(cal5)+"\n", null);
										break;	
//							}
						}
						
						
					}
						
				}
		}
		else
			JOptionPane.showMessageDialog(null, "All Small Case Sold");

		
		
	}
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public Sell() throws BadLocationException {
		initialize();
		
		UserFrame ob= new UserFrame();
		int x=ob.money;
		MoneyValue.setText(Integer.toString(x));
		
		txtEnterIdThat = new JTextField();
		txtEnterIdThat.setEditable(false);
		txtEnterIdThat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEnterIdThat.setText("Enter ID that you wish to sell :");
		txtEnterIdThat.setBounds(33, 347, 260, 35);
		frame.getContentPane().add(txtEnterIdThat);
		txtEnterIdThat.setColumns(10);
		
		sellid = new JTextField();
		sellid.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sellid.setBounds(310, 350, 53, 32);
		frame.getContentPane().add(sellid);
		sellid.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("SELL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int sid = Integer.parseInt(sellid.getText());
				
				GMain gob = new GMain();
				
				int returnval = gob.gdel(sid);
//				System.out.println("kalla");
				gob.gdis();
//				if(gob.stin!=-1)
//				{
					
						if(returnval!=-1)
						{
							UserFrame ufb = new UserFrame();
							int y=ufb.money;
							y+=returnval;
							ufb.money=y;
//							System.out.println(y);
							MoneyValue.setText(Integer.toString(ufb.money));
							
							

							
							try {
								display();
							} catch (BadLocationException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							
						
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Enter valid ID");
						}
				}
//				else
//					JOptionPane.showMessageDialog(null, "No small case bought");
				
//			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(644, 350, 102, 32);
		frame.getContentPane().add(btnNewButton_1);
		

		
//		display();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 958, 445);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Wallet : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(776, 10, 75, 38);
		frame.getContentPane().add(lblNewLabel);
		
		MoneyValue = new JTextField();
		MoneyValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		MoneyValue.setEditable(false);
		MoneyValue.setColumns(10);
		MoneyValue.setBounds(851, 18, 68, 25);
		frame.getContentPane().add(MoneyValue);
		
		JTextArea txtrSmallCasesBuyed = new JTextArea();
		txtrSmallCasesBuyed.setEditable(false);
		txtrSmallCasesBuyed.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtrSmallCasesBuyed.setText(" ID          Small Cases Buyed          Amount           Profit Percentage       Profit Percentage             Profit\r\n                                                   Invested            (When bought)             (Present)              (If Sold now)");
		txtrSmallCasesBuyed.setBounds(33, 58, 886, 65);
		frame.getContentPane().add(txtrSmallCasesBuyed);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				
				
				AllWeatherFrame ob1 = new AllWeatherFrame();
				ob1.AWpp();
				
				TopFive ob2 = new TopFive();
				ob2.AWpp();
				
				Green ge = new Green();
				ge.AWpp();
				
				Tata hot =new Tata();
				hot.AWpp();
				
				Electric em = new Electric();
				em.AWpp();
				
				
				
				UserFrame ob = new UserFrame();
				ob.frame.setVisible(true);

			}
		});
		btnNewButton.setBounds(802, 350, 110, 32);
		frame.getContentPane().add(btnNewButton);
		
		
		
		amt = new JTextPane();
		amt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		amt.setEditable(false);
		amt.setBounds(304, 153, 102, 166);
		frame.getContentPane().add(amt);
		docamt = amt.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center,StyleConstants.ALIGN_CENTER);
		docamt.setParagraphAttributes(0, docamt.getLength(), center, false);
		
		
		
		ppold = new JTextPane();
		ppold.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ppold.setEditable(false);
		ppold.setBounds(466, 153, 102, 166);
		frame.getContentPane().add(ppold);
		docppold = ppold.getStyledDocument();
		StyleConstants.setAlignment(center,StyleConstants.ALIGN_CENTER);
		docppold.setParagraphAttributes(0, docppold.getLength(), center, false);
		
		
		
		
		smallcase = new JTextPane();
		smallcase.setFont(new Font("Tahoma", Font.PLAIN, 15));
		smallcase.setEditable(false);
		smallcase.setBounds(116, 153, 135, 166);
		frame.getContentPane().add(smallcase);
		docSC = smallcase.getStyledDocument();
//		doc.insertString(doc.getLength(), "hfgh", null);
//		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center,StyleConstants.ALIGN_CENTER);
		docSC.setParagraphAttributes(0, docSC.getLength(), center, false);
		
		
		pppre = new JTextPane();
		pppre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pppre.setEditable(false);
		pppre.setBounds(644, 155, 92, 164);
		frame.getContentPane().add(pppre);
		docpppre = pppre.getStyledDocument();
		StyleConstants.setAlignment(center,StyleConstants.ALIGN_CENTER);
		docpppre.setParagraphAttributes(0, docpppre.getLength(), center, false);
		
		proamt = new JTextPane();
		proamt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		proamt.setEditable(false);
		proamt.setBounds(810, 153, 102, 166);
		frame.getContentPane().add(proamt);
		docproamt = proamt.getStyledDocument();
		StyleConstants.setAlignment(center,StyleConstants.ALIGN_CENTER);
		docproamt.setParagraphAttributes(0, docproamt.getLength(), center, false);
		
		
		id = new JTextPane();
		id.setFont(new Font("Tahoma", Font.PLAIN, 15));
		id.setEditable(false);
		id.setBounds(33, 153, 53, 166);
		frame.getContentPane().add(id);
		docid= id.getStyledDocument();
		StyleConstants.setAlignment(center,StyleConstants.ALIGN_CENTER);
		docid.setParagraphAttributes(0, docid.getLength(), center, false);
	}
}
