package lab.pkg2p2_andrés_nuila;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Lab2P2_Andrés_Nuila {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        char resp = 's';
        ArrayList casas = new ArrayList();
        casa c = new casa();
        while (resp == 's') {
            System.out.println("1. Registro de casas");
            System.out.println("2. Manejo de estados");
            System.out.println("3. Log In");
            System.out.println("4. SALIR");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
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
                            System.out.println("Ingrese el estado");
                            String estado = leer.next();
                            System.out.println("Ingrese el nombre del ingeniero encargado");
                            String ing = leer.next();
                            System.out.println("¿Ya fue comprada la casa?");
                            String compra = leer.next();
                            if ("si".equals(compra) || "SI".equals(compra) || "Si".equals(compra)) {
                                System.out.println("Ingrese el nombre del propietario");
                                String dueño = leer.next();
                                c = new casa(noCasa, noBloque, color, ancho, largo, pisos, baños, cuartos, estado, ing, dueño);
                            } else {
                                String dueño ="N/A";
                                c = new casa(noCasa, noBloque, color, ancho, largo, pisos, baños, cuartos, estado, ing, dueño);
                            }
                            System.out.println(c);
                            casas.add(c);
                            break;
                        case 2:
                            if (casas.isEmpty()){
                                System.out.println("NO HAY REGISTROS A LISTAR");
                            }else {
                                String cadena = "";
                                for (int i = 0; i < casas.size(); i++) {
                                    cadena +="->"+casas.get(i);
                                }
                            }

                    }
            }
        }
    }

}
