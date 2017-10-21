/**
 * ShannonsJSliderPanel.java
 */
package network;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Observer;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javafx.beans.value.ObservableValue;

/**
 * @author Saeil Kim
 *
 */
public class ShannonsJSliderPanel extends JPanel implements ShannonsController {

	private JPanel pane;
	GridBagConstraints gc;

	JLabel label1;
	JLabel label2;
	JLabel label3;

	JSlider jsliper1;
	JSlider jsliper2;
	JSlider jsliper3;
	   
	/**
	 * Default constructor without argument
	 */
	public ShannonsJSliderPanel(ShannonsController sc) {
		// TODO Auto-generated constructor stub
		pane = new JPanel();
		pane.setLayout(new GridBagLayout());
		gc = new GridBagConstraints();
		
		label1 = new JLabel("Bandwidth(Hz)");
		label2 = new JLabel("Signal To Noise(db)");
		label3 = new JLabel("Maximum Data Rate(kbps):");

		jsliper1 = new JSlider(JSlider.HORIZONTAL,0,100,10);
		jsliper2 = new JSlider(JSlider.HORIZONTAL,0,100,10);
		jsliper3 = new JSlider(JSlider.HORIZONTAL,0,100,10);
	}

	public void createPanel() {
		
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
		pane.add(jsliper1, gc);

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
		pane.add(jsliper2, gc);

		gc.weightx = 0.2;
		gc.gridx = 0;
		gc.gridy = 2;
		gc.gridwidth = 1;

		pane.add(label3, gc);

		gc.weightx = 0.8;
		gc.gridx = 1;
		gc.gridy = 2;
		gc.gridwidth = 3;
		gc.insets = new Insets(0,0,0,0);  //top padding
		pane.add(jsliper3, gc);

		pane.setBorder(new LineBorder(Color.BLUE));
		pane.setBackground(Color.ORANGE);
		      
	}
	
	public void updateMDR(double mdr) {
        jsliper3.setValue((int)mdr);
	}

	/* (non-Javadoc)
	 * @see network.ShannonsController#AddObserver(java.util.Observer)
	 */
	@Override
	public void AddObserver(Observer os) {
		// TODO Auto-generated method stub
//		pane.add(os);
//		Vector observersList = new Vector();
//		observersList.addElement(os);

	
	}

	/* (non-Javadoc)
	 * @see network.ShannonsController#setBandwidth(double)
	 */
	@Override
	public void setBandwidth(double bandwidth) {
		// TODO Auto-generated method stub
	    jsliper1.setValue((int)bandwidth);
		
	}

	/* (non-Javadoc)
	 * @see network.ShannonsController#setSignalToNoise(double)
	 */
	@Override
	public void setSignalToNoise(double signalToNoise) {
		// TODO Auto-generated method stub
	    jsliper2.setValue((int)signalToNoise);
	}
	
	
}

