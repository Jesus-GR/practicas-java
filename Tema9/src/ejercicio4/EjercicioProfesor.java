package ejercicio4;

public class EjercicioProfesor {
		  public static void main(String[] args) {
		    
		    Fraccionn f1 = new Fraccionn(2,4);
		    System.out.println(f1 + " x 5 = "+ f1.multiplica(5));
		    System.out.println(f1 + " ^-1 = " + f1.invierte());
		    
		    Fraccionn f2 = new Fraccionn(3, 5);
		    System.out.println(f1 + " x " + f2 + " = " + f1.multiplica(f2));
		    System.out.println(f1 + " : " + f2 + " = " + f1.divide(f2));
		        
		    Fraccionn f3 = new Fraccionn(910, -350);
		    System.out.println(f3 + " = " + f3.simplifica());
		  }
		}

