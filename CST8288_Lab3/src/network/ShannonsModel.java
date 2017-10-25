/**
 * ShannonsModel.java
 */
package network;

import java.util.Observable;

/**
 * @author Saeil Kim
 *
 */
public class ShannonsModel extends Observable {

	/**
	 * The bandwidth is double value of bandwidth in Herz
	 */
	private double bandwidth = 0;
	/**
	 * The signalToNoise is double value of signal to noise (SNR)
	 */
	private double signalToNoise = 0;
	
	
	/**
	 * Default constructor without any arguments
	 */
	public ShannonsModel() {
		// TODO Auto-generated constructor stub
		super();
	}


	/** 
	 * @return the bandwidth
	 */
	public double getBandwidth() {
		return bandwidth;
	}


	/**
	 * Set a bandwidth for calculating
	 * @param bandwidth : bandwidth in Herz
	 */
	public void setBandwidth(double bandwidth) {
		this.bandwidth = bandwidth;

		setChanged();
        notifyObservers(bandwidth);

	}


	/** 
	 * @return the signal to noise
	 */
	public double getSignalToNoise() {
		return signalToNoise;
	}


	/**
	 * Set a signal to noise
	 * @param signalToNoise : signal to noise
	 */
	public void setSignalToNoise(double signalToNoise) {
		this.signalToNoise = signalToNoise;
		setChanged();
        notifyObservers(bandwidth);
	}

	/**
	 * The implementation of the public method would invoke the private method passing the instance values for bandwidth and signal=to-noise
	 * @return MDR
	 */
	public double getMaximumDataRate() {
		return getMaximumDataRate(getBandwidth(), getSignalToNoise());
	}

	/**
	 * Calculation MDR that is maximum data rate
	 * @param bandw : bandwidth in Herz
	 * @param signalToNoise : signal to noise (SNR)
	 * @return MDR
	 */
	private double getMaximumDataRate(double bandw, double signalToNoise) {
		double mdr = bandw * (Math.log( (Math.pow( 10, (signalToNoise / 10)) + 1)) / Math.log( 2));
		return mdr;
	}
	

	/**
	 * Convert this class to a meaningful string. meaning need to be sufficient enough to be useful in your debugging.
	 * @return This class as a meaningful string.
	 */
	@Override
	public String toString() {
		return "ShannonsModel [bandwidth=" + bandwidth + ", signalToNoise=" + signalToNoise + ", getBandwidth()="
				+ getBandwidth() + ", getSignalToNoise()=" + getSignalToNoise() + ", getMaximumDataRate()="
				+ getMaximumDataRate() + ", hasChanged()=" + hasChanged() + ", countObservers()=" + countObservers()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

	
	
	
	
}
