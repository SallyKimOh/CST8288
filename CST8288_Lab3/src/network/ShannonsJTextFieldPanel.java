/**
 * ShannonsJTextFieldPanel.java
 */
package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
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
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author Saeil Kim
 *
 */
public class ShannonsJTextFieldPanel extends JPanel {

	private JPanel pane;
	GridBagConstraints gc;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	
	JTextField text1;
	JTextField text2;
	JTextField text3;

	/**
	 * Default constructor with argument
	 */
	public ShannonsJTextFieldPanel(ShannonsController sc){
		
		pane = new JPanel();
		pane.setLayout(new GridBagLayout());
		gc = new GridBagConstraints();
		
		label1 = new JLabel("Bandwidth(Hz)");
		label2 = new JLabel("Signal To Noise(db)");
		label3 = new JLabel("Maximum Data Rate(bps):");
		
		text1 = new JTextField(20);
		text2 = new JTextField(20);
		text3 = new JTextField(20);
		
		System.out.println("AAAAAA");

	}
	
	public void createPanel(){

		text3.setEnabled(false);

		text1.setText(String.valueOf(0.0));
		text2.setText(String.valueOf(0.0));
		text3.setText(String.valueOf(0.0));

		pane.setLayout(new GridBagLayout());

		gc.fill = GridBagConstraints.HORIZONTAL;

		gc.weightx = 0.2;
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridwidth = 1;
		pane.add(label1, gc);

		gc.gridx = 1;
		gc.gridy = 0;
		gc.ipady = 2;       //reset to default
		gc.weighty = 0.8;   //request any extra vertical space
		gc.gridwidth=3;
		pane.add(text1, gc);

		gc.weightx = 0.2;
		gc.gridx = 0;
		gc.gridy = 1;
		gc.gridwidth = 1;
		pane.add(label2, gc);
	
		gc.gridx = 1;
		gc.gridy = 1;
		gc.ipady = 2;       //reset to default
		gc.weighty = 0.8;   //request any extra vertical space
		gc.gridwidth=3;
		pane.add(text2, gc);
	
		gc.weightx = 0.2;
		gc.gridx = 0;
		gc.gridy = 2;
		gc.gridwidth = 1;
	
		pane.add(label3, gc);

		gc.weightx = 0.8;
		gc.gridx = 1;
		gc.gridy = 2;
		gc.gridwidth = 3;

	   
		gc.anchor = GridBagConstraints.PAGE_END; //bottom of space
		gc.insets = new Insets(0,0,5,5);  //top padding
	   	      
		pane.add(text3, gc);
		pane.setBorder(new LineBorder(Color.BLUE));
		pane.setBackground(Color.GREEN);
		
	}
	public void updateMDR(double mdr){
		text3.setText(String.valueOf(mdr));
	}

	
	
}
