/**
 * ShannonsTheorem.java
 */
package network;
import java.util.Observer;

/**
 * This class calculate MDR that is maximum data rate using bandwidth in  Herz and signal to noise(SNR).
 * @fileName ShannonsTheorem.java
 * @author Saeil Kim 040845408
 * @course CST8288
 * @assignment Lab3
 * @date 2017.10.21
 * @professor Shawn Emami
 * @purpose Calculating and Testing using JUnit
 * @see javax.swing.JOptionPane
 */

public class ShannonsTheorem implements ShannonsController {

	ShannonsModel shModel;
	/**
	 *  Default constructor without any arguments
	 */
	public ShannonsTheorem() {
		// TODO Auto-generated constructor stub
//		shModel = new ShannonsModel();
		setModel(new ShannonsModel());
	}

	/* (non-Javadoc)
	 * @see network.ShannonsController#AddObserver(java.util.Observer)
	 */
	@Override
	public void AddObserver(Observer os) {
		// TODO Auto-generated method stub

	}

	/**
	 * Set a bandwidth for calculating
	 * @param bandwidth : bandwidth in Herz
	 */
	@Override
	public void setBandwidth(double bandwidth) {
		// TODO Auto-generated method stub
		if (bandwidth < 0) {
			throw new IllegalArgumentException ("Must be a positive number");
		}
		shModel.setBandwidth(bandwidth);
	}

	/**
	 * 
	 * @return the bandwidth
	 */
	public double getBandwidth() {
		return shModel.getBandwidth();
	}
	
	
	
	
	/* (non-Javadoc)
	 * @see network.ShannonsController#setSignalToNoise(double)
	 */
	/**
	 * Set a signal to noise
	 * @param sn : signal to noise
	 */
	
	@Override
	public void setSignalToNoise(double signalToNoise) {
		// TODO Auto-generated method stub
		shModel.setSignalToNoise(signalToNoise);
	
	}
	
	public double getSignalToNoise() {
		return shModel.getSignalToNoise();
	}

	
	public double getMaximumDataRate() {
		return shModel.getMaximumDataRate();
	}
	
	public void setModel(ShannonsModel sm) {
		shModel = sm;
	}
	
	
	
	
	@Override
	public String toString() {
		return "ShannonsTheorem [getBandwidth()=" + getBandwidth() + ", getSignalToNoise()=" + getSignalToNoise()
				+ ", getMaximumDataRate()=" + getMaximumDataRate() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShannonsView view = new ShannonsView();
		view.run();
//		view.BorderTest();
	}

}
