import java.awt.Color;
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
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Display {

	public JFrame frame;
	private JTextField MoneyValue;
	private JTextPane smallcase;
	private JTextPane amt;
	private JTextPane ppold;
	private JTextPane pppre;
	private JTextPane proamt;
	
	public StyledDocument docSC;  
	public StyledDocument docamt;
	public StyledDocument docppold;
	public StyledDocument docpppre;
	public StyledDocument docproamt;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		Display ob=new Display();
//		ob.display();
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display window = new Display();
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
		pppre.setText("");
		proamt.setText("");
		

		
		GMain gob = new GMain();
//		gob.Gadd(1, 1000, "dfbsdg", 88.57);
//		 SC.setText("sdf\n");
//		 textPane.set
		 
		 
		String [] arr;
		arr = gob.gdis();

		for(int i=0;i<=gob.stin;i++) {
			if(arr[i]!=null) {
				
				int x=(int)(arr[i].charAt(0))-48;
				String dis = arr[i].substring(1,arr[i].length());
//				System.out.println(dis);

//				docSC.insertString(docSC.getLength(), "hfgh", null);
				
				String tmp[] = dis.split(" ");
				
					docSC.insertString(docSC.getLength(), tmp[0]+"\n", null);
					docamt.insertString(docamt.getLength(), tmp[1]+"\n", null);
					docppold.insertString(docppold.getLength(), tmp[2]+"\n", null);
					
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
					}			
				
				
			}	
		}
		

		
		
	}
	
	
	public Display() throws BadLocationException {
		initialize();
		
		UserFrame ob= new UserFrame();
		int x=ob.money;
		MoneyValue.setText(Integer.toString(x));
		
//		display();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 874, 453);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
//		Color c =new Color(51,204,255); /*----light blue---*/
//		Color c =new Color(204,204,204); /*----light gray---*/
//		Color c =new Color(255,255,204); /*----light Yellow---*/
//		Color c =new Color(102,0,153); /*----purple---*/		
//		frame.getContentPane().setBackground(c);  /*-----------------------*/
		
		
		JLabel lblNewLabel = new JLabel("Wallet : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(687, 12, 72, 38);
		frame.getContentPane().add(lblNewLabel);
		
		MoneyValue = new JTextField();
		MoneyValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		MoneyValue.setEditable(false);
		MoneyValue.setColumns(10);
		MoneyValue.setBounds(756, 20, 79, 25);
		frame.getContentPane().add(MoneyValue);
		
		JTextArea txtrSmallCasesBuyed = new JTextArea();
		txtrSmallCasesBuyed.setEditable(false);
		txtrSmallCasesBuyed.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtrSmallCasesBuyed.setText("Small Cases Buyed         Amount           Profit Percentage        Profit Percentage             Profit\r\n                                   Invested            (When bought)              (Present)              (If Sold now)");
		txtrSmallCasesBuyed.setBounds(33, 58, 802, 65);
		frame.getContentPane().add(txtrSmallCasesBuyed);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);

				UserFrame ob = new UserFrame();
				ob.frame.setVisible(true);

			}
		});
		btnNewButton.setBounds(725, 355, 110, 32);
		frame.getContentPane().add(btnNewButton);
		
		
		
		amt = new JTextPane();
		amt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		amt.setBounds(217, 153, 102, 170);
		frame.getContentPane().add(amt);
		docamt = amt.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center,StyleConstants.ALIGN_CENTER);
		docamt.setParagraphAttributes(0, docamt.getLength(), center, false);
		
		
		
		ppold = new JTextPane();
		ppold.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ppold.setBounds(381, 153, 102, 170);
		frame.getContentPane().add(ppold);
		docppold = ppold.getStyledDocument();
		StyleConstants.setAlignment(center,StyleConstants.ALIGN_CENTER);
		docppold.setParagraphAttributes(0, docppold.getLength(), center, false);
		
		
		
		
		smallcase = new JTextPane();
		smallcase.setFont(new Font("Tahoma", Font.PLAIN, 15));
		smallcase.setBounds(38, 153, 130, 170);
		frame.getContentPane().add(smallcase);
		docSC = smallcase.getStyledDocument();
//		doc.insertString(doc.getLength(), "hfgh", null);
//		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center,StyleConstants.ALIGN_CENTER);
		docSC.setParagraphAttributes(0, docSC.getLength(), center, false);
		
		
		pppre = new JTextPane();
		pppre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pppre.setBounds(556, 155, 92, 168);
		frame.getContentPane().add(pppre);
		docpppre = pppre.getStyledDocument();
		StyleConstants.setAlignment(center,StyleConstants.ALIGN_CENTER);
		docpppre.setParagraphAttributes(0, docpppre.getLength(), center, false);
		
		proamt = new JTextPane();
		proamt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		proamt.setBounds(725, 153, 102, 170);
		frame.getContentPane().add(proamt);
		docproamt = proamt.getStyledDocument();
		StyleConstants.setAlignment(center,StyleConstants.ALIGN_CENTER);
		docproamt.setParagraphAttributes(0, docproamt.getLength(), center, false);
	}
}
