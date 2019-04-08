package programacomposicioncono;

import javax.swing.JOptionPane;

public class ProgramaComposicionCono {
	/**esto lo usamos para no usar system.out.print todo el rato
	 * @return el system lo realizamos a traves de este método
	 */
	private static void imprimir(Object datos) {
		JOptionPane.showMessageDialog(null, datos);
	}

	/**Este es el cuerpo del programa
	 * @param args Aquí es donde empieza el programa
	 * */
	public static void main(String[] args) {
		/**importamos el random para poder usarlo*/
		java.util.Random aleatorio = new java.util.Random();
		/**usamos el for para guardar 5 objetos
		 * @param radio es un entero que guarda el número aleatorio para después guardarlo en el objeto
		 */
		for (int i = 1; i <= 5; i++) {
			int radio = aleatorio.nextInt(9) + 1;
			cono cono = new cono(0, 0, radio, i, "Azul");
			cono.imprimir();
		}

	}

}
