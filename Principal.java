import clases.*;
import java.util.Scanner;
public class Principal {
    public static void main(String Args[]) {
        int respuesta = 1;
        Scanner leer = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        //Creando el menú
        while (respuesta != 0) {
            System.out.println("-----------------------INGRESE QUE OBJETO DESEA INSTANCIAR----------------------------");
            System.out.println("-> 1.Casa       2.Producto           3.Celular        4.Fiesta        5.Universidad <-");
            System.out.println("-> 6.Familia    7.Salon de clase     8.Libros         9.Asignatura    10.Carrera    <-");
            System.out.println("-> 11.Sueldo    12.Alcaldia          13.Restaurante   14.Ciber        15.Hospital   <-");
            System.out.println("-> 16.Parque    17.Hotel             18.Banco         19.Iglesia      20.Farmacia   <-");
            System.out.println("---------------------------INGRESE 0 PARA SALIR---------------------------------------");

            
            respuesta = sc.nextInt();
            if (respuesta>0 && respuesta<=20) {
                switch (respuesta) {
                    case 1:
                            System.out.println("-----USTED HA ELEGIDO CASA------");
                            Scanner leer2 = new Scanner(System.in);
							//instanciando la clase sueldos para enviarle los valores al objeto
							Casa cs = new Casa();
							//accediendo al objeto sueldos bajo el nombre de s1 para enviar los datos a la clase plantilla
							System.out.println("Ingrese la direccion de la casa");
							cs.Direccion = leer2.nextLine();
							System.out.println("Ingrese el numero de casa");
							cs.numero_casa = leer2.nextInt();
							System.out.println("Ingrese el color de la casa");
							cs.color = leer2.nextLine();
							System.out.println("Ingrese el tamanio de la casa");
							cs.tamanio = leer2.nextDouble();
							//Imprimiendo los valores 
                            System.out.println("-----------------------------------------------");
							System.out.println("La direccion de la casa es: "+cs.Direccion);
                            System.out.println("El numero de casa es: "+cs.numero_casa);
                            System.out.println("El color de la casa es "+cs.color);
							System.out.println("El tamaño de la casa es "+cs.tamanio);
							
                    break;
                    case 2:
                            System.out.println("-----USTED HA ELEGIDO PRODUCTO------");
                            //instanciando la clase sueldos para enviarle los valores al objeto
                            producto pd = new producto();
                            //accediendo al objeto sueldos bajo el nombre de s1 para enviar los datos a la clase plantilla
                            System.out.println("Ingrese la marca");
                            pd.marca = leer.nextLine();
                            System.out.println("Ingrese el codigo");
                            pd.codigo = leer.nextLine();
                            System.out.println("Ingrese el precio");
                            pd.precio = leer.nextDouble();
                            System.out.println("Ingrese la fecha de caducidad");
                            pd.fecha = leer.nextLine();
                            //Imprimiendo los valores 
                            System.out.println("-----------------------------------------------");
                            System.out.println("La marca del producto es: "+pd.marca);
                            System.out.println("El codigo del producto es: "+pd.codigo);
                            System.out.println("El precio del producto es: "+pd.precio);
							System.out.println("La fecha de caducidad es: "+pd.fecha);
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
                    Familia f1 = new Familia();
                    //accediendo al objeto Familia bajo el nombre de f1 para enviar los datos a la clase plantilla
                    System.out.println("Ingrese el nombre del familiar");
                    f1.nombres = leer.nextLine();
                    System.out.println("Ingrese el genero al que pertenece");
                    f1.genero = leer.nextLine();
                    System.out.println("Ingrese la religion a la que pertenece");
                    f1.religion = leer.nextLine();
                    System.out.println("Ingrese la direccion de su recidencia ");
                    f1.lugar_residencia = leer.nextLine();
                    //Imprimiendo los valores 
                    System.out.println("-----------------------------------------------");
                    System.out.println("El nombre de los familiares es: "+f1.nombres);
                    System.out.println("El genero de los familiares es: "+f1.genero);
                    System.out.println("La religuion es: "+f1.religion);
                    System.out.println("El lugar donde reside la familia: "+f1.lugar_residencia);
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
                            System.out.println("-----USTED HA ELEGIDO ALCALDIA------");
                            //instanciando la clase Alcaldia para enviarle los valores al objeto
                            Alcaldia ac = new Alcaldia();
                            //accediendo al objeto Alcaldía bajo el nombre de ac para enviar los datos a la clase plantilla
                            System.out.println("Ingrese el nombre de la alcaldía");
                            ac.nombre_alcaldia = leer.nextLine();
                            System.out.println("Ingrese el Departamemto");
                            ac.Departamento =leer.nextLine();
                            System.out.println("Ingrese el Numero telefónico");
                            ac.numero_celular = leer.nextInt();
                            System.out.println("Ingrese el municipio");
                            ac.Municipio = leer.nextLine();
                            //Imprimiendo los valores 
                            System.out.println("-----------------------------------------------");
                            System.out.println("El nombre de la alcaldia es: "+ac.nombre_alcaldia);
                            System.out.println("El Departamento de la alcaldia es: "+ac.Departamento);
                            System.out.println("El Numero de telefono es: "+ac.numero_celular);
                            System.out.println("El Municipio es: "+ac.Municipio);
                        
                    case 13:
                            System.out.println("-----USTED HA ELEGIDO RESTAURANTES------");
                            //instanciando la clase restaurantes para enviarle los valores al objeto
                            Restaurantes res = new Restaurantes();
                            //accediendo al objeto Restaurantes bajo el nombre de ac para enviar los datos a la clase plantilla
                            System.out.println("Ingrese el nombre del restaurante");
                            res.Nombre_rest = leer.nextLine();
                            System.out.println("Ingrese la cantidad de sillas disponibles");
                            res.cantidad_sillas =leer.nextInt();
                            System.out.println("Ingrese la direccion: ");
                            res.Direccion = leer.nextLine();
                            System.out.println("Ingrese el numero del celular");
                            res.num_cel = leer.nextInt();
                            //Imprimiendo los valores 
                            System.out.println("-----------------------------------------------");
                            System.out.println("El nombre de Restaurante es: "+res.Nombre_rest);
                            System.out.println("La cantidad de sillas disponibles es: "+res.cantidad_sillas);
                            System.out.println("La direcion del local es: "+res.Direccion);
                            System.out.println("El Numero de celular es: "+res.num_cel);
                    break;
                    case 14:
                            System.out.println("-----USTED HA ELEGIDO CIBER------");
                            //instanciando la clase CIBER para enviarle los valores al objeto
                            Ciber cb = new Ciber();
                            //accediendo al objeto Alcaldía bajo el nombre de ac para enviar los datos a la clase plantilla
                            System.out.println("Ingrese el nombre del Ciber");
                            cb.Nombre = leer.nextLine();
                            System.out.println("Ingrese la cantidad de Equipos");
                            cb.cantidad_equipos =leer.nextInt();
                            System.out.println("Ingrese El precio por 15 mins: ");
                            cb.Precio_por_15_mins = leer.nextDouble();
                            System.out.println("Ingrese el precio por 1 hora");
                            cb.Precio_por_hora = leer.nextDouble();
                            //Imprimiendo los valores 
                            System.out.println("-----------------------------------------------");
                            System.out.println("El nombre de ciber es: "+cb.Nombre);
                            System.out.println("La cantidad de equipos diponibles es: "+cb.cantidad_equipos);
                            System.out.println("El precio por 15 minutos es: "+cb.Precio_por_15_mins);
                            System.out.println("El precio por 1 hora: "+cb.Precio_por_hora);
                    break;
                    case 15:
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
							System.out.println("-----USTED HA ELEGIDO HOTEL------");
							//instanciando la clase Hotel para enviarle los valores al objeto
							Hotel H2 = new Hotel();
							//accediendo al objeto Hotel bajo el nombre de H2 para enviar los datos a la clase plantilla
							System.out.println("Ingrese la cantidad de habitaciones disponibles");
							H2.habitaciones_disponible = leer.nextInt();
							System.out.println("Ingrese la cantidad de habitaciones ocupados");
							H2.habitaciones_ocupados = leer.nextInt();
							System.out.println("Ingrese la cantidad de habitaciones reservadas ");
							H2.habitaciones_reservados = leer.nextInt();
							System.out.println("Ingrese la cantidad total de habitaciones que posee el hotel");
							H2.Total_habitaciones = leer.nextInt();
							//Imprimiendo los valores 
                            System.out.println("-----------------------------------------------");
                            System.out.println("La cantidad de Habitaciones disponibles : "+H2.habitaciones_disponible);
                            System.out.println("Cantidad de habitaciones ocupadas : "+H2.habitaciones_ocupados);
                            System.out.println("Cantidad de habitaciones reservadas: "+H2.habitaciones_reservados);
							System.out.println("cantidad total de habitaciones que tiene el hotel: "+H2.Total_habitaciones);
							System.out.println("-----------------------------------------------");
                    break;
                    case 18:
							System.out.println("-----USTED HA ELEGIDO BANCO------");
							//instanciando la clase Banco para enviarle los valores al objeto
							Banco B1 = new Banco();
							//accediendo al objeto Banco bajo el nombre de B1 para enviar los datos a la clase plantilla
							System.out.println("Ingrese su nombre");
							B1.Nombre_Cuenta = leer.nextLine();
							System.out.println("Ingrese el id de su cuenta");
							B1.id_Cuenta = leer.nextInt();
							System.out.println("La cantidad de dinero guardado es");
							B1.Dinero_Guardado = leer.nextDouble();
							System.out.println("Ingrese la cantidad que quiere retirar");
							B1.Cantidad_Retirar = leer.nextDouble();
							//Imprimiendo los valores 
                            System.out.println("-----------------------------------------------");
                            System.out.println("Su nombre es : "+B1.Nombre_Cuenta);
                            System.out.println("Su ID de cuenta es: "+B1.id_Cuenta);
                            System.out.println("El dinero guardado es: "+B1.Dinero_Guardado);
							System.out.println("La cantidad ah retirar es: "+B1.Cantidad_Retirar);
							System.out.println("-----------------------------------------------");
                        
                    break;
                    case 19:
							System.out.println("-----USTED HA ELEGIDO IGLESIA------");
							//instanciando la clase Iglesia para enviarle los valores al objeto
							Iglesia I1 = new Iglesia();
							//accediendo al objeto Iglesia bajo el nombre de I1 para enviar los datos a la clase plantilla
							System.out.println("Ingrese el nombre de la iglesia");
							I1.Nombre_iglesia = leer.nextLine();
							System.out.println("Ingrese el la direccion de la iglesia");
							I1.Direccion_iglesia = leer.nextLine();
							System.out.println("Ingrese la cantidad de sillas");
							I1.Cantidad_sillas = leer.nextInt();
							System.out.println("Ingrese las personas que asisten");
							I1.Personas_asistencia = leer.nextInt();
							//Imprimiendo los valores 
                            System.out.println("-----------------------------------------------");
                            System.out.println("El nombre de la iglesia es : "+I1.Nombre_iglesia);
                            System.out.println("La direcion de la iglesia es: "+I1.Direccion_iglesia);
                            System.out.println("Total de sillas es: "+I1.Cantidad_sillas);
							System.out.println("Cantidad de personasn que asisten : "+I1.Personas_asistencia);
							System.out.println("-----------------------------------------------");
                        
                        
                    break;
                    case 20:
					System.out.println("-----USTED HA ELEGIDO FARMACIA------");
							//instanciando la clase Farmacia para enviarle los valores al objeto
							Farmacia F1 = new Farmacia();
							//accediendo al objeto Farmacia bajo el nombre de F1 para enviar los datos a la clase plantilla
							System.out.println("Ingrese nombre de la farmacia");
							F1.Nombre_Farmacia = leer.nextLine();
							System.out.println("Ingrese la direccion de la farmacia");
							F1.Direccion_Farmacia = leer.nextLine();
							System.out.println("cantidad de medicamentos disponicles");
							F1.Medicamentos_Disponible = leer.nextInt();
							System.out.println("cantidad de medicamentos reservados");
							F1.Medicamentos_Reservados = leer.nextInt();
							//Imprimiendo los valores 
                            System.out.println("-----------------------------------------------");
                            System.out.println("El nombre de la farmacia es: "+F1.Nombre_Farmacia);
                            System.out.println("La direccion de la farmacia es: "+F1.Direccion_Farmacia);
                            System.out.println("Cantidad de medicamentos disponibles: "+F1.Medicamentos_Disponible);
							System.out.println("Cantidad de medicamentos reservados: "+F1.Medicamentos_Reservados);
							System.out.println("-----------------------------------------------");
                        
                    break;

                    default:
                        break;
                }
            } else{
                System.out.println("No existe ese numero en el indice de la tabla intente de nuevo");
                
            }

        }
        leer.close();
        sc.close();
    }
}