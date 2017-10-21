/**
 * Test.java
 */
package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Hashtable;

import javax.swing.BoundedRangeModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author Saeil Kim
 *
 */
public class Test {

	   public Test(){
//		      prepareGUI();
		      prepareGUI2();
		   }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getJSlider();
//		getSlide2();
//		getThumb();
//		getTick();

		Test  swingControlDemo = new Test();      
		swingControlDemo.showSliderDemo2();
		
	}

	public static void getJSlider() {
		JFrame frame = new JFrame("Tick Slider");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JSlider jSliderOne = new JSlider();

	    jSliderOne.setPaintLabels(true);
	    
	    Hashtable<Integer, JLabel> table = new Hashtable<Integer, JLabel>();
	    table.put (0, new JLabel(new ImageIcon("yourFile.gif")));
	    table.put (10, new JLabel("Ten"));
	    table.put (25, new JLabel("Twenty-Five"));
	    table.put (34, new JLabel("Thirty-Four"));
	    table.put (52, new JLabel("Fifty-Two"));
	    table.put (70, new JLabel("Seventy"));
	    table.put (82, new JLabel("Eighty-Two"));
	    jSliderOne.setLabelTable (table);
	    
	    frame.add(jSliderOne, BorderLayout.NORTH);
	    frame.setSize(300, 200);
	    frame.setVisible(true);
		
	}
	
	 public static void getThumb() {
		    JFrame frame = new JFrame("Tick Slider");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    // No Ticks
		    JSlider jSliderOne = new JSlider();
		    Icon icon = new ImageIcon("yourFile.gif");
		    UIDefaults defaults = UIManager.getDefaults();
		    defaults.put("Slider.horizontalThumbIcon", icon);

		    frame.add(jSliderOne, BorderLayout.NORTH);
		    frame.setSize(300, 200);
		    frame.setVisible(true);
	 }	
	
	  public static void getSlide2() {
		    JFrame frame = new JFrame();

		    JPanel main = new JPanel(new GridLayout(2, 1));
		    JPanel scrollBarPanel = new JPanel();
		    final JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 48, 0, 255);
		    int height = scrollBar.getPreferredSize().height;
		    scrollBar.setPreferredSize(new Dimension(175, height));
		    scrollBarPanel.add(scrollBar);
		    main.add(scrollBarPanel);

		    JPanel sliderPanel = new JPanel();
		    final JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
		    slider.setMajorTickSpacing(48);
		    slider.setMinorTickSpacing(16);
		    slider.setPaintTicks(true);
		    sliderPanel.add(slider);
		    main.add(sliderPanel);

		    frame.add(main, BorderLayout.CENTER);

		    scrollBar.addAdjustmentListener(new AdjustmentListener() {
		      public void adjustmentValueChanged(AdjustmentEvent e) {
		        System.out.println("JScrollBar's current value = " + scrollBar.getValue());
		      }
		    });

		    slider.addChangeListener(new ChangeListener() {
		      public void stateChanged(ChangeEvent e) {
		        System.out.println("JSlider's current value = " + slider.getValue());
		      }
		    });

		    frame.pack();
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
		  }	 
	 
	  public static void getTick() {
		    JFrame frame = new JFrame("Tick Slider");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    JSlider jSliderOne = new JSlider();

		    // Major Tick 25 - Minor 5
		    jSliderOne.setMinorTickSpacing(5);
		    jSliderOne.setMajorTickSpacing(25);
		    jSliderOne.setPaintTicks(true);
		    jSliderOne.setSnapToTicks(true);

		    frame.add(jSliderOne, BorderLayout.NORTH);
		    frame.setSize(300, 200);
		    frame.setVisible(true);
		  } 

	   private JFrame mainFrame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel;

	   private void prepareGUI(){
	      mainFrame = new JFrame("Java Swing Examples");
	      mainFrame.setSize(400,400);
	      mainFrame.setLayout(new GridLayout(3, 1));
	      
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      headerLabel = new JLabel("", JLabel.CENTER);        
	      statusLabel = new JLabel("",JLabel.CENTER);    
	      statusLabel.setSize(350,100);

	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      mainFrame.setVisible(true);  
	   }
	   
	   private void showSliderDemo(){
	      headerLabel.setText("Control in action: JSlider"); 
	      JSlider slider = new JSlider(JSlider.HORIZONTAL,0,100,10);
	      
	      slider.addChangeListener(new ChangeListener() {
	         public void stateChanged(ChangeEvent e) {
	            statusLabel.setText("Value : " + ((JSlider)e.getSource()).getValue());
	         }
	      });
	      controlPanel.add(slider);      
	      mainFrame.setVisible(true);     
	   } 	  

	   
   private JFrame mainFrame2;
   private JPanel topPane = new JPanel(new GridBagLayout());
   private JPanel pane = new JPanel(new GridBagLayout());
   private JPanel pane1 = new JPanel(new GridBagLayout());

	private void prepareGUI2(){

		mainFrame2 = new JFrame("Java Swing Examples");
		mainFrame2.setSize(600,400);
		mainFrame2.setLayout(new GridLayout(2, 1));

	      pane.setSize(600,100);
	      pane1.setSize(600,300);

	}
	   
	private void showSliderDemo2(){
	      
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

//		pane.setSize(600,200);
//		pane1.setSize(600,400);
		
//		topPane.add(pane);
//		topPane.add(pane1);
		      
		
//	    mainFrame2.add(pane);
//	    mainFrame2.add(pane1);
////	    mainFrame2.add(topPane);
//	      
//	    mainFrame2.setVisible(true);     

	
		mainFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    
	    jsliper11.addChangeListener(new ChangeListener() {
		      public void stateChanged(ChangeEvent event) {
		        int value = jsliper11.getValue();
		        text1.setText(String.valueOf(value));
		      }
		    });
	    
	    
	    jsliper21.addChangeListener(new ChangeListener() {
		      public void stateChanged(ChangeEvent event) {
		        int value = jsliper21.getValue();
		        text2.setText(String.valueOf(value));
		      }
		    });
	    
	    
	    mainFrame2.add(pane);
	    mainFrame2.add(pane1);
//	    mainFrame2.pack();
	    mainFrame2.setLocationRelativeTo(null);
	    mainFrame2.setVisible(true);	    
	    
	    
	    
	    
	    
	    
	    
//	    mainFrame2.add(jSliderOne, BorderLayout.NORTH);
//	    mainFrame2.setSize(300, 200);
//	    mainFrame2.setVisible(true);		
		
	
	
	} 	  
	   
}

class BoundedChangeListener implements ChangeListener {
	  public void stateChanged(ChangeEvent changeEvent) {
	    Object source = changeEvent.getSource();
	    if (source instanceof BoundedRangeModel) {
	      BoundedRangeModel aModel = (BoundedRangeModel) source;
	      if (!aModel.getValueIsAdjusting()) {
	        System.out.println("Changed: " + aModel.getValue());
	      }
	    } else if (source instanceof JSlider) {
	      JSlider theJSlider = (JSlider) source;
	      if (!theJSlider.getValueIsAdjusting()) {
	        System.out.println("Slider changed: " + theJSlider.getValue());
	      }
	    } else {
	      System.out.println("Something changed: " + source);
	    }
	  }
	}