package lab.pkg2p2_andrés_nuila;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Lab2P2_Andrés_Nuila {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        char resp = 's';
        ArrayList casas = new ArrayList();
        ArrayList cListas = new ArrayList();
        ArrayList cConstruccion = new ArrayList();
        ArrayList cConsEspera = new ArrayList();
        ArrayList cDemoicion = new ArrayList();
        boolean login = false;
        casa c;
        while (resp == 's') {
            System.out.println("1. Registro de casas");
            System.out.println("2. Manejo de estados");
            System.out.println("3. Log In");
            System.out.println("4. SALIR");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    if (login == false) {
                        System.out.println("Inicie sesion para editar");
                        break;
                    } else {
                        System.out.println("1. Crear casa");
                        System.out.println("2. Listar casa");
                        System.out.println("3. Modificar casa");
                        System.out.println("4. Borrar casa");
                        int opc2 = leer.nextInt();
                        switch (opc2) {
                            case 1:

                                System.out.println("Ingrese el numero de casa");
                                int noCasa = leer.nextInt();
                                System.out.println("Ingrese eñ numero de bloque");
                                int noBloque = leer.nextInt();
                                System.out.println("Ingrese el color de la casa");
                                String color = leer.next();
                                System.out.println("Ingrese el ancho del terreno");
                                int ancho = leer.nextInt();
                                System.out.println("Ingrese el largo del terreno");
                                int largo = leer.nextInt();
                                System.out.println("Ingrese el numero de pisos");
                                int pisos = leer.nextInt();
                                System.out.println("Ingrese el numero de baños");
                                int baños = leer.nextInt();
                                System.out.println("Ingrese el numero de cuartos");
                                int cuartos = leer.nextInt();
                                System.out.println("ESTADO POR DEFECTO: LISTA \n(PARA CAMBIARLO IR A SECCION 'MODIFICACION DE ESTADOS')\n");
                                String estado = "LISTA";
                                System.out.println("Ingrese el nombre del ingeniero encargado");
                                String ing = leer.next();
                                System.out.println("¿Ya fue comprada la casa?");
                                String compra = leer.next();
                                if ("si".equals(compra) || "SI".equals(compra) || "Si".equals(compra)) {
                                    System.out.println("Ingrese el nombre del propietario");
                                    String dueño = leer.next();
                                    String estCompra = "comprada";
                                    c = new casa(noCasa, noBloque, color, ancho, largo, pisos, baños, cuartos, estado, ing, estCompra, dueño);
                                } else {
                                    String dueño = "N/A";
                                    String estCompra = "Sin dueño";
                                    c = new casa(noCasa, noBloque, color, ancho, largo, pisos, baños, cuartos, estado, ing, estCompra, dueño);
                                }
                                System.out.println(c);
                                casas.add(c);
                                break;
                            case 2:

                                if (casas.isEmpty()) {
                                    System.out.println("NO HAY REGISTROS A LISTAR");
                                } else {
                                    String cadena = "";
                                    for (int i = 0; i < casas.size(); i++) {
                                        cadena += "->" + casas.get(i) + "\n";
                                    }
                                    System.out.println(cadena);
                                }
                                break;
                            case 3:

                                if (casas.isEmpty()) {
                                    System.out.println("NO HAY REGISTROS A MODIFCAR");
                                } else {
                                    String cadena = "";
                                    for (int i = 0; i < casas.size(); i++) {
                                        cadena += "->" + casas.get(i) + "\n";
                                    }
                                    System.out.println(cadena);
                                    System.out.println("Ingrese el indice de la casa a modificar");
                                    int ind = leer.nextInt();
                                    System.out.println("1. Numero de casa \n2. Numero Bloque \n3. Color"
                                            + "\n4. Ancho \n5. Largo \n6. Numero de pisos \n7. Numero de baños"
                                            + "\n8. Numero de cuartos \n9. Nombre del dueño \n10. Ingeniero a cargo");
                                    System.out.println("ingrese la opcion a modificar");
                                    int opmod = leer.nextInt();
                                    switch (opmod) {
                                        case 1:
                                            System.out.println("Ingrese el numero nuevo de casa");
                                            int casaNueva = leer.nextInt();
                                            ((casa) casas.get(ind)).setNoCasa(casaNueva);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el numero nuevo de bloque");
                                            int bloqueNuevo = leer.nextInt();
                                            ((casa) casas.get(ind)).setNoBloque(bloqueNuevo);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese el nuevo color");
                                            String nuevoColor = leer.next();
                                            ((casa) casas.get(ind)).setColor(nuevoColor);
                                            break;
                                        case 4:
                                            System.out.println("Ingrese el numero nuevo de ancho");
                                            int anchoNuevo = leer.nextInt();
                                            ((casa) casas.get(ind)).setAncho(anchoNuevo);
                                            break;
                                        case 5:
                                            System.out.println("Ingrese el numero nuevo de largo");
                                            int largoNuevo = leer.nextInt();
                                            ((casa) casas.get(ind)).setLargo(largoNuevo);
                                            break;
                                        case 6:
                                            System.out.println("Ingrese el numero nuevo de pisos");
                                            int pisosNuevos = leer.nextInt();
                                            ((casa) casas.get(ind)).setAncho(pisosNuevos);
                                            break;
                                        case 7:
                                            System.out.println("Ingrese el numero nuevo de baños");
                                            int bañosNuevos = leer.nextInt();
                                            ((casa) casas.get(ind)).setBaños(bañosNuevos);
                                            break;
                                        case 8:
                                            System.out.println("Ingrese el numero nuevo de baños");
                                            int cuartosNuevos = leer.nextInt();
                                            ((casa) casas.get(ind)).setCuartos(cuartosNuevos);
                                            break;
                                        case 9:
                                            System.out.println("Ingrese el nuevo color");
                                            String nuevoDueño = leer.next();
                                            ((casa) casas.get(ind)).setDueño(nuevoDueño);
                                            break;
                                        case 10:
                                            System.out.println("Ingrese el nuevo color");
                                            String nuevoIng = leer.next();
                                            ((casa) casas.get(ind)).setIngeniero(nuevoIng);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 4:
                                String cadena = "";
                                for (int i = 0; i < casas.size(); i++) {
                                    cadena += i + "->" + casas.get(i) + "\n";
                                }
                                System.out.println(cadena);
                                System.out.println("Ingrese el indice de la casa a borrar");
                                int borrar = leer.nextInt();
                                casas.remove(borrar);
                                break;
                            default:
                                break;
                        }
                    }

                    break;
                case 2:
                    if (login == false) {
                        System.out.println("Inicie sesion para editar");
                        break;
                    } else {
                        if (casas.isEmpty()) {
                            System.out.println("NO HAY REGISTROS A MODIFICAR SU ESTADO");
                        } else {
                            String cadena = "";
                            for (int i = 0; i < casas.size(); i++) {
                                cadena += i + "->" + casas.get(i) + "\n";
                            }
                            System.out.println(cadena);
                            System.out.println("Ingrese el indice de la casa a modificar su estado");
                            int mod = leer.nextInt();
                            System.out.println("Ingrese el estado de la casa en cuestion");
                            String estado = leer.next();
                            while (cConstruccion.size() > 5 || cDemoicion.size() > 3) {
                                System.out.println("Ya no se puede adicionar mas casa en este estado. Intente uno nuevo");
                                estado = leer.next();
                                break;
                            }
                            while (!"LISTA".equals(estado) && !" EN CONSTRUCCION".equals(estado)
                                    && !"CONSTRUCCION EN ESPERA".equals(estado) && !"ESPERA DE DEMOLICION".equals(estado)) {
                                System.out.println("Entrada inválida, ingrese de nuevo");
                                estado = leer.next();
                            }
                            if (cConstruccion.size() > 5 || cDemoicion.size() > 3) {
                                System.out.println("Ya no se puede adicionar mas casa en este estado. Intente uno nuevo");
                                estado = leer.next();
                            }
                            ((casa) casas.get(mod)).setEstado(estado);
                            for (int i = 0; i < casas.size(); i++) {
                                String aux = ((casa) casas.get(i)).getEstado();
                                if ("LISTA".equals(aux)) {
                                    cListas.add(casas.get(i));
                                } else if ("EN CONSTRUCCION".equals(aux)) {
                                    cConstruccion.add(casas.get(i));
                                } else if ("CONSTRUCCION EN ESPERA".equals(aux)) {
                                    cConsEspera.add(casas.get(i));
                                } else if ("ESPERA DE DEMOLICION".equals(aux)) {
                                    cDemoicion.add(casas.get(i));
                                }
                            }
                        }
                    }

                case 3:
                    System.out.println("Ingrese su usuario");
                    String user = leer.next();
                    System.out.println("Ingrese su contraseña");
                    String password = leer.next();
                    if (!"leobanegas".equals(user) || !"99".equals(password)) {
                        System.out.println("Usuario/contraseña incorrecto");
                    } else {
                        login = true;
                    }
                    break;

            }
        }
    }

}
