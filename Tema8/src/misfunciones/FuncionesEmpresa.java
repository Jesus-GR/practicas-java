/**
 * 
 */
package misfunciones;

/**
 * @author Mugre
 *
 */
public class FuncionesEmpresa {
	public static void main (String[]args) {
		
		float iva = FuncionesEmpresa.Iva(21, 399);
		System.out.println(iva);
		
		float precioMasIva = FuncionesEmpresa.precioConIva(21, 399);
		System.out.println(precioMasIva);
		
		float precioMenosIva = FuncionesEmpresa.precioMenosIva(4, 399);
		System.out.printf("%4.2f ",precioMenosIva);
		System.out.println();
		float ivaDeducido = FuncionesEmpresa.ivaDeducido(4, 399);
		System.out.printf("%4.2f ",ivaDeducido);
	}
	
	public static float Iva(int iva, float precio) {
		
		float resultado = (precio*iva)/100;
		
		return resultado;
	}
	
	public static float precioConIva(int iva, float precio) {
		
		float resultado = precio + FuncionesEmpresa.Iva(21, 399);
		
		return resultado;
	}
	
	public static float precioMenosIva (int iva, float precio) {
		
		float resultado = precio - (precio * iva) / (100+iva) ;
		return resultado;
	}
	
	public static float ivaDeducido (int iva, float precio) {
		float resultado = (precio * iva) / (100+iva) ;
		return resultado;
	}

}
