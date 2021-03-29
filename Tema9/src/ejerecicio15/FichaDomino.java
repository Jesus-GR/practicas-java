/**
 * 
 */
package ejerecicio15;

/**
 * @author Mugre
 *
 */
public class FichaDomino {
	private int ladoIzq;
	private int ladoDch;

	/***** Constructor *****/

	public FichaDomino() {

		this.ladoIzq = (int) (Math.random() * 7);
		this.ladoDch = (int) (Math.random() * 7);

	}

	public boolean encaja(FichaDomino x) {
		if (this.ladoDch == x.ladoIzq) {
			return true;
		} else {
			while (this.ladoDch != x.ladoIzq) {
				this.ladoDch = (int) (Math.random() * 7);
				x.ladoIzq = (int) (Math.random() * 7);
			}
			return true;

		}
	}

	public FichaDomino voltea() {
		int ladoIzq = this.ladoIzq;
		int ladoDch = this.ladoDch;

		this.ladoIzq = ladoDch;
		this.ladoDch = ladoIzq;
		return new FichaDomino();

	}

	public String toString() {
		if (this.ladoIzq == 0 && this.ladoDch == 0) {
			return "[ | ] ";
		} else if (this.ladoIzq == 0) {
			return "[ |" + this.ladoDch + "] ";
		} else if (this.ladoDch == 0) {
			return "[" + this.ladoIzq + "| ] ";

		} else {
			return "[" + this.ladoIzq + "|" + this.ladoDch + "] ";
		}

	}
}
