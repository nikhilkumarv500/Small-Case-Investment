import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


public class BuyingSC {

	public JFrame frame;
	public JTextField MoneyValue;
	public JTextField AWprofit;
	public JTextField TTprofit;
	public JTextField GEprofit;
	public JTextField tataprofit;
	public JTextField EMprofit;
	
	public JTextPane SCsort;
	public StyledDocument docsort;
	
	public JTextPane SCsortnum;
	public StyledDocument docsortnum;
	private JTextField txtSmallcase;
	private JTextField txtProfit;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyingSC window = new BuyingSC();
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
	
	void sort() throws BadLocationException {
		
		double num[]=new double[5];
		String sc[] = new String[5];
		
		
		AllWeatherFrame AW = new AllWeatherFrame();
		num[0]=AW.AWppval;
		sc[0] = "All Weather";
		
		TopFive TT = new TopFive();
		num[1]=TT.AWppval;
		sc[1]="Top Three IT";

		Green ge = new Green();
		num[2]=ge.AWppval;
		sc[2]="Green Energy";

		Tata hot = new Tata();
		num[3]=hot.AWppval;
		sc[3] ="House of Tata ";
		

		
		Electric em = new Electric();
		num[4]=em.AWppval;
		sc[4]="Electric Mobility";
		
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(num[j]<num[j+1]) {
					
					double temp1 = num[j];
					num[j] = num[j+1];
					num[j+1] = temp1;
					
					String temp2 = sc[j];
					sc[j]=sc[j+1];
					sc[j+1] = temp2;
					
				}
			}
		}
		
		SCsort.setText(""); 
		SCsortnum.setText("");
		
		for(int i=0;i<n;i++) {
			
			docsort.insertString(docsort.getLength(), sc[i]+"\n\n", null);
			docsortnum.insertString(docsortnum.getLength(), num[i]+"\n\n", null);			
		}

		
		
	}
	public BuyingSC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 853, 533);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
//		Color c =new Color(255,255,204); /*----light Yellow---*/
//		frame.getContentPane().setBackground(c);  /*-----------------------*/
		
		JLabel lblNewLabel = new JLabel("Wallet : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(650, 10, 76, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Available SmallCase           Profits");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(29, 44, 406, 64);
		frame.getContentPane().add(lblNewLabel_1);
		
		UserFrame back = new UserFrame();
		
		JButton AllWeather = new JButton("All Weather ");
		AllWeather.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				
				AllWeatherFrame next = new AllWeatherFrame();
				
				String tmp=next.AWppval+"%";
				next.profit.setText(tmp);
				
				int balance=back.money;				
				next.Wallet.setText(Integer.toString(balance));
				next.frame.setVisible(true);
				
			}
		});
		AllWeather.setFont(new Font("Tahoma", Font.PLAIN, 19));
		AllWeather.setBounds(29, 113, 232, 43);
		frame.getContentPane().add(AllWeather);
		
		JButton Top5 = new JButton("Top Three IT");
		Top5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				
				TopFive next = new TopFive();
				String tmp=next.AWppval+"%";
				next.profit.setText(tmp);
				
				int balance=back.money;				
				next.Wallet.setText(Integer.toString(balance));
				next.frame.setVisible(true);
				
				
				
			}
		});
		Top5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		Top5.setBounds(29, 191, 232, 43);
		frame.getContentPane().add(Top5);
		
		MoneyValue = new JTextField();
		MoneyValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		MoneyValue.setEditable(false);
		MoneyValue.setBounds(725, 19, 84, 25);
		frame.getContentPane().add(MoneyValue);
		MoneyValue.setColumns(10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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

				
				//UserFrame back = new UserFrame(); //declared above
				back.MoneyValue.setText(Integer.toString(back.money));
				back.frame.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(685, 432, 124, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton refresh = new JButton("Refresh");
		refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AllWeatherFrame AW = new AllWeatherFrame();
				AW.AWpp();
				String tmpAW=AW.AWppval+"%";
				AWprofit.setText(tmpAW);
				
				TopFive TT = new TopFive();
				TT.AWpp();
				String tmpTT=TT.AWppval+"%";
				TTprofit.setText(tmpTT);

				Green ge = new Green();
				ge.AWpp();
				String tmpge = ge.AWppval+"%";
				GEprofit.setText(tmpge);
				
				Tata hot = new Tata();
				hot.AWpp();
				String tmphot = hot.AWppval+"%";
				tataprofit.setText(tmphot);
				
				Electric em = new Electric();
				em.AWpp();
				String tmpEM = em.AWppval+"%";
				EMprofit.setText(tmpEM);
				
				
				try {
					sort();
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		refresh.setFont(new Font("Tahoma", Font.PLAIN, 19));
		refresh.setBounds(488, 432, 124, 38);
		frame.getContentPane().add(refresh);
		
		 AWprofit = new JTextField();
		 AWprofit.setFont(new Font("Tahoma", Font.PLAIN, 19));
		AWprofit.setEditable(false);
		AWprofit.setColumns(10);
		AWprofit.setBounds(337, 118, 90, 33);
		frame.getContentPane().add(AWprofit);
		
		TTprofit = new JTextField();
		TTprofit.setFont(new Font("Tahoma", Font.PLAIN, 19));
		TTprofit.setEditable(false);
		TTprofit.setColumns(10);
		TTprofit.setBounds(337, 200, 90, 33);
		frame.getContentPane().add(TTprofit);
		
		JButton green = new JButton("Green Energy");
		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				
				Green next = new Green();
				String tmp=next.AWppval+"%";
				next.profit.setText(tmp);
				
				int balance=back.money;				
				next.Wallet.setText(Integer.toString(balance));
				next.frame.setVisible(true);
				
				
			}
		});
		green.setFont(new Font("Tahoma", Font.PLAIN, 19));
		green.setBounds(29, 269, 232, 43);
		frame.getContentPane().add(green);
		
		GEprofit = new JTextField();
		GEprofit.setFont(new Font("Tahoma", Font.PLAIN, 19));
		GEprofit.setEditable(false);
		GEprofit.setColumns(10);
		GEprofit.setBounds(337, 278, 90, 33);
		frame.getContentPane().add(GEprofit);
		
		JButton btnHouseOfTata = new JButton("House of Tata");
		btnHouseOfTata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				
				Tata next = new Tata();
				String tmp=next.AWppval+"%";
				next.profit.setText(tmp);
				
				int balance=back.money;				
				next.Wallet.setText(Integer.toString(balance));
				next.frame.setVisible(true);
				
			}
		});
		btnHouseOfTata.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnHouseOfTata.setBounds(29, 347, 232, 43);
		frame.getContentPane().add(btnHouseOfTata);
		
		tataprofit = new JTextField();
		tataprofit.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tataprofit.setEditable(false);
		tataprofit.setColumns(10);
		tataprofit.setBounds(337, 360, 90, 33);
		frame.getContentPane().add(tataprofit);
		
		JButton btnElectricMobility = new JButton("Electric Mobility");
		btnElectricMobility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame.setVisible(false);
				
				Electric next = new Electric();
				String tmp=next.AWppval+"%";
				next.profit.setText(tmp);
				
				int balance=back.money;				
				next.Wallet.setText(Integer.toString(balance));
				next.frame.setVisible(true);
				
			}
		});
		btnElectricMobility.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnElectricMobility.setBounds(29, 427, 232, 43);
		frame.getContentPane().add(btnElectricMobility);
		
		EMprofit = new JTextField();
		EMprofit.setFont(new Font("Tahoma", Font.PLAIN, 19));
		EMprofit.setEditable(false);
		EMprofit.setColumns(10);
		EMprofit.setBounds(337, 440, 90, 33);
		frame.getContentPane().add(EMprofit);
		
		SCsort = new JTextPane();
		SCsort.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SCsort.setEditable(false);
		SCsort.setBounds(485, 191, 152, 186);
		frame.getContentPane().add(SCsort);
		SimpleAttributeSet center = new SimpleAttributeSet();
		docsort = SCsort.getStyledDocument();
		StyleConstants.setAlignment(center,StyleConstants.ALIGN_CENTER);
		docsort.setParagraphAttributes(0, docsort.getLength(), center, false);
		
		SCsortnum = new JTextPane();
		SCsortnum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SCsortnum.setEditable(false);
		SCsortnum.setBounds(657, 191, 152, 186);
		frame.getContentPane().add(SCsortnum);
		
		JLabel lblNewLabel_1_1 = new JLabel("Highest Profit Leaderborad");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(472, 44, 337, 64);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		txtSmallcase = new JTextField();
		txtSmallcase.setEditable(false);
		txtSmallcase.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtSmallcase.setText("SmallCase");
		txtSmallcase.setBounds(507, 118, 105, 49);
		frame.getContentPane().add(txtSmallcase);
		txtSmallcase.setColumns(10);
		
		txtProfit = new JTextField();
		txtProfit.setText("Profit");
		txtProfit.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtProfit.setEditable(false);
		txtProfit.setColumns(10);
		txtProfit.setBounds(696, 118, 59, 49);
		frame.getContentPane().add(txtProfit);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(445, 44, 11, 427);
		frame.getContentPane().add(textArea);
		docsortnum = SCsortnum.getStyledDocument();
		StyleConstants.setAlignment(center,StyleConstants.ALIGN_CENTER);
		docsortnum.setParagraphAttributes(0, docsortnum.getLength(), center, false);
		
		
		
	}
}
