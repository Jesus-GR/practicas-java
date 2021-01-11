
package tema7;

/**
 *
 * @author JESUS GUTIERREZ
 */
import java.util.Scanner;
public class Ejercicio4Tema7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[]numero = new int[20];
    numero[0] = ((int)(Math.random()*100)+1);
    numero[1] = ((int)(Math.random()*100)+1);
    numero[2] = ((int)(Math.random()*100)+1);
    numero[3] = ((int)(Math.random()*100)+1);
    numero[4] = ((int)(Math.random()*100)+1);
    numero[5] = ((int)(Math.random()*100)+1);
    numero[6] = ((int)(Math.random()*100)+1);
    numero[7] = ((int)(Math.random()*100)+1);
    numero[8] = ((int)(Math.random()*100)+1);
    numero[9] = ((int)(Math.random()*100)+1);
    numero[10] = ((int)(Math.random()*100)+1);
    numero[11] = ((int)(Math.random()*100)+1);
    numero[12] = ((int)(Math.random()*100)+1);
    numero[13] = ((int)(Math.random()*100)+1);
    numero[14] = ((int)(Math.random()*100)+1);
    numero[15] = ((int)(Math.random()*100)+1);
    numero[16] = ((int)(Math.random()*100)+1);
    numero[17] = ((int)(Math.random()*100)+1);
    numero[18] = ((int)(Math.random()*100)+1);
    numero[19] = ((int)(Math.random()*100)+1);
    
    int[] cuadrado = new int[20];
    cuadrado[0] = numero[0]*numero[0];
    cuadrado[1] = numero[1]*numero[1];
    cuadrado[2] = numero[2]*numero[2];
    cuadrado[3] = numero[3]*numero[3];
    cuadrado[4] = numero[4]*numero[4];
    cuadrado[5] = numero[5]*numero[5];
    cuadrado[6] = numero[6]*numero[6];
    cuadrado[7] = numero[7]*numero[7];
    cuadrado[8] = numero[8]*numero[8];
    cuadrado[9] = numero[9]*numero[9];
    cuadrado[10] = numero[10]*numero[10];
    cuadrado[11] = numero[11]*numero[11];
    cuadrado[12] = numero[12]*numero[12];
    cuadrado[13] = numero[13]*numero[13];
    cuadrado[14] = numero[14]*numero[14];
    cuadrado[15] = numero[15]*numero[15];
    cuadrado[16] = numero[16]*numero[16];
    cuadrado[17] = numero[17]*numero[17];
    cuadrado[18] = numero[18]*numero[18];
    cuadrado[19] = numero[19]*numero[19];
    
    int [] cubo = new int [20];
    cubo[0] = numero[0]*numero[0]*numero[0];
    cubo[1] = numero[1]*numero[1]*numero[1];
    cubo[2] = numero[2]*numero[2]*numero[2];
    cubo[3] = numero[3]*numero[3]*numero[3];
    cubo[4] = numero[4]*numero[4]*numero[4];
    cubo[5] = numero[5]*numero[5]*numero[5];
    cubo[6] = numero[6]*numero[6]*numero[6];
    cubo[7] = numero[7]*numero[7]*numero[7];
    cubo[8] = numero[8]*numero[8]*numero[8];
    cubo[9] = numero[9]*numero[9]*numero[9];
    cubo[10] = numero[10]*numero[10]*numero[10];
    cubo[11] = numero[11]*numero[11]*numero[11];
    cubo[12] = numero[12]*numero[12]*numero[12];
    cubo[13] = numero[13]*numero[13]*numero[13];
    cubo[14] = numero[14]*numero[14]*numero[14];
    cubo[15] = numero[15]*numero[15]*numero[15];
    cubo[16] = numero[16]*numero[16]*numero[16];
    cubo[17] = numero[17]*numero[17]*numero[17];
    cubo[18] = numero[18]*numero[18]*numero[18];
    cubo[19] = numero[19]*numero[19]*numero[19];
    
    for (int i = 0; i < 20; i++) {
      System.out.println("Numero ["+i+"] = "+numero[i]+" :cuadrado ["+i+"] = "+cuadrado[i]+" :cubo ["+i+"] = "+ cubo[i]);
    }
  }
  
}
