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
                    System.out.println("-----USTED HA ELEGIDO PARQUE------");
                    //instanciando la clase Familia para enviarle los valores al objeto
                    Familia fa1 = new Familia();
                    //accediendo al objeto Familia bajo el nombre de fa1 para enviar los datos a la clase plantilla
                    System.out.println("Ingrese el nombre del familiar");
                    fa1.nombre = leer.nextDouble();
                    System.out.println("Ingrese el genero al que pertenece");
                    fa1.genero = leer.nextInt();
                    System.out.println("Ingrese la religion a la que pertenece");
                    fa1.religion = leer.nextInt();
                    System.out.println("Ingrese la direccion de su recidencia ");
                    fa1.lugar_residencia = leer.nextInt();
                    //Imprimiendo los valores 
                    System.out.println("-----------------------------------------------");
                    System.out.println("El nombre de los familiares es: "+fa1.nombre);
                    System.out.println("El genero de los familiares es: "+fa1.genero);
                    System.out.println("La religuion es: "+fa1.religion);
                    System.out.println("El lugar donde reside la familia: "+fa1.lugar_residencia);
                    System.out.println("-----------------------------------------------");
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
							System.out.println("-----USTED HA ELEGIDO PARQUE------");
							//instanciando la clase Parque para enviarle los valores al objeto
							Parque P1 = new Parque();
							//accediendo al objeto Parque bajo el nombre de P1 para enviar los datos a la clase plantilla
							System.out.println("Ingrese el precio de la entrada");
							P1.Precio_entrada = leer.nextDouble();
							System.out.println("Ingrese la cantidad de atracciones");
							P1.Cantidad_atracciones = leer.nextInt();
							System.out.println("Ingrese la cantidad de vendedores que hay en el parque");
							P1.Cantidad_vendedores = leer.nextInt();
							System.out.println("Ingrese la cantidad de arboles que hay en el parque");
							P1.Cantidad_arboles = leer.nextInt();
							//Imprimiendo los valores 
                            System.out.println("-----------------------------------------------");
                            System.out.println("El precio de la entrada es: "+P1.Precio_entrada);
                            System.out.println("La cantidad de atracciones: "+P1.Cantidad_atracciones);
                            System.out.println("La cantidad de vendedores: "+P1.Cantidad_vendedores);
							System.out.println("La cantidad de arboles: "+P1.Cantidad_arboles);
							System.out.println("-----------------------------------------------");
                    break;
                    case 17:
							System.out.println("-----USTED HA ELEGIDO HOSPITAL------");
							//instanciando la clase Hospital para enviarle los valores al objeto
							Hospital H1 = new Hospital();
							//accediendo al objeto Hospital bajo el nombre de H1 para enviar los datos a la clase plantilla
							System.out.println("Ingrese el precio de la Cita");
							H1.Precio_cita = leer.nextDouble();
							System.out.println("Ingrese la cantidad de Doctores");
							H1.Cantidad_doctores = leer.nextInt();
							System.out.println("Ingrese la cantidad de Enfermeras");
							H1.Cantidad_enfermeras = leer.nextInt();
							System.out.println("Ingrese la cantidad de Camas");
							H1.Cantidad_camas = leer.nextInt();
							//Imprimiendo los valores 
                            System.out.println("-----------------------------------------------");
                            System.out.println("El precio de la Cita es: "+H1.Precio_cita);
                            System.out.println("La cantidad de Doctores: "+H1.Cantidad_doctores);
                            System.out.println("La cantidad de enfermeras: "+H1.Cantidad_enfermeras);
							System.out.println("La cantidad de Camas: "+H1.Cantidad_camas);
							System.out.println("-----------------------------------------------");
                    break;
                    case 18:
							System.out.println("-----USTED HA ELEGIDO HOTEL------");
							//instanciando la clase Hotel para enviarle los valores al objeto
							Hotel H2 = new Hotel();
							//accediendo al objeto Hotel bajo el nombre de H1 para enviar los datos a la clase plantilla
							System.out.println("Ingrese cantidad de departamentos disponibles");
							H2.Departementos_disponible = leer.nextInt();
							System.out.println("Ingrese la cantidad de despartamentos ocupados");
							H2.Departamentos_ocupados = leer.nextInt();
							System.out.println("Ingrese la cantidad de personas en el hotel");
							H2.Cantidad_Personas = leer.nextInt();
							System.out.println("Ingrese la cantidad de departamentos que tiene el hotel");
							H2.Total_Departamentos = leer.nextInt();
							//Imprimiendo los valores 
                            System.out.println("-----------------------------------------------");
                            System.out.println("La cantidad de departamentos disponibles : "+H2.Departementos_disponible);
                            System.out.println("La cantidad de despartamentos ocupados: "+H2.Departamentos_ocupados);
                            System.out.println("Ingrese la cantidad de personas en el hotel: "+H2.Cantidad_Personas);
							System.out.println("La cantidad de departamentos que tiene el hotel: "+H2.Total_Departamentos);
							System.out.println("-----------------------------------------------");
                        
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