/**
 * 
 * @author Jesús Gutiérrez
 * 
 */
public class Ejercicio12Tema4{
  public static void main(String[]args){
    System.out.println("Bienvenido al fantástico cuestionario de 1ºDAM");
    System.out.println("1ºa pregunta: Si tu puedes...");
    System.out.println("A: Todo el mundo puede");
    System.out.println("B: El MySQL Workbech puede");
    System.out.println("C: Nadie puede");
    System.out.print("Introduzca la respuesta correca: ");
    String respuesta1;
    respuesta1 = System.console().readLine();
    respuesta1=respuesta1.toUpperCase();
     int puntuacion1;
    if(respuesta1.equals("B")){
      System.out.println("Has acertado");
      puntuacion1=1;
      }else{
        System.out.println("Respuesta incorrecta");
        puntuacion1=0;
      }
      
    System.out.println("2ºa pregunta: ¿A quien no le funciona nunca la máquina virtual?");
    System.out.println("A: A Jesús");
    System.out.println("B: A Sergio");
    System.out.println("C: A Manolo");
    System.out.print("Introduzca la respuesta correca: ");
    String respuesta2 = System.console().readLine();
    respuesta2 = respuesta2.toUpperCase();
    int puntuacion2;
    if (respuesta2.equals("C")){
      System.out.println("Has acertado");
      puntuacion2=1;
    }else{
      System.out.println("Respuesta incorrecta");
      puntuacion2=0;
    }
    
      
    System.out.println("3ºa pregunta: ¿Quien se entera de todo lo que dice Lauren?");
    System.out.println("A: Nadie");
    System.out.println("B: Manolo");
    System.out.println("C: Todo el mundo");
    System.out.print("Introduzca la respuesta correca: ");
    String respuesta3 = System.console().readLine();
    respuesta3 = respuesta3.toUpperCase();
    int puntuacion3;
    if (respuesta3.equals("B")){
      System.out.println("Has acertado");
      puntuacion3=1;
    }else{
      System.out.println("Respuesta incorrecta");
      puntuacion3=0;
    }
      
    System.out.println("4ºa pregunta: ¿A quien no le apetece seguir pensando preguntas?");
    System.out.println("A: A Jesús");
    System.out.println("B: A Fran");
    System.out.println("C: A Marcos");
    System.out.print("Introduzca la respuesta correca: ");
    String respuesta4 = System.console().readLine();
    respuesta4 = respuesta4.toUpperCase();
    int puntuacion4;
    if (respuesta4.equals("A")){
      System.out.println("Has acertado");
      puntuacion4=1;
    }else{
      System.out.println("Respuesta incorrecta");
      puntuacion4=0;
    }
      
    System.out.println("5ºa pregunta: ¿En que asignatura se aprende a modelar una base de datos?");
    System.out.println("A: EDD");
    System.out.println("B: BBDD");
    System.out.println("C: BBBDDD");
    System.out.print("Introduzca la respuesta correca: ");
    String respuesta5 = System.console().readLine();
    respuesta5 = respuesta5.toUpperCase();
    int puntuacion5;
    if (respuesta5.equals("B")){
      System.out.println("Has acertado");
      puntuacion5=1;
    }else{
      System.out.println("Respuesta incorrecta");
      puntuacion5=0;
    }
      
    System.out.println("6ºa pregunta: ¿Qué necesita Java para poder crear un archivo ejecutable?");
    System.out.println("A: Permisos");
    System.out.println("B: Gasolina");
    System.out.println("C: JVM");
    System.out.print("Introduzca la respuesta correca: ");
    String respuesta6 = System.console().readLine();
    respuesta6 = respuesta6.toUpperCase();
    int puntuacion6;
    if (respuesta6.equals("C")){
      System.out.println("Has acertado");
      puntuacion6=1;
    }else{
      System.out.println("Respuesta incorrecta");
      puntuacion6=0;
    }
      
    System.out.println("7ºa pregunta: ¿Qué comando se usa para dar un salto de linea en html?");
    System.out.println("A: <p></p>");
    System.out.println("B: <br>   ");
    System.out.println("C: String");
    System.out.print("Introduzca la respuesta correca: ");
    String respuesta7 = System.console().readLine();
    respuesta7 = respuesta7.toUpperCase();
    int puntuacion7;
    if (respuesta7.equals("B")){
      System.out.println("Has acertado");
      puntuacion7=1;
    }else{
      System.out.println("Respuesta incorrecta");
      puntuacion7=0;
    }
      
    System.out.println("8ºa pregunta: ¿Por qué estándar nos regulamos a la hora de programar?");
    System.out.println("A: El de facebook");
    System.out.println("B: El de Google");
    System.out.println("C: El de Oracle");
    System.out.print("Introduzca la respuesta correca: ");
    String respuesta8 = System.console().readLine();
    respuesta8= respuesta8.toUpperCase();
    int puntuacion8;
    if (respuesta8.equals("B")){
      System.out.println("Has acertado");
      puntuacion8=1;
    }else{
      System.out.println("Respuesta incorrecta");
      puntuacion8=0;
    }
      
    System.out.println("9ºa pregunta: La PK siempre es:");
    System.out.println("A: Nn");
    System.out.println("B: n a m ");
    System.out.println("C: Fk");
    System.out.print("Introduzca la respuesta correca: ");
    String respuesta9 = System.console().readLine();
    respuesta9 = respuesta9.toUpperCase();
    int puntuacion9;
    if (respuesta9.equals("A")){
      System.out.println("Has acertado");
      puntuacion9=1;
    }else{
      System.out.println("Respuesta incorrecta");
      puntuacion9=0;
    }
      
    System.out.println("10ºa pregunta: ¿Con que comandos vemos las carpetas de un directorio en el terminal de linux?");
    System.out.println("A: cd");
    System.out.println("B: ls");
    System.out.println("C: jpg");
    System.out.print("Introduzca la respuesta correca: ");
    String respuesta10 = System.console().readLine();
    respuesta10 = respuesta10.toUpperCase();
    int puntuacion10;
    if (respuesta10.equals("B")){
      System.out.println("Has acertado");
      puntuacion10=1;
    }else{
      System.out.println("Respuesta incorrecta");
      puntuacion10=0;
    }
    
    int puntuacionTotal;
    puntuacionTotal= puntuacion1+puntuacion2+puntuacion3+puntuacion4+puntuacion5+puntuacion6+puntuacion7+puntuacion8+puntuacion9+puntuacion10;
    
    System.out.println("Tienes un total de "+puntuacionTotal+" puntos");
    
    if(puntuacionTotal<5){
      System.out.print("Tienes que estudiar más");
    }else{
      System.out.print("Buen trabajo");
    }
  
  
  }
}
