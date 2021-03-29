/**
 * 
 */
package ejercicio11;
import java.text.DecimalFormat;
/**
 * @author Mugre
 *
 */
public class TarjetaRegalo {
	private double  saldo;
	private String numIden;
	
	/***Constructor***/
	
	public TarjetaRegalo(double saldo) {
		this.saldo = saldo;
		int iden = 0;
		for (int i = 0; i < 5; i++) {
			iden = (iden*10)+ (int)(Math.random()*9)+1;
		}
		numIden =""+iden;
	}
	
	/****Metodos***/
	DecimalFormat formatoEuros = new DecimalFormat("0.00");
	public void gasta(double dinero) {
		if(dinero>this.saldo) {
			System.out.println("No tiene suficiente saldo para gastar "+formatoEuros.format(dinero)+" €");
		}else {
			this.saldo -= dinero;
		}
		
	}
	
	public TarjetaRegalo fusionaCon (TarjetaRegalo t) {
		double saldot1 = this.saldo;
		this.saldo = 0;
		double saldot2 = t.saldo;
		t.saldo = 0;
		return new TarjetaRegalo(saldot1 + saldot2);
	}
	
	public String toString() {
		
		return "Tarjeta n "+numIden+" -Saldo "+formatoEuros.format(this.saldo)+" €";
	}
}
