package ejercicio5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		ArrayList<Disco> discos = new ArrayList<Disco>();
		int opcionMenu = 0;
		while (opcionMenu != 5) {
			System.out.println("Colección de discos");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2.Nuevo disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			System.out.print("Introduzca una opción: ");
			opcionMenu = Integer.parseInt(s.nextLine());
			System.out.println();
			switch (opcionMenu) {
			case 1:
				for (Disco disco : discos) {
					System.out.println(disco);
					System.out.println();
				}
				System.out.println();
				break;
			case 2:
				System.out.print("Introduce el código: ");
				String codigo = s.nextLine();
				System.out.print("Introduce el Título: ");
				String titulo = s.nextLine();
				System.out.print("Introduce el Autor: ");
				String autor = s.nextLine();
				System.out.print("Introdue el género: ");
				String genero = s.nextLine();
				System.out.print("Introduce la duración: ");
				int duracion = Integer.parseInt(s.nextLine());
				discos.add(new Disco(codigo, titulo, autor, genero, duracion));
				break;
			case 3:
				System.out.println("Introduce el código del disco que quiere modificar: ");
				String codigoModifica = s.nextLine();
				for (int i = 0; i < discos.size(); i++) {
					if (codigoModifica.equals(discos.get(i).getCodigo())) {
						System.out.println("El código actual es: " + discos.get(i).getCodigo());
						System.out.print("Introduzca nuevo código: ");
						String nuevoCodigo = s.nextLine();
						if (nuevoCodigo != "") {
							discos.get(i).setCodigo(nuevoCodigo);
						} else {
							discos.get(i).getCodigo();
						}
						System.out.println("El Título actual es: " + discos.get(i).getTitulo());
						System.out.print("Introduzca nuevo Título: ");
						String nuevoTitulo = s.nextLine();
						if (nuevoTitulo != "") {
							discos.get(i).setTitulo(nuevoTitulo);
						} else {
							discos.get(i).getTitulo();
						}
						System.out.println("El Autor actual es: " + discos.get(i).getAutor());
						System.out.print("Introduzca nuevo Autor: ");
						String nuevoAutor = s.nextLine();
						if (nuevoAutor != "") {
							discos.get(i).setAutor(nuevoAutor);
						} else {
							discos.get(i).getAutor();
						}
						System.out.println("El Género actual es: " + discos.get(i).getGenero());
						System.out.print("Introduzca nuevo Género: ");
						String nuevoGenero = s.nextLine();
						if (nuevoGenero != "") {
							discos.get(i).setGenero(nuevoGenero);
						} else {
							discos.get(i).getGenero();
						}
						System.out.println("La duracion actual es: " + discos.get(i).getDuracion());
						System.out.print("Introduzca la nueva duración: ");
						try {
							int nuevaDuracion = Integer.parseInt(s.nextLine());
							if (nuevaDuracion >= 0) {
								discos.get(i).setDuracion(nuevaDuracion);
							} else {
								discos.get(i).getDuracion();
							}
						} catch (NumberFormatException n) {
							discos.get(i).getDuracion();
						}

					}
				}
				break;
			case 4:
				System.out.print("Introduce el código del disco que desea borrar: ");
				String codigoElimina = s.nextLine();
				for (int i = 0; i < discos.size(); i++) {
					if (codigoElimina.equals(discos.get(i).getCodigo())) {
						discos.remove(i);
					}

				}
				break;
			}
		}
	}

}
