/**
 * ShannonsController.java
 */
package network;

import java.util.Observer;

/**
 * @author Saeil Kim
 *
 */
public interface ShannonsController {

	public void AddObserver(Observer os);
	
	public void setBandwidth(double bandwidth);
	
	public void setSignalToNoise(double signalToNoise);
	
	
	
	
}
