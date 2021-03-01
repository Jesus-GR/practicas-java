/**
 * 
 */
package ejercicio7;

/**
 * @author Mugre
 *
 */
import java.util.Scanner;
public class PruebaZona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		Zona salaPrincipal = new Zona(1000);
		Zona compraVenta = new Zona(200);
		Zona vip = new Zona(25);
		
		boolean salir = false;
		while(!salir) {
			System.out.println("1.Mostrar numero de entradas libres");
			System.out.println("2.Vender entradas");
			System.out.println("3.Salir");
			int eleccion = Integer.parseInt(s.nextLine());
			if (eleccion == 1) {
				System.out.println("De que zona quiere ver el numero de entradas? :");
				System.out.println("1.Sala Principal");
				System.out.println("2. Compra-venta");
				System.out.println("3. Sala vip");
				int verZona = Integer.parseInt(s.nextLine());
				switch (verZona){
				case 1:
					System.out.println(salaPrincipal.getEntradasPorVender());
					break;
				case 2:
					System.out.println(compraVenta.getEntradasPorVender());
					break;
				case 3:
					System.out.println(vip.getEntradasPorVender());
					break;
					default:
						System.out.println("El numero introducido no pertenece a ninguna sala");
				}
			}else if(eleccion == 2) {
				int comprar = 0;
				System.out.println("De que zona quiere comprar entradas?");
				System.out.println("1. Sala principal");
				System.out.println("2. Compra-venta");
				System.out.println("3. Sala vip");
				int eleccionCompra = Integer.parseInt(s.nextLine());
				switch(eleccionCompra) {
				case 1:
					System.out.println("Cuantas entradas quiere comprar?");
					comprar = Integer.parseInt(s.nextLine());
					salaPrincipal.vender(comprar);
					break;
				case 2:
					System.out.println("Cuantas entradas quiere comprar?");
					comprar = Integer.parseInt(s.nextLine());
					compraVenta.vender(comprar);
					break;
				case 3:
					System.out.println("Cuantas entradas quiere comprar?");
					comprar = Integer.parseInt(s.nextLine());
					vip.vender(comprar);
					break;
				}
				
				
			}else if(eleccion == 3) {
				salir = true;
				System.out.println("Hasta pronto");
			}
		}

	}

}
