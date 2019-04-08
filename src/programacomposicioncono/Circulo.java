package programacomposicioncono;

public class Circulo {
	/**declaro las variables del objeto de la clase Circulo
	 * @param x aqui guardamos las coordenadas en el eje x
	 * @param y aqui guardamos las coordenadas en el eje y
	 * @param radio aqui guardamos el radio del cono
	 * @return
	 * */
	private float x, y;
	private float radio;

	/**Creamos el constructor
	 * @param cX lo usamos para guardar las coordenadas del eje x
	 * @param cY lo usamos para guardar las coordenadas del eje y
	 * @param r lo usamos para guardar el radio
	 * */
	public Circulo(float cX, float cY, float r) {
		this.x = cX;
		this.y = cY;
		this.radio = r;
	}

	/**hago los getters and setters
	 * @return aquí es para guardar los nuevos objetos o para mostrarlos por ejemplo
	 * */
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	/**usamos este método para calcular el area del circulo
	 * @return multiplicamos el numero PI por la radio dos veces
	 * */
	public float area() {
		return (float) Math.PI * radio * radio;
	}

	/**usamos este método para mostrar las coordenadas x e y, la radio y el area del circulo*/
	public void imprimir() {
		System.out.print(" x=" + x);
		System.out.print(" y=" + y);
		System.out.print(" r=" + radio);
		System.out.print(" A=" + area());
	}
}