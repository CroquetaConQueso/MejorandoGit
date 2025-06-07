
package empresainfofinalcarlostorresleon;

import java.util.Scanner;

public class EmpresaInfoFinalCarlosTorresLeon {
    public static void menu(){
        System.out.println("+-----------------------------------+");
        System.out.println("|          MENU EMPLEADOS          |");
        System.out.println("+-----------------------------------+");
        System.out.println("1. Crear nuevo empleado");
        System.out.println("2. Mostrar datos del empleado");
        System.out.println("3. Mostrar clasificación por permanencia");
        System.out.println("4. Aumentar salario");
        System.out.println("5. Actualizar datos del empleado");
        System.out.println("6. Salir");
        System.out.println("+-----------------------------------+");
    }
    public static void main(String[] args) {
        //Valor vacio hasta que se utilize
        Empleado e1 = null;
        int respuestaSwitch = 0;
        Scanner entrada = new Scanner(System.in);
        
        do {            
            menu();
            System.out.print("Opcion: ");
            respuestaSwitch = entrada.nextInt();
            switch (respuestaSwitch) {
                case 1:
                    //Creacion del usuario
                    System.out.println("Ingrese el nombre del empleado: ");
                    String nombre = entrada.next();
                    System.out.println("Ingrese el salario del empleado: ");
                    int salario = entrada.nextInt();
                    System.out.println("Ingrese la permanencia del empleado (en años): ");
                    int permanencia = entrada.nextInt();

                    e1 = new Empleado(nombre, salario, permanencia);
                    System.out.println("Empleado creado con éxito.\n");
                    break;
                case 2:
                    //si esta vacio no puede mostrarse, si tiene un valor se muestra
                    if (e1 != null) {
                        e1.datosEmpleado();
                    } else {
                        System.out.println("No hay ningun empleado creado.\n");
                    }
                    break;
                case 3:
                    //Se muestra como se encuentra clasificado
                    if (e1 != null) {
                        e1.mostrarClasificacion();
                    } else {
                        System.out.println("Primero debe crear un empleado.\n");
                    }
                    break;
                case 4:
                    //Se suma el porcentaje
                    if (e1 != null) {
                        System.out.println("Ingrese el porcentaje de aumento del salario: ");
                        int porcentaje = entrada.nextInt();
                        e1.subirSalario(porcentaje);
                    } else {
                        System.out.println("Primero debe crear un empleado.\n");
                    }
                    break;
                case 5:
                    //Se sobreescribe el empleado
                    if(e1 != null){
                        System.out.println("Ingrese el nuevo nombre del empleado: ");
                        String nuevoNombre = entrada.next();
                        System.out.println("Ingrese el nuevo salario del empleado: ");
                        int nuevoSalario = entrada.nextInt();
                        System.out.println("Ingrese la nueva permanencia del empleado (en años): ");
                        int nuevaPermanencia = entrada.nextInt();

                        e1.setsNombre(nuevoNombre);
                        e1.setiSalario(nuevoSalario);
                        e1.setiPermanencia(nuevaPermanencia);

                        System.out.println("Datos del empleado actualizados con éxito.\n");
                    } else {
                        System.out.println("Primero debe crear un empleado.\n");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.\n");
                    break;
            }
        } while (respuestaSwitch!=6);
        entrada.close();
    }
    
}
