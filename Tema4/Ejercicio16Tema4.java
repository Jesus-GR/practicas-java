/**
 * 
 * @author Jesús Gutiérrez
 * 
 */
public class Ejercicio16Tema4{
  public static void main(String[]args){
    System.out.println("Test para saber si tu pareja es fiel");
    System.out.println("1ºa pregunta: Tu pareja parece estar más inqueita de lo normal sin ningun motivo aparente");
    System.out.print("Introduzca verdadero o falso: ");
    String respuesta1;
    respuesta1 = System.console().readLine();
    respuesta1=respuesta1.toUpperCase();
    int puntuacion1;
    if(respuesta1.equals("verdadero")){
      puntuacion1=3;
      }else{
        puntuacion1=0;
      }
    System.out.println("2ºa pregunta: Ha aumentado sus gastos de vestuario");
    System.out.print("Introduzca verdadero o falso: ");
    String respuesta2;
    respuesta2 = System.console().readLine();
    respuesta2=respuesta2.toUpperCase();
    int puntuacion2;
    if(respuesta2.equals("verdadero")){
      puntuacion2=3;
      }else{
        puntuacion2=0;
      }
    
    
    System.out.println("3ºa pregunta: Ha perdido el interés que mostraba anteriormente por ti");
    System.out.print("Introduzca verdadero o falso: ");
    String respuesta3;
    respuesta3 = System.console().readLine();
    respuesta3=respuesta3.toUpperCase();
    int puntuacion3;
    if(respuesta3.equals("verdadero")){
      puntuacion3=3;
      }else{
        puntuacion3=0;
      }
    System.out.println("4ºa pregunta: Ahora se afeita y se asea con más frecuencia(si es hombre)");
    System.out.println("o ahora se arregla el pelo y se asea con más frecuencia(si es mujer)");
    System.out.print("Introduzca verdadero o falso: ");
    String respuesta4;
    respuesta4 = System.console().readLine();
    respuesta4=respuesta4.toUpperCase();
    int puntuacion4;
    if(respuesta4.equals("verdadero")){
      puntuacion4=3;
      }else{
        puntuacion4=0;
      }
   
    System.out.println("5ºa pregunta: No te deja que mires la agenda de su teléfono móvil");
    System.out.print("Introduzca verdadero o falso: ");
    String respuesta5;
    respuesta5 = System.console().readLine();
    respuesta5=respuesta5.toUpperCase();
    int puntuacion5;
    if(respuesta5.equals("verdadero")){
      puntuacion5=3;
      }else{
        puntuacion5=0;
      }
    System.out.println("6ºa pregunta: A veces tiene llamadas que dice no querer contestar cuando estás tu delante ");
    System.out.print("Introduzca verdadero o falso: ");
    String respuesta6;
    respuesta6 = System.console().readLine();
    respuesta6=respuesta6.toUpperCase();
    int puntuacion6;
    if(respuesta6.equals("verdadero")){
      puntuacion6=3;
      }else{
        puntuacion6=0;
      }
  
    System.out.println("7ºa pregunta: Últimamente se preocupa más en cuidar la linea y/o estar bronceado/a ");
    System.out.print("Introduzca verdadero o falso: ");
    String respuesta7;
    respuesta7 = System.console().readLine();
    respuesta7=respuesta7.toUpperCase();
    int puntuacion7;
    if(respuesta7.equals("verdadero")){
      puntuacion7=3;
      }else{
        puntuacion7=0;
      }
    System.out.println("8ºa pregunta: MUchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    System.out.print("Introduzca verdadero o falso: ");
    String respuesta8;
    respuesta8 = System.console().readLine();
    respuesta8=respuesta8.toUpperCase();
    int puntuacion8;
    if(respuesta8.equals("verdadero")){
      puntuacion8=3;
      }else{
        puntuacion8=0;
      }
    
    System.out.println("9ºa pregunta: Has notado que últimamente se perfuma más");
    System.out.print("Introduzca verdadero o falso: ");
    String respuesta9;
    respuesta9 = System.console().readLine();
    respuesta9=respuesta9.toUpperCase();
    int puntuacion9;
    if(respuesta9.equals("verdadero")){
      puntuacion9=3;
      }else{
        puntuacion9=0;
      }
    System.out.println("10ºa pregunta: Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    System.out.print("Introduzca verdadero o falso: ");
    String respuesta10;
    respuesta10 = System.console().readLine();
    respuesta10=respuesta10.toUpperCase();
    int puntuacion10;
    if(respuesta10.equals("verdadero")){
      puntuacion10=3;
      }else{
        puntuacion10=0;
      }
    int puntuacionTotal;
    puntuacionTotal= puntuacion1+puntuacion2+puntuacion3+puntuacion4+puntuacion5+puntuacion6+puntuacion7+puntuacion8+puntuacion9+puntuacion10;
    
    System.out.println("Tienes un total de "+puntuacionTotal+" puntos");
    
    if(puntuacionTotal<=10){
      System.out.print("¡Enhorabuena! Tu pareja parece ser totalmente fiel");
    }else if (puntuacionTotal>=11 && puntuacionTotal<=22){
      System.out.println("Quizás exita el peligro de otra persona en su vida o en su mente, aunque");
      System.out.println("seguramente será algo sin importancia. No bajes la guardia");
    }else if(puntuacionTotal>=23 && puntuacionTotal<=30){
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona");
      System.out.println("Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza");
    }
  
  }
}
