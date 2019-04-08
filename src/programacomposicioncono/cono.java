package programacomposicioncono;

public class cono {
	/**declaro las variables del objeto de la clase Cono
	 * @param base lo usamos para enlazarlo a otra clase llamada Circulo
	 * @param altura lo usamos para guardar la altura del cono
	 * @param color lo usamos para guardar el color del cono
	 * @return
	 * */
	private Circulo base;
	private float altura;
	private String color;

	/**Creamos el constructor
	 * @param cX lo usamos para guardar las coordenadas del eje x
	 * @param cY lo usamos para guardar las coordenadas del eje y
	 * @param r lo usamos para guardar el radio
	 * @param h lo usamos para guardar la altura
	 * @param color lo usamos para guardar el color
	 * */
	public cono(float cX, float cY, float r, float h, String color) {
		this.base = new Circulo(cX, cY, r);
		this.altura = h;
		this.color = color;
	}

	/**hago los getters and setters
	 * @return aquí es para guardar los nuevos objetos o para mostrarlos por ejemplo
	 * */
	public Circulo getBase() {
		return base;
	}

	public void setBase(Circulo base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**creamos el método imprimir para mostrar los datos que son los guardados del método de la clase Circulo y la altura y el color de esta clase*/
	public void imprimir() {
		base.imprimir();
		System.out.println(" h=" + altura + " c=" + color);
	}
}