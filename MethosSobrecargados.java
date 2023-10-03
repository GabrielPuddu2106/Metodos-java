import java.util.Scanner;

public class MethosSobrecargados{
    static Scanner lector = new Scanner(System.in);

public static void main(String []args){    
//Metodos sobrecargados (Sobrecarga de metodos)
//Consiste en reutilizar el nombre de un metododo pero
//con distintas listas de parametros de entrada
mostrarHora();
mostrarHora(2,15,36);
mostrarHora(2,0);
}
 //Declaracion de metodos
public static void mostrarHora(){
    System.out.println("Horas");
    int horas = lector.nextInt();
    System.out.println("Minutos");
    int min = lector.nextInt();
    System.out.println("Segundos");
    int seg = lector.nextInt();
    System.out.println("La hora es "+horas+ ":" +min+ ":" +seg);
}
//Sobrecargar el metodo mostrarHora()
public static void mostrarHora(int horas, int min, int seg){
    System.out.println("La hora es "+ horas + ":"+min+ ":"+seg);
}
public static void mostrarHora(int hrs, int min){
    System.out.println("La hora es "+ hrs + ":"+min);
}

}