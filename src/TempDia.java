public class TempDia {

	//atributos
	private int dia;
	private int mes;
	private int anio;
	private int temp_max;
	private int temp_min;
	
	//metodos
	public TempDia(){
		dia=0;
		mes=0;
		anio=0;
		temp_max=0;
		temp_min=0;	
	}
	/**
	 * guarda la fecha de la medición, la temperatura máxima registrada y la temperatura mínima
	 * @param dia
	 * @param mes
	 * @param anio
	 * @param temp_max
	 * @param temp_min
	 */
	
	public TempDia(int dia, int mes, int anio, int temp_max, int temp_min){
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
		this.temp_max=temp_max;
		this.temp_min=temp_min;	
	}

	public int getDia() {
		return dia;
	}
	/**
	 * metodo setDia
	 * @param dia
	 */

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	/**
	 * metodo getMes
	 * @return el mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * metodo setMes
	 * @param mes
	 */

	public void setMes(int mes) {
		this.mes = mes;
	}
	
	/**
	 * getanio
	 * @returnanio
	 */
	public int getanio() {
		return anio;
	}
	
	/**
	 * setanio
	 * @param anio
	 */

	public void setanio(int anio) {
		this.anio = anio;
	}
	
	/**
	 * getTem_max
	 * @return temp_max
	 */
	public int getTemp_max() {
		return temp_max;
	}
	
	/**
	 * setTemp_max
	 * @param temp_max
	 */
	public void setTemp_max(int temp_max) {
		this.temp_max = temp_max;
	}
	/**
	 * getTemp_min
	 * @return temp_min
	 */

	public int getTemp_min() {
		return temp_min;
	}
	/**
	 * setTemp_min
	 * @param temp_min
	 */

	public void setTemp_min(int temp_min) {
		this.temp_min = temp_min;
	}
	/**
	 * metodo toString
	 */

	public String toString() {
		int media=(temp_max+temp_min)/2;
		return "TempDia [dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", temp_max=" + temp_max +
				", temp_min="+ temp_min +"media ="+ media+ "]";
	}
}
