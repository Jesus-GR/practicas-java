package ejercicio3;

import java.util.Scanner;

public class TiendaDiscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int longitudArray = 1;
		int contadorArray = 0;
		Disco[] discos = new Disco[30];
		boolean salir = false;
		
		int indiceDisco = 0;
		while (!salir) {
			
			System.out.println("Colección de discos");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2.Nuevo disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			int opcion = Integer.parseInt(s.nextLine());
			switch (opcion) {
			case 1:
				System.out.println("Listado");
				System.out.println("===================");
				for (int i = 0; i < contadorArray; i++) {
					if(discos[i].getCodigoDisco() != "Libre") {
						System.out.println(discos[i]);
					}
					
				}

				break;
			case 2:
				System.out.println("Nuevo disco");
				System.out.println("===================");
				System.out.print("Codigo:");
				String codigo = s.nextLine();
				System.out.print("Artista: ");
				String artista = s.nextLine();
				System.out.print("Titulo: ");
				String titulo = s.nextLine();
				System.out.print("Genero: ");
				String genero = s.nextLine();
				System.out.print("Duracion: ");
				String duracion = s.nextLine();

				discos[indiceDisco++] = new Disco(codigo, artista, titulo, genero, duracion);

				contadorArray++;
				break;
			case 3:
				System.out.println("Modificar");
				System.out.println("===================");
				System.out.print("Introduce el codigo del disco: ");
				String codigoActual = s.nextLine();
				for (int i = 0; i < contadorArray; i++) {
					if (discos[i].getCodigoDisco() .equals(codigoActual)) {
						System.out.println("Codigo actual: " + discos[i].getCodigoDisco());
						System.out.print("Nuevo codigo: ");
						String nuevoCodigo = s.nextLine();
						if (nuevoCodigo != "") {
							discos[i].setCodigoDisco(nuevoCodigo);
						}
						System.out.print("Artista: ");
						System.out.println(discos[i].getAutor());
						System.out.print("Nuevo artista: ");
						String nuevoArtista = s.nextLine();
						discos[i].setAutor(nuevoArtista);
						System.out.print("Titulo: ");
						System.out.println(discos[i].getTitulo());
						System.out.print("Nuevo Titulo: ");
						String nuevoTitulo = s.nextLine();
						discos[i].setTitulo(nuevoTitulo);
						System.out.print("Genero: ");
						System.out.println(discos[i].getGenero());
						System.out.print("Nuevo genero: ");
						String nuevoGenero = s.nextLine();
						discos[i].setGenero(nuevoGenero);
						System.out.print("Duracion: ");
						System.out.println(discos[i].getDuracion());
						System.out.print("Nueva duracion: ");
						String nuevaDuracion = s.nextLine();
						discos[i].setDuracion(nuevaDuracion);

					}

				}
				break;
			case 4:
				System.out.println("Borrar");
				System.out.println("===================");
				System.out.print("Introduzca el codigo: ");
				String codigoBorrar = s.nextLine();
				
				for (int i = 0; i < contadorArray; i++) {
					if(codigoBorrar .equals (discos[i].getCodigoDisco())) {
						
						discos[i].setCodigoDisco("Libre");
						discos[i].setAutor("");
						discos[i].setTitulo("");
						discos[i].setGenero("");
						discos[i].setDuracion("");
						
					}
				}
				break;
			case 5:
				salir = true;
				System.out.println("Adios");
				break;
			}

		}
	}

}
