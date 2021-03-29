/**
 * 
 */
package ejercicio13;

/**
 * @author Mugre
 *
 */
public class PruebaCuenta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente cuenta1 = new CuentaCorriente();
		CuentaCorriente cuenta2 = new CuentaCorriente(1500);
		CuentaCorriente cuenta3 = new CuentaCorriente(6000);
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
		cuenta1.ingreso(2000);
		cuenta2.cargo(600);
		cuenta3.ingreso(75);
		cuenta1.cargo(55);
		cuenta2.transferencia(cuenta3, 100);
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);

		
	}

}
