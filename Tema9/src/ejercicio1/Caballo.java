package ejercicio1;


	public class Caballo{
		private String raza;
		private String color;
		private double pesoEnKilos;		
		private int alturaEnCm;
		
		// constructor completo
		public Caballo(String raza, String color, double pesoEnKilos, int alturaEnCm) {
			super();
			this.raza = raza;
			this.color = color;
			this.pesoEnKilos = pesoEnKilos;
			this.alturaEnCm = alturaEnCm;
		}
		// constructor vacio
		public Caballo() {
			
		}
		// metodo corre
		public void come(double kilos, String comida) {
			if(comida .equals("heno")) { 
				this.pesoEnKilos += kilos;
			}else if( comida .equals("pizza")) {
				this.pesoEnKilos += kilos + (kilos/2);
				if(pesoEnKilos < 100){
					System.out.println("Dame mas de comer, que tengo hambre");
				}else if(pesoEnKilos >= 100 && pesoEnKilos <1000) {
					System.out.println("Bueno quizas pueda comer un poco mas");
				}else {
					System.out.println("Estoy demasiado lleno, voy a vomitar");
					this.pesoEnKilos = 50;
				}
				
			}else  {
				System.out.println("No se que te has creido que soy pero solo puedo comer heno o pizza");
			}
			
		}
		
		public void corre(double km) {
			this.pesoEnKilos-=km;
		}

		
//Metodo getter
		public double getPesoEnKilos() {
			return pesoEnKilos;
		}

// Metodo setter
		public void setPesoEnKilos(double pesoEnKilos) {
			this.pesoEnKilos = pesoEnKilos;
		}

		
		

		
		
		
		
	}
	

