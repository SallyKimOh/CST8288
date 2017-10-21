/**
 * ShannonsView.java
 */
package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author Saeil Kim
 *
 */
public class ShannonsView extends JFrame implements Observer {

	int w = 280;
	int h = 20;
	int gap = 10;

	/**
	 * @throws HeadlessException
	 */
	public ShannonsView() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super();
	}


	public void BorderTest(){
		
		setBounds(100,200,630,500);
		setLayout(null);
		setTitle("Border Example ( SEXY.PE.KR )");

		JPanel p = new JPanel();
		p.setBounds(gap,gap,w,h);
		p.setBorder(new BevelBorder(BevelBorder.RAISED));
		p.setLayout(new BorderLayout());
		p.add(new JLabel("BevelBorder(BevelBorder.RAISED)",JLabel.CENTER));
		add(p);

		JPanel p2 = new JPanel();
		p2.setBounds(gap*2+w,gap,w,h);
		p2.setBorder(new BevelBorder(BevelBorder.LOWERED));
		p2.setLayout(new BorderLayout());
		p2.add(new JLabel("BevelBorder(BevelBorder.LOWERED)",JLabel.CENTER));
		add(p2);
		
		JPanel p3 = new JPanel();
		p3.setBounds(gap,gap*2+h,w,h);
		p3.setBorder(new LineBorder(Color.red, 5));
		p3.setLayout(new BorderLayout());
		p3.add(new JLabel("LineBorder(Color.red,5)",JLabel.CENTER));
		add(p3);

		setVisible(true);
	}


	   private JFrame mainFrame2;
	   private JPanel topPane = new JPanel(new GridBagLayout());
	   private JPanel pane = new JPanel(new GridBagLayout());
	   private JPanel pane1 = new JPanel(new GridBagLayout());
	
	public void run() {
		
		mainFrame2 = new JFrame("Shannon's Theorem");
		mainFrame2.setSize(600,400);
		mainFrame2.setLayout(new GridLayout(2, 1));

		pane.setSize(600,100);
		pane1.setSize(600,300);
	      
		JLabel label1 = new JLabel("Bandwidth(Hz)");
		JLabel label2 = new JLabel("Signal To Noise(db)");
		JLabel label3 = new JLabel("Maximum Data Rate(bps):");

		
		JTextField text1 = new JTextField(20);
		JTextField text2 = new JTextField(20);
		JTextField text3 = new JTextField(20);
		text3.setEnabled(false);

		text1.setText(String.valueOf(0.0));
		text2.setText(String.valueOf(0.0));
		text3.setText(String.valueOf(0.0));

		pane.setLayout(new GridBagLayout());
	    GridBagConstraints c1 = new GridBagConstraints();
	    c1.fill = GridBagConstraints.HORIZONTAL;

	    c1.weightx = 0.2;
	    c1.gridx = 0;
	    c1.gridy = 0;
	    c1.gridwidth = 1;
	    pane.add(label1, c1);

	    c1.gridx = 1;
	    c1.gridy = 0;
	    c1.ipady = 2;       //reset to default
	    c1.weighty = 0.8;   //request any extra vertical space
	    c1.gridwidth=3;
	    pane.add(text1, c1);

	    c1.weightx = 0.2;
	    c1.gridx = 0;
	    c1.gridy = 1;
	    c1.gridwidth = 1;
	    pane.add(label2, c1);

	    c1.gridx = 1;
	    c1.gridy = 1;
	    c1.ipady = 2;       //reset to default
	    c1.weighty = 0.8;   //request any extra vertical space
	    c1.gridwidth=3;
	    pane.add(text2, c1);

	    c1.weightx = 0.2;
	    c1.gridx = 0;
	    c1.gridy = 2;
	    c1.gridwidth = 1;

	    pane.add(label3, c1);

	    c1.weightx = 0.8;
	    c1.gridx = 1;
	    c1.gridy = 2;
	    c1.gridwidth = 3;

	      
	    c1.anchor = GridBagConstraints.PAGE_END; //bottom of space
	    c1.insets = new Insets(0,0,5,5);  //top padding
	      	      
	    pane.add(text3, c1);
	    pane.setBorder(new LineBorder(Color.BLUE));
	    pane.setBackground(Color.GREEN);

	      
		JLabel yLabel11 = new JLabel("Bandwidth(Hz)");
		JLabel yLabel21 = new JLabel("Signal To Noise(db)");
		JLabel yLabel31 = new JLabel("Maximum Data Rate(kbps):");

		JSlider jsliper11 = new JSlider(JSlider.HORIZONTAL,0,100,10);
		JSlider jsliper21 = new JSlider(JSlider.HORIZONTAL,0,100,10);
		JSlider jsliper31 = new JSlider(JSlider.HORIZONTAL,0,100,10);
				
		jsliper11.setMaximum(9300); //최대값
		jsliper11.setMinimum(0); //최소값
		jsliper11.setValue(0); //초기값
		jsliper11.setMajorTickSpacing(1000); //큰 눈금 간격
		jsliper11.setMinorTickSpacing(300); //작은 눈금 간격
		
		jsliper11.setPaintLabels(true); //값 표시
		jsliper11.setPaintTicks(true); //눈금 표시	
		      
		jsliper21.setMaximum(3000); //최대값
		jsliper21.setMinimum(0); //최소값
		jsliper21.setValue(0); //초기값
		jsliper21.setMajorTickSpacing(300); //큰 눈금 간격
		jsliper21.setMinorTickSpacing(300); //작은 눈금 간격
		
		jsliper21.setPaintLabels(true); //값 표시
		jsliper21.setPaintTicks(true); //눈금 표시	
		
		jsliper31.setMaximum(9800); //최대값
		jsliper31.setMinimum(0); //최소값
		jsliper31.setValue(0); //초기값
		jsliper31.setMajorTickSpacing(1000); //큰 눈금 간격
		jsliper31.setMinorTickSpacing(200); //작은 눈금 간격
		
		jsliper31.setPaintLabels(true); //값 표시
		jsliper31.setPaintTicks(true); //눈금 표시	
		jsliper31.setEnabled(false);

				
		pane1.setLayout(new GridBagLayout());
		GridBagConstraints c11 = new GridBagConstraints();
		c11.fill = GridBagConstraints.HORIZONTAL;

		c11.weightx = 0.2;
		c11.gridx = 0;
		c11.gridy = 0;
		c11.gridwidth = 1;
//		c11.gridheight = 2;
		pane1.add(yLabel11, c11);

		c11.gridx = 1;
		c11.gridy = 0;
		c11.ipady = 2;       //reset to default
		c11.weighty = 0.8;   //request any extra vertical space
		c11.gridwidth=3;
//		c11.gridheight = 2;
		pane1.add(jsliper11, c11);

		c11.weightx = 0.2;
		c11.gridx = 0;
		c11.gridy = 1;
		c11.gridwidth = 1;
//		c11.gridheight = 2;
		pane1.add(yLabel21, c11);

		c11.gridx = 1;
		c11.gridy = 1;
		c11.ipady = 2;       //reset to default
		c11.weighty = 0.8;   //request any extra vertical space
		c11.gridwidth=3;
//		c11.gridheight = 2;
		pane1.add(jsliper21, c11);

		c11.weightx = 0.2;
		c11.gridx = 0;
		c11.gridy = 2;
		c11.gridwidth = 1;
//		c11.gridheight = 2;
//
		pane1.add(yLabel31, c11);

		c11.weightx = 0.8;
		c11.gridx = 1;
		c11.gridy = 2;
		c11.gridwidth = 3;
//		c11.gridheight = 2;

		      
//		c11.anchor = GridBagConstraints.PAGE_END; //bottom of space
		c11.insets = new Insets(0,0,0,0);  //top padding
		pane1.add(jsliper31, c11);

		pane1.setBorder(new LineBorder(Color.BLUE));
		pane1.setBackground(Color.ORANGE);
		      
		jsliper11.setBackground(Color.ORANGE);
		jsliper21.setBackground(Color.ORANGE);
		jsliper31.setBackground(Color.ORANGE);

	
		mainFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ShannonsModel shModel = new ShannonsModel();

	    
	    jsliper11.addChangeListener(new ChangeListener() {
		      public void stateChanged(ChangeEvent event) {
		        int value = jsliper11.getValue();
		        text1.setText(String.valueOf(value));

		        shModel.setBandwidth(Double.parseDouble(text1.getText()));
		        shModel.setSignalToNoise(Double.parseDouble(text1.getText()));
		        
		        double mdr = shModel.getMaximumDataRate();	 
		        text3.setText(String.valueOf(mdr));

		        jsliper31.setValue((int)mdr);
		      
		      
		      }
		    });
	    
	    
	    jsliper21.addChangeListener(new ChangeListener() {
		      public void stateChanged(ChangeEvent event) {
		        int value = jsliper21.getValue();
		        text2.setText(String.valueOf(value));
		        shModel.setBandwidth(Double.parseDouble(text1.getText()));
		        shModel.setSignalToNoise(Double.parseDouble(text1.getText()));
		        
		        double mdr = shModel.getMaximumDataRate();	 
		        text3.setText(String.valueOf(mdr));
		        jsliper31.setValue((int)mdr);
		        
		      }
		    });
	    

	    text1.addKeyListener(new KeyAdapter() {
	        public void keyPressed(KeyEvent evt) {
	          int key = evt.getKeyCode();
	          if (key == KeyEvent.VK_ENTER) {
	        	  System.out.println("ok");

	        	  shModel.setBandwidth(Double.parseDouble(text1.getText()));
	        	  shModel.setSignalToNoise(Double.parseDouble(text2.getText()));
			        
			      double mdr = shModel.getMaximumDataRate();
		          text3.setText(String.valueOf(mdr));
			      
			      jsliper11.setValue((int)Double.parseDouble(text1.getText()));
			      jsliper21.setValue((int)Double.parseDouble(text2.getText()));
			      jsliper31.setValue((int)mdr);
	          
//	        	  transferFocus();
	          }
	          
	        }
	      });
	    
	    text2.addKeyListener(new KeyAdapter() {
	        public void keyPressed(KeyEvent evt) {
	          int key = evt.getKeyCode();
	          if (key == KeyEvent.VK_ENTER) {
	        	  System.out.println("ok");

	        	  shModel.setBandwidth(Double.parseDouble(text1.getText()));
	        	  shModel.setSignalToNoise(Double.parseDouble(text2.getText()));
			        
			      double mdr = shModel.getMaximumDataRate();
		          text3.setText(String.valueOf(mdr));
			      
			      jsliper11.setValue((int)Double.parseDouble(text1.getText()));
			      jsliper21.setValue((int)Double.parseDouble(text2.getText()));
			      jsliper31.setValue((int)mdr);
	          
//	        	  transferFocus();
	          }
	          
	        }
	      });
	    
	    
	    
	    mainFrame2.add(pane);
	    mainFrame2.add(pane1);
	    mainFrame2.setLocationRelativeTo(null);
	    mainFrame2.setVisible(true);	    
	    
	    
	    
	    
		
		
	}
/*
	public void run() {
		
		JFrame frame = new JFrame("Shannon's Theorem");
//		JOptionPane.showMessageDialog(null, "FDS","", JOptionPane.PLAIN_MESSAGE);


		JPanel jpMain = new JPanel(new BorderLayout());
		JLabel label1 = new JLabel("Bandwidth(Hz)");
		JLabel label2 = new JLabel("Signal To Noise(db)");
		JLabel label3 = new JLabel("Maximum Data Rate(bps):");
		
//		JTextField text1 = new JTextField("0.0");
//		JTextField text2 = new JTextField("0.0");
//		JTextField text3 = new JTextField("0.0");
//		text3.setEnabled(false);
//		
//		JPanel yPanel = new JPanel(new BorderLayout());
//		JLabel yLabel1 = new JLabel("Bandwidth(Hz)");
//		JLabel yLabel2 = new JLabel("Signal To Noise(db)");
//		JLabel yLabel3 = new JLabel("Maximum Data Rate(kbps):");
//
//		JSlider jsliper1 = new JSlider();
//		JSlider jsliper2 = new JSlider();
//		JSlider jsliper3 = new JSlider();
//		
//		jsliper1.setMaximum(9300); //최대값
//		jsliper1.setMinimum(0); //최소값
//		jsliper1.setValue(0); //초기값
//		jsliper1.setMajorTickSpacing(1000); //큰 눈금 간격
//		jsliper1.setMinorTickSpacing(300); //작은 눈금 간격
//
//		jsliper1.setPaintLabels(true); //값 표시
//		jsliper1.setPaintTicks(true); //눈금 표시	
//		
//		jsliper2.setMaximum(3000); //최대값
//		jsliper3.setMinimum(0); //최소값
//		jsliper3.setValue(0); //초기값
//		jsliper3.setMajorTickSpacing(300); //큰 눈금 간격
//		jsliper3.setMinorTickSpacing(300); //작은 눈금 간격
//
//		jsliper2.setPaintLabels(true); //값 표시
//		jsliper2.setPaintTicks(true); //눈금 표시	
//
//		jsliper3.setMaximum(10000); //최대값
//		jsliper3.setMinimum(0); //최소값
//		jsliper3.setValue(0); //초기값
//		jsliper3.setMajorTickSpacing(1000); //큰 눈금 간격
//		jsliper3.setMinorTickSpacing(200); //작은 눈금 간격
//
//		jsliper3.setPaintLabels(true); //값 표시
//		jsliper3.setPaintTicks(true); //눈금 표시	
//		jsliper3.setEnabled(false);
//		


		
		
		String[] msg = {"아래버튼", "위버튼", "오른쪽버튼", "왼쪽버튼", "가운데버튼"};

		Color[] color = {new Color(255,128,0), new Color(251,33,13),new Color(15,223,0),new Color(72,22,243),new Color(236,12,253)};

		String[] location = {"South", "North","East","West","Center"};

		Button[] btn = new Button[msg.length]; //배열

		Button btn1 = new Button("South");

		 

		Panel panelNorth = new Panel(); // 패널(위) 생성

		Panel panelSouth = new Panel(); // 패널(아래) 생성

//		panelNorth.add(label1); // panel 안에 btn.length의 버튼 삽입
//		panelNorth.add(label2); // panel 안에 btn.length의 버튼 삽입
//		panelNorth.add(label3); // panel 안에 btn.length의 버튼 삽입

		jpMain.add(label1); // panel 안에 btn.length의 버튼 삽입
		jpMain.add(label2); // panel 안에 btn.length의 버튼 삽입
		
		
		
//		frame.add(panelNorth, "North"); // add로 패널 추가
		frame.add(jpMain); // add로 패널 추가

//		frame.add(panelSouth, "South"); // add로 패널 추가

		 

		
		
		
		// 프레임 크기 지정
		frame.setSize(500,300);

		// 프레임 보이기
		frame.setVisible(true);

		// swing에만 있는 X버튼 클릭시 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);
		
		
	}
*/
	private void setController(ShannonsController sc) {
		
	}
	
	
	
	/**
	 * @param gc
	 */
//	public ShannonsView(GraphicsConfiguration gc) {
//		super(gc);
//		// TODO Auto-generated constructor stub
//	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
//	public ShannonsView(String title) throws HeadlessException {
//		super(title);
//		// TODO Auto-generated constructor stub
//	}

	/**
	 * @param title
	 * @param gc
	 */
//	public ShannonsView(String title, GraphicsConfiguration gc) {
//		super(title, gc);
//		// TODO Auto-generated constructor stub
//	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

}
