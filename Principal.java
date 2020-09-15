import clases.*;
import java.util.Scanner;
public class Principal {
    public static void main(String Args[]) {
        //instanciando a Scanner para leer datos
        Scanner sc = new Scanner(System.in);
        //instanciando la clase sueldos para enviarle los valores al objeto
        Sueldos s1 = new Sueldos();
        //accediendo al objeto sueldos bajo el nombre de s1 para enviar los datos a la clase plantilla
        System.out.println("Ingrese el nombre del empleado");
        s1.Nombre_empleado = sc.nextLine();
        System.out.println("Ingrese el ID del empleado");
        s1.id_empleado = sc.nextInt();
        System.out.println("Ingrese el sueldo del empleado");
        s1.sueldo = sc.nextDouble();
        //Imprimiendo los valores 
        System.out.println("-----------------------------------------------");
        System.out.println("El nombre del Empleado es: "+s1.Nombre_empleado);
        System.out.println("El id del empleado es: "+s1.id_empleado);
        System.out.println("El sueldo del empleado es "+s1.sueldo);


        

    }
}