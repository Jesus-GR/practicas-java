/**
 * 
 */
package ejercicio13;
import java.text.DecimalFormat;
/**
 * @author Mugre
 *
 */
public class CuentaCorriente {
	private long numCuenta;
	private int saldo;
	
	
	
	/**Constructor***/
	
	public CuentaCorriente(int saldo) {
		this.numCuenta = generaNumCuenta();
		this.saldo = saldo;
	}
	public CuentaCorriente() {
		this.numCuenta = generaNumCuenta();
		this.saldo = 0;
	}
	
	
	/***Métodos***/
	
	
	public String toString() {
		DecimalFormat formatoEuros = new DecimalFormat("0.00");
		return "Numero de cta: "+this.numCuenta+" Saldo "+formatoEuros.format(this.saldo);
	}
	
	
	public void ingreso(int dinero) {
		this.saldo += dinero;
	}
	public void cargo(int dinero) {
		this.saldo -= dinero;
	}
	public void transferencia(CuentaCorriente x, int dinero) {
		this.saldo -= dinero;
		x.saldo += dinero;
	}
	

/****Métodos Setter y Getter*******/
	public long getNumCuenta() {
		return numCuenta;
	}


	public void setNumCuenta(long numCuenta) {
		
		this.numCuenta = numCuenta;
	}
	
	/**Este método genera un numero aleatorio de 10 digitos**/
	private long generaNumCuenta() {
		for (int i = 0; i < 10; i++) {
			numCuenta = (numCuenta * 10) + (long)(Math.random()*10)+1;
		}
		return numCuenta;
	}
	
	
}
