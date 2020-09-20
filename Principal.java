import clases.*;
import java.util.Scanner;
public class Principal {
    public static void main( String Args[]) {
        int respuesta = 1;
        Scanner leer = new Scanner(System.in);
         Scanner sc = new Scanner(System.in);
        // Creando el menú
        while (respuesta != 0) {
            System.out.println("-----------------------INGRESE QUE OBJETO DESEA INSTANCIAR----------------------------");
            System.out.println("-> 1.Casa       2.Producto           3.Celular        4.Fiesta        5.Universidad <-");
            System.out.println("-> 6.Familia    7.Salon de clase     8.Libros         9.Asignatura    10.Carrera    <-");
            System.out .println("-> 11.Sueldo    12.Alcaldia          13.Restaurante   14.Ciber        15.Hospital   <-");
            System.out.println("-> 16.Parque    17.Hotel             18.Banco         19.Iglesia      20.Farmacia   <-");
            System.out.println("---------------------------INGRESE 0 PARA SALIR---------------------------------------");
            respuesta = sc.nextInt();

                switch (respuesta) {
                    case 1:
                        System.out.println("-----USTED HA ELEGIDO CASA------"); 
                        // instanciando la clase sueldos para enviarle los valores al objeto
                         Casa cs = new Casa();
                        // accediendo al objeto sueldos bajo el nombre de s1 para enviar los datos a la
                        // clase plantilla
                        System.out.println("Ingrese la direccion de la casa");
                        cs.Direccion = leer.nextLine();
                        System.out.println("Ingrese el color de la casa");
                        System.out.println("Ingrese el numero de casa");
                        // Imprimiendo los valores
                        System.out.println("-----------------------------------------------");
                        System.out.println("La direccion de la casa es: " + cs.Direccion);
                        System.out.println("El numero de casa es: " + cs.numero_casa);
                        System.out.println("El color de la casa es " + cs.color);
                        System.out.println("El tamaño de la casa es " + cs.tamanio);

                        break;
                    case 2:
                        System.out.println("-----USTED HA ELEGIDO PRODUCTO------");
                        // instanciando la clase sueldos para enviarle los valores al objeto
                         producto pd = new producto();
                        // accediendo al objeto sueldos bajo el nombre de s1 para enviar los datos a la
                        // clase plantilla
                        System.out.println("Ingrese el precio");
                        pd.precio = leer.nextDouble();
                        System.out.println("Ingrese la marca");
                        pd.marca = leer.nextLine();
                        pd.marca = leer.nextLine();
                        System.out.println("Ingrese el codigo");
                        pd.codigo = leer.nextLine();
                        System.out.println("Ingrese la fecha de caducidad");
                        
                        System.out.println("La marca del producto es: " + pd.marca);
                        System.out.println("El codigo del producto es: " + pd.codigo);
                        System.out.println("El precio del producto es: " + pd.precio);
                        System.out.println("La fecha de caducidad es: " + pd.fecha);
                        break;
                    case 3:
                        System.out.println("-----USTED HA ELEGIDO CELULAR------");
                        // instanciando la clase sueldos para enviarle los valores al objeto
                         celular cl = new celular();
                        // accediendo al objeto sueldos bajo el nombre de s1 para enviar los datos a la
                        // clase plantilla
                        leer.nextLine();
                        System.out.println("Ingrese la marca");
                        cl.marca = leer.nextLine();
                        System.out.println("Ingrese la cantidad de bateria del dispositivo");
                        cl.bateria = leer.nextInt();
                        System.out.println("Ingrese los pixeles de la camara");
                        cl.camara = leer.nextDouble();
                        // Imprimiendo los valores
                        System.out.println("-----------------------------------------------");
                        System.out.println("La marca del dispositivo es: " + cl.marca);
                        System.out.println("La bateria del dispositivo es: " + cl.bateria);
                        System.out.println("El procesador es: " + cl.procesador);
                        System.out.println("El precio del dispositivo es: " + cl.camara);

                        break;
                    case 4:
                        System.out.println("-----USTED HA ELEGIDO CELULAR------");
                        // instanciando la clase sueldos para enviarle los valores al objeto
                         fiesta ft = new fiesta();
                        // accediendo al objeto sueldos bajo el nombre de s1 para enviar los datos a la
                        // clase plantilla
                        System.out.println("Ingrese el nombre del DJ");
                        ft.nombre_dj = leer.nextLine();
						ft.nombre_dj = leer.nextLine();
                        System.out.println("Ingrese la cantidad de globos");
                        ft.cant_globos = leer.nextInt();
                        System.out.println("Ingrese la cantidad de personas");
                        ft.cant_personas = leer.nextInt();
                        System.out.println("Ingrese la cantidad de comida");
                        ft.cant_comida = leer.nextInt();
                        // Imprimiendo los valores
                        System.out.println("-----------------------------------------------");
                        System.out.println("La cantidad de globos para la fiesta son: " + ft.cant_globos);
                        System.out.println("La cantidad de personas para la fiesta son: " + ft.cant_personas);
                        System.out.println("El cantidad de comida para la fiesta son: " + ft.cant_comida);
                        System.out.println("El nombre del DJ es: " + ft.nombre_dj);

                        break;
                    case 5:
                        System.out.println("-----USTED HA ELEGIDO CELULAR------");
                        // instanciando la clase sueldos para enviarle los valores al objeto
                         universidad U = new universidad();
                        // accediendo al objeto sueldos bajo el nombre de s1 para enviar los datos a la
                        // clase plantilla
                        System.out.println("Ingrese el codigo del edificio");
                        U.cod_edificio = leer.nextLine();
						U.cod_edificio = leer.nextLine();
                        System.out.println("Ingrese el codigo del aula");
                        U.cod_aula = leer.nextLine();
                        System.out.println("Ingrese el nombre del docente");
                        U.nombre_docente = leer.nextLine();
                        System.out.println("Ingrese la cantidad de pupitres");
                        U.cant_pupitres = leer.nextInt();
                        // Imprimiendo los valores
                        System.out.println("-----------------------------------------------");
                        System.out.println("El codigo del edificio es: " + U.cod_edificio);
                        System.out.println("El codigo del aula es: " + U.cod_aula);
                        System.out.println("El nombre del docente es: " + U.nombre_docente);
                        System.out.println("La cantidad de pupitres es: " + U.cant_pupitres);

                        break;
                    case 6:
                        System.out.println("-----USTED HA ELEGIDO FAMILIA ------");
                        // instanciando la clase Familia para enviarle los valores al objeto
                         Familia f1 = new Familia();
                        // accediendo al objeto Familia bajo el nombre de f1 para enviar los datos a la
                        // clase plantilla
                        System.out.println("Ingrese el nombre del familiar");
                        f1.nombres = leer.nextLine();
                        System.out.println("Ingrese el genero al que pertenece");
                        f1.genero = leer.nextLine();
                        System.out.println("Ingrese la religion a la que pertenece");
                        f1.religion = leer.nextLine();
                        System.out.println("Ingrese la direccion de su recidencia ");
                        f1.lugar_residencia = leer.nextLine();
                        // Imprimiendo los valores
                        System.out.println("-----------------------------------------------");
                        System.out.println("El nombre de los familiares es: " + f1.nombres);
                        System.out.println("El genero de los familiares es: " + f1.genero);
                        System.out.println("La religuion es: " + f1.religion);
                        System.out.println("El lugar donde reside la familia: " + f1.lugar_residencia);
                        System.out.println("-----------------------------------------------");
                        break;
                    case 7:
						System.out.println("-----USTED HA ELEGIDO SALON DE CLASES------");
							//instanciando la clase Salon_clase para enviarle los valores al objeto
							Salon_clase slc = new Salon_clase();
							//accediendo al objeto sueldos bajo el nombre de slc para enviar los datos a la clase plantilla
							System.out.println("Ingrese la cantidad de alumnos en el salon");
							slc.cant_alum = leer.nextInt();
							System.out.println("Ingrese la cantidad de pupitres en el salon");
							slc.cant_pupitres = leer.nextInt();
							System.out.println("Ingrese el tamanio del salon");
							slc.tam_salon = leer.nextDouble();
							System.out.println("Ingrese el color del salon del clase");
							slc.color = leer.nextLine();
							//Imprimiendo los valores
                            System.out.println("-----------------------------------------------");
							System.out.println("La cantidad de alumnos son: "+slc.cant_alum);
							System.out.println("La cantidad de pupitres son: "+slc.cant_pupitres);
							System.out.println("El tamaño del salon es: "+slc.tam_salon);
							System.out.println("El color del salon es: "+slc.color);
                        break;
                    case 8:
                        System.out.println("-----USTED HA ELEGIDO LIBROS------");
                        // instanciando la clase libros para enviarle los valores al objeto
                         Libros lb = new Libros();
                        // accediendo al objeto sueldos bajo el nombre de lb para enviar los datos a la
                        // clase plantilla
                        System.out.println("Ingrese el Precio del libro");
                        lb.pre_libro = leer.nextDouble();
                        System.out.println("Ingrese el nombre del autor");
                        lb.nomb_aut = leer.nextLine();
                        System.out.println("Ingrese el nombre de la editorial");
                        lb.nomb_edit = leer.nextLine();
                        System.out.println("Ingrese el nombre del libro");
                        lb.nomb_libro = leer.nextLine();
                        // Imprimiendo los valores
                        System.out.println("-----------------------------------------------");
                        System.out.println("El precio del libro es: " + lb.pre_libro);
                        System.out.println("El nombre del autor es: " + lb.nomb_aut);
                        System.out.println("El nombre del editorial es: " + lb.nomb_edit);
                        System.out.println("La cantidad del libro es: " + lb.nomb_libro);
                        break;
                    case 9:
						System.out.println("-----USTED HA ELEGIDO  ASIGNATURA------");
							//instanciando la clase Asignatura para enviarle los valores al objeto
							Asignatura asg = new Asignatura();
							//accediendo al objeto sueldos bajo el nombre de asg para enviar los datos a la clase plantilla
							System.out.println("Ingrese el nombre de su asignatura");
							asg.nomb_asig = leer.nextLine();
							System.out.println("Ingrese el nombre del docente que le imparte la materia");
							asg.nomb_doc = leer.nextLine();
							//Aqui ingresara el turno en el que lleva su horario (Mañana,Tarde,Noche)
							System.out.println("Ingrese el horario en el que lleva su materia");
							asg.horario = leer.nextLine();
							System.out.println("Ingrese el codigo de su asignatura");
							asg.cod_asig = leer.nextInt();
							//Imprimiendo los valores
                            System.out.println("-----------------------------------------------");
							System.out.println("El nombre de su asignatura es: "+asg.nomb_asig);
							System.out.println("El nombre del docente de su asignatura es : "+asg.nomb_doc);
							System.out.println("Su asignatura la lleva por la : "+asg.horario);
							System.out.println("El codigo de su materia es : "+asg.cod_asig);
                        break;
                    case 10:
						System.out.println("-----USTED HA ELEGIDO  CARERRA------");
							//instanciando la clase Carrera para enviarle los valores al objeto
							Carrera crr = new Carrera();
							//accediendo al objeto sueldos bajo el nombre de crr para enviar los datos a la clase plantilla
							System.out.println("Ingrese el nombre de su carrera");
							crr.nom_carrera = leer.nextLine();
							System.out.println("Ingrese la especialidad que lleva");
							crr.especialidad = leer.nextLine();
							System.out.println("Ingrese la cantidad de años en las que llevara esta carrera");
							crr.anios_carrera = leer.nextInt();
							System.out.println("Ingrese el codigo de su carrera");
							crr.cod_carrera = leer.nextInt();
							//Imprimiendo los valores
                            System.out.println("-----------------------------------------------");
							System.out.println("La especialidad de su carrera es : "+crr.especialidad);
							System.out.println("El nombre de su carrera es : "+crr.nom_carrera);
							System.out.println("Los años en los que terminara esta carrera: "+crr.anios_carrera);
							System.out.println("El codigo de su carrera es : "+crr.cod_carrera);

                        break;
                    case 11:
                        System.out.println("-----USTED HA ELEGIDO SUELDO------");
                        // instanciando la clase sueldos para enviarle los valores al objeto
                         Sueldos s1 = new Sueldos();
                        // accediendo al objeto sueldos bajo el nombre de s1 para enviar los datos a la
                        // clase plantilla
                        System.out.println("Ingrese el nombre del empleado");
                        s1.Nombre_empleado = leer.nextLine();
                        System.out.println("Ingrese el ID del empleado");
                        s1.id_empleado = leer.nextInt();
                        System.out.println("Ingrese el sueldo del empleado");
                        s1.sueldo = leer.nextDouble();
                        // Imprimiendo los valores
                        System.out.println("-----------------------------------------------");
                        System.out.println("El nombre del Empleado es: " + s1.Nombre_empleado);
                        System.out.println("El id del empleado es: " + s1.id_empleado);
                        System.out.println("El sueldo del empleado es " + s1.sueldo);
                        break;
                    case 12:
                        System.out.println("-----USTED HA ELEGIDO ALCALDIA------");
                        // instanciando la clase Alcaldia para enviarle los valores al objeto
                         Alcaldia ac = new Alcaldia();
                        // accediendo al objeto Alcaldía bajo el nombre de ac para enviar los datos a la
                        // clase plantilla
                        System.out.println("Ingrese el Departamemto");
                        ac.Departamento = leer.nextLine();
                        System.out.println("Ingrese el nombre de la alcaldía");
                        ac.nombre_alcaldia = leer.nextLine();
                        System.out.println("Ingrese el municipio");
                        ac.Municipio = leer.nextLine();
                        System.out.println("Ingrese el Numero telefónico");
                        ac.numero_celular = leer.nextInt();

                        // Imprimiendo los valores
                        System.out.println("-----------------------------------------------");
                        System.out.println("El nombre de la alcaldia es: " + ac.nombre_alcaldia);
                        System.out.println("El Departamento de la alcaldia es: " + ac.Departamento);
                        System.out.println("El Numero de telefono es: " + ac.numero_celular);
                        System.out.println("El Municipio es: " + ac.Municipio);

                    case 13:
                        System.out.println("-----USTED HA ELEGIDO RESTAURANTES------");
                        // instanciando la clase restaurantes para enviarle los valores al objeto
                        Restaurantes res = new Restaurantes();
                        // accediendo al objeto Restaurantes bajo el nombre de ac para enviar los datos
                        // a la clase plantilla
                        System.out.println("Ingrese el nombre del restaurante");
                        res.Nombre_rest = leer.nextLine();
                        System.out.println("Ingrese la cantidad de sillas disponibles");
                        res.cantidad_sillas = leer.nextInt();
                        System.out.println("Ingrese la direccion: ");
                        res.Direccion = leer.nextLine();
                        System.out.println("Ingrese el numero del celular");
                        res.num_cel = leer.nextInt();
                        // Imprimiendo los valores
                        System.out.println("-----------------------------------------------");
                        System.out.println("El nombre de Restaurante es: " + res.Nombre_rest);
                        System.out.println("La cantidad de sillas disponibles es: " + res.cantidad_sillas);
                        System.out.println("La direcion del local es: " + res.Direccion);
                        System.out.println("El Numero de celular es: " + res.num_cel);
                        break;
                    case 14:
                        System.out.println("-----USTED HA ELEGIDO CIBER------");
                        // instanciando la clase CIBER para enviarle los valores al objeto
                         Ciber cb = new Ciber();
                        // accediendo al objeto Alcaldía bajo el nombre de ac para enviar los datos a la
                        // clase plantilla
                        System.out.println("Ingrese el nombre del Ciber");
                        cb.Nombre = leer.nextLine();
                        System.out.println("Ingrese la cantidad de Equipos");
                        cb.cantidad_equipos = leer.nextInt();
                        System.out.println("Ingrese El precio por 15 mins: ");
                        cb.Precio_por_15_mins = leer.nextDouble();
                        System.out.println("Ingrese el precio por 1 hora");
                        cb.Precio_por_hora = leer.nextDouble();
                        // Imprimiendo los valores
                        System.out.println("-----------------------------------------------");
                        System.out.println("El nombre de ciber es: " + cb.Nombre);
                        System.out.println("La cantidad de equipos diponibles es: " + cb.cantidad_equipos);
                        System.out.println("El precio por 15 minutos es: " + cb.Precio_por_15_mins);
                        System.out.println("El precio por 1 hora: " + cb.Precio_por_hora);
                        break;
                    case 15:
                        System.out.println("-----USTED HA ELEGIDO HOSPITAL------");
                        // instanciando la clase Hospital para enviarle los valores al objeto
                         Hospital H1 = new Hospital();
                        // accediendo al objeto Hospital bajo el nombre de H1 para enviar los datos a la
                        // clase plantilla
                        System.out.println("Ingrese el precio de la Cita");
                        H1.Precio_cita = leer.nextDouble();
                        System.out.println("Ingrese la cantidad de Doctores");
                        H1.Cantidad_doctores = leer.nextInt();
                        System.out.println("Ingrese la cantidad de Enfermeras");
                        H1.Cantidad_enfermeras = leer.nextInt();
                        System.out.println("Ingrese la cantidad de Camas");
                        H1.Cantidad_camas = leer.nextInt();
                        // Imprimiendo los valores
                        System.out.println("-----------------------------------------------");
                        System.out.println("El precio de la Cita es: " + H1.Precio_cita);
                        System.out.println("La cantidad de Doctores: " + H1.Cantidad_doctores);
                        System.out.println("La cantidad de enfermeras: " + H1.Cantidad_enfermeras);
                        System.out.println("La cantidad de Camas: " + H1.Cantidad_camas);
                        System.out.println("-----------------------------------------------");
                        break;
                    case 16:
                        System.out.println("-----USTED HA ELEGIDO PARQUE------");
                        // instanciando la clase Parque para enviarle los valores al objeto
                         Parque P1 = new Parque();
                        // accediendo al objeto Parque bajo el nombre de P1 para enviar los datos a la
                        // clase plantilla
                        System.out.println("Ingrese el precio de la entrada");
                        P1.Precio_entrada = leer.nextDouble();
                        System.out.println("Ingrese la cantidad de atracciones");
                        P1.Cantidad_atracciones = leer.nextInt();
                        System.out.println("Ingrese la cantidad de vendedores que hay en el parque");
                        P1.Cantidad_vendedores = leer.nextInt();
                        System.out.println("Ingrese la cantidad de arboles que hay en el parque");
                        P1.Cantidad_arboles = leer.nextInt();
                        // Imprimiendo los valores
                        System.out.println("-----------------------------------------------");
                        System.out.println("El precio de la entrada es: " + P1.Precio_entrada);
                        System.out.println("La cantidad de atracciones: " + P1.Cantidad_atracciones);
                        System.out.println("La cantidad de vendedores: " + P1.Cantidad_vendedores);
                        System.out.println("La cantidad de arboles: " + P1.Cantidad_arboles);
                        System.out.println("-----------------------------------------------");
                        break;
                    case 17:
                        System.out.println("-----USTED HA ELEGIDO HOTEL------");
                        // instanciando la clase Hotel para enviarle los valores al objeto
                         Hotel H2 = new Hotel();
                        // accediendo al objeto Hotel bajo el nombre de H2 para enviar los datos a la
                        // clase plantilla
                        System.out.println("Ingrese la cantidad de habitaciones disponibles");
                        H2.habitaciones_disponible = leer.nextInt();
                        System.out.println("Ingrese la cantidad de habitaciones ocupados");
                        H2.habitaciones_ocupados = leer.nextInt();
                        System.out.println("Ingrese la cantidad de habitaciones reservadas ");
                        H2.habitaciones_reservados = leer.nextInt();
                        System.out.println("Ingrese la cantidad total de habitaciones que posee el hotel");
                        H2.Total_habitaciones = leer.nextInt();
                        // Imprimiendo los valores
                        System.out.println("-----------------------------------------------");
                        System.out.println("La cantidad de Habitaciones disponibles : " + H2.habitaciones_disponible);
                        System.out.println("Cantidad de habitaciones ocupadas : " + H2.habitaciones_ocupados);
                        System.out.println("Cantidad de habitaciones reservadas: " + H2.habitaciones_reservados);
                        System.out
                                .println("cantidad total de habitaciones que tiene el hotel: " + H2.Total_habitaciones);
                        System.out.println("-----------------------------------------------");
                        break;
                    case 18:
                        System.out.println("-----USTED HA ELEGIDO BANCO------");
                        // instanciando la clase Banco para enviarle los valores al objeto
                         Banco B1 = new Banco();
                        // accediendo al objeto Banco bajo el nombre de B1 para enviar los datos a la
                        // clase plantilla
                        System.out.println("Ingrese su nombre");
                        B1.Nombre_Cuenta = leer.nextLine();
                        System.out.println("Ingrese el id de su cuenta");
                        B1.id_Cuenta = leer.nextInt();
                        System.out.println("La cantidad de dinero guardado es");
                        B1.Dinero_Guardado = leer.nextDouble();
                        System.out.println("Ingrese la cantidad que quiere retirar");
                        B1.Cantidad_Retirar = leer.nextDouble();
                        // Imprimiendo los valores
                        System.out.println("-----------------------------------------------");
                        System.out.println("Su nombre es : " + B1.Nombre_Cuenta);
                        System.out.println("Su ID de cuenta es: " + B1.id_Cuenta);
                        System.out.println("El dinero guardado es: " + B1.Dinero_Guardado);
                        System.out.println("La cantidad ah retirar es: " + B1.Cantidad_Retirar);
                        System.out.println("-----------------------------------------------");

                        break;
                    case 19:
                        System.out.println("-----USTED HA ELEGIDO IGLESIA------");
                        // instanciando la clase Iglesia para enviarle los valores al objeto
                         Iglesia I1 = new Iglesia();
                        // accediendo al objeto Iglesia bajo el nombre de I1 para enviar los datos a la
                        // clase plantilla
                        System.out.println("Ingrese el nombre de la iglesia");
                        I1.Nombre_iglesia = leer.nextLine();
                        System.out.println("Ingrese el la direccion de la iglesia");
                        I1.Direccion_iglesia = leer.nextLine();
                        System.out.println("Ingrese la cantidad de sillas");
                        I1.Cantidad_sillas = leer.nextInt();
                        System.out.println("Ingrese las personas que asisten");
                        I1.Personas_asistencia = leer.nextInt();
                        // Imprimiendo los valores
                        System.out.println("-----------------------------------------------");
                        System.out.println("El nombre de la iglesia es : " + I1.Nombre_iglesia);
                        System.out.println("La direcion de la iglesia es: " + I1.Direccion_iglesia);
                        System.out.println("Total de sillas es: " + I1.Cantidad_sillas);
                        System.out.println("Cantidad de personasn que asisten : " + I1.Personas_asistencia);
                        System.out.println("-----------------------------------------------");

                        break;
                    case 20:
                        System.out.println("-----USTED HA ELEGIDO FARMACIA------");
                        // instanciando la clase Farmacia para enviarle los valores al objeto
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

                    default:System.out.println("Valor invalido intente de nuevo");
                        break;
                }
            

        }
        
    }
}