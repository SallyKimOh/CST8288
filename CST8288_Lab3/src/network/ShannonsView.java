/**
 * ShannonsView.java
 */
package network;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Saeil Kim
 *
 */
public class ShannonsView extends JFrame implements Observer {

//	int w = 280;
//	int h = 20;
//	int gap = 10;

	private JFrame mainFrame;
	private JPanel firstPane;
	private JPanel secondPane;
	private ShannonsController shCont;


	/**
	 * @throws HeadlessException
	 */
	public ShannonsView() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super();
	}

	private JFrame mainFrame2;
	private JPanel topPane = new JPanel(new GridBagLayout());
	private JPanel pane = new JPanel(new GridBagLayout());
	private JPanel pane1 = new JPanel(new GridBagLayout());
	   
	public void run() {
		mainFrame = new JFrame("Shannon's Theorem");
		mainFrame.setSize(600,400);
		mainFrame.setLayout(new GridLayout(2, 1));
//
//		setContentPane(createContentPanel());
		
		setDefaultCloseOperation( DISPOSE_ON_CLOSE);
		setContentPane(createContentPanel());
		pack();
//		setLocationRelativeTo(null);
//		setVisible(true);
		
		
		firstPane = createContentPanel();
		
//		secondPane = createContentPanel();
		
//		setController(shCont);
//		shCont.AddObserver(this);

		
//		ShannonsJTextFieldPanel sc = new ShannonsJTextFieldPanel(shCont);
//		sc.setBandwidth(100);
//		sc.setSignalToNoise(100);
//		sc.createPanel();
		
//		setController(new SchannonsController());
//		ShannonsJTextFieldPanel textFieldPanel = new ShannonsJTextFieldPanel(sc);
		

//		setDefaultCloseOperation( DISPOSE_ON_CLOSE);
//		setContentPane(createGUI());
//		pack();
		
		
//	    mainFrame.add(sc);
	    mainFrame.add(firstPane);
//	    mainFrame.add(secondPane);
	    mainFrame.setLocationRelativeTo(null);
	    mainFrame.setVisible(true);	    
		
	}
	
/*	
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
	
*/	
	private JPanel createContentPanel() {
	
	JPanel pane = new JPanel(new GridBagLayout());
//		return pane;
		
		ShannonsJTextFieldPanel sc = new ShannonsJTextFieldPanel(new ShannonsTheorem());
		
		sc.createPanel();
		pane.add(sc);
		return pane;
		
		
	}
	
	
	public void setController(ShannonsController sc) {
		shCont = new ShannonsTheorem();
	}
	
	
	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("update calling view");

	}

}
