/**
 * 
 */
package ejercicio14;

/**
 * @author Mugre
 *
 */
public class FichaDomino {
	private int ladoIzq;
	private int ladoDch;
	
	/*****Constructor*****/
	
	public FichaDomino(int izq, int dch) {
		
			this.ladoIzq = izq;
			this.ladoDch = dch;
		
		this.ladoIzq = izq;
		this.ladoDch = dch;
		
	}
	
	public boolean encaja(FichaDomino x) {
		if(this.ladoDch == x.ladoIzq || 
				this.ladoDch == x.ladoDch || this.ladoIzq == x.ladoIzq || this.ladoIzq == x.ladoDch  ) {
			return true;
		}else {
			return false;
		}
	}
	
	public FichaDomino voltea() {
		int ladoIzq = this.ladoIzq;
		int ladoDch = this.ladoDch;
		
		this.ladoIzq = ladoDch;
		this.ladoDch = ladoIzq;
		return new FichaDomino(this.ladoIzq, this.ladoDch);
		 
	}
	
	
	public String toString() {
		if(this.ladoIzq == 0) {
			return "[ |"+this.ladoDch+"]";
		}else if (this.ladoDch == 0) {
			return "["+this.ladoIzq+"| ]";
		}else {
			return "["+this.ladoIzq+"|"+this.ladoDch+"]";
		}
		
	}
}
