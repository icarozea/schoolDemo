package co.com.zea.ovidio;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limites")
public class Configuration {
	private int minimum;
	private int maximum;	
	private int otroDato; // no esta definida como propiedd pero no pasa nada. Su valor sera 0.
	
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getOtroDato() {
		return otroDato;
	}
	public void setOtroDato(int otroDato) {
		this.otroDato = otroDato;
	}
	
	
}
