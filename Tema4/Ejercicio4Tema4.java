/**
 * 
 * @autor Jesús Gutiérrez
 **/
public class Ejercicio4Tema4{
  public static void main(String[]args){
    System.out.print("Introduce el total de horas trabajadas durante la semana: ");
    int horas;
    horas= Integer.parseInt(System.console().readLine());
   
    int salario;
    salario = 0;
    
    //Semana sin horas extra
    if(horas>=0 && horas<=40){
     salario= (horas*12);
    }
    
    //Semana con horas extra
    if(horas>=40){
      salario = (40*12)+(horas-40)*16;
    } 
    
    if(horas<0){
      System.out.print("Las horas introducidas no son correctas");
    } else{
      System.out.print("EL salario es de "+salario+" euros");
    }
  }
}
