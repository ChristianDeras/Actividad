import clases.*;
import java.util.Scanner;
public class Principal {
    public static void main(String Args[]) {
        int respuesta = 1;
        //Creando el menú
        while (respuesta != 0) {
            System.out.println("-----------------------INGRESE QUE OBJETO DESEA INSTANCIAR----------------------------");
            System.out.println("-> 1.Casa       2.Producto           3.Celular        4.Fiesta        5.Universidad <-");
            System.out.println("-> 6.Familia    7.Salon de clase     8.Libros         9.Asignatura    10.Carrera    <-");
            System.out.println("-> 11.Sueldo    12.Alcaldia          13.Restaurante   14.Ciber        15.Hospital   <-");
            System.out.println("-> 16.Parque    17.Hotel             18.Banco         19.Iglesia      20.Farmacia   <-");
            System.out.println("---------------------------INGRESE 0 PARA SALIR---------------------------------------");

            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextInt();
            if (respuesta>0 && respuesta<=20) {
                switch (respuesta) {
                    case 1:
                        
                    break;
                    case 2:
                        
                    break;
                    case 3:
                        
                    break;
                    case 4:
                        
                    break;
                    case 5:
                        
                    break;
                    case 6:
                        
                    break;
                    case 7:
                        
                    break;
                    case 8:
                        
                    break;
                    case 9:
                        
                    break;
                    case 10:
                        
                    break;
                    case 11:
                            System.out.println("-----USTED HA ELEGIDO SUELDO------");
                            Scanner leer = new Scanner(System.in);
                            //instanciando la clase sueldos para enviarle los valores al objeto
                            Sueldos s1 = new Sueldos();
                            //accediendo al objeto sueldos bajo el nombre de s1 para enviar los datos a la clase plantilla
                            System.out.println("Ingrese el nombre del empleado");
                            s1.Nombre_empleado = leer.nextLine();
                            System.out.println("Ingrese el ID del empleado");
                            s1.id_empleado =leer.nextInt();
                            System.out.println("Ingrese el sueldo del empleado");
                            s1.sueldo = leer.nextDouble();
                            //Imprimiendo los valores 
                            System.out.println("-----------------------------------------------");
                            System.out.println("El nombre del Empleado es: "+s1.Nombre_empleado);
                            System.out.println("El id del empleado es: "+s1.id_empleado);
                            System.out.println("El sueldo del empleado es "+s1.sueldo);
                    break;
                    case 12:
                        
                    case 13:
                        
                    break;
                    case 14:
                        
                    break;
                    case 15:
                        
                    break;
                    case 16:
                        
                    break;
                    case 17:
                        
                    break;
                    case 18:
                        
                    break;
                    case 19:
                        
                    break;
                    case 20:
                        
                    break;

                    default:
                        break;
                }
            } else{
                System.out.println("No existe ese numero en el indice de la tabla intente de nuevo");
                
            }

        }
    }
}