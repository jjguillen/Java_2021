/**
 * 
 */
package poo_t4;

/**
 * @author sjgui
 *
 */
public class CirculoClase {
	
	private double puntoX;
	private double puntoY;
	private double radio;
	private static int numeroCirculos=0;
	
	/**
	 * 
	 */
	public CirculoClase() {
		super();
		this.puntoX=0;
		this.puntoY=0;
		this.radio=0;
		numeroCirculos++;
	}

	/**
	 * @param radio
	 */
	public CirculoClase(double radio) {
		
		this.puntoX=0;
		this.puntoY=0;
		this.radio = radio;
		numeroCirculos++;
		
		//this(0,0,radio); //Llamaría al constructor que tiene todos los parámetros
	}

	/**
	 * @param puntoX
	 * @param puntoY
	 * @param radio
	 */
	public CirculoClase(double puntoX, double puntoY, double radio) {
		super();
		this.puntoX = puntoX;
		this.puntoY = puntoY;
		this.radio = radio;
		numeroCirculos++;
	}

	/**
	 * @return the puntoX
	 */
	public double getPuntoX() {
		return puntoX;
	}

	/**
	 * @param puntoX the puntoX to set
	 */
	public void setPuntoX(double puntoX) {
		this.puntoX = puntoX;
	}

	/**
	 * @return the puntoY
	 */
	public double getPuntoY() {
		return puntoY;
	}

	/**
	 * @param puntoY the puntoY to set
	 */
	public void setPuntoY(double puntoY) {
		this.puntoY = puntoY;
	}

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CirculoClase [puntoX=");
		builder.append(puntoX);
		builder.append(", puntoY=");
		builder.append(puntoY);
		builder.append(", radio=");
		builder.append(radio);
		builder.append(", número círculos=");
		builder.append(numeroCirculos);
		builder.append("]");
		return builder.toString();
	}

	public double area() {
		return (Math.PI * Math.pow(this.radio, 2));
	}
	
	public double longitud() {
		return (2 * Math.PI * this.radio);
	}
	

	
	
	

}
