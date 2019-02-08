package lab4_eliasjosedjoel;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Lab4_EliasJoseDJoel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Criminales> criminales = new ArrayList();
        ArrayList<Policias> policias = new ArrayList();

        char resp = 's';
        int opcion;
        int posicion;
        String nombre;
        int edad;
        String genero, pais, descripcion;
        boolean encarcelado = false;
        boolean culpable = false;
        char encarcelado1;
        int cont = 0;
        String anos = "";
        Random r = new Random();
        while (resp == 's' || resp == 'S') {
            System.out.println("Ingrese opcion: \n"
                    + "1. Agregar \n"
                    + "2. Modificar \n"
                    + "3. Eliminar \n"
                    + "4. Listar delitos \n"
                    + "5. TAS \n"
                    + "6. Listar Policias: ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese opcion: \n"
                            + "1. Agregar Criminal: \n"
                            + "2. Agregar Delito: \n"
                            + "3. Agregar Policia: \n"
                            + "4. Agregar agente: ");
                    opcion = input.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Ingrese Nombre: ");
                            input.nextLine();
                            nombre = input.nextLine();
                            System.out.println("Ingrese edad: ");
                            edad = input.nextInt();
                            System.out.println("Ingrese genero: ");
                            genero = input.next();
                            System.out.println("Ingrese pais de residencia: ");
                            pais = input.next();
                            System.out.println("Ingrese si fue encarcelado: ");
                            encarcelado1 = input.next().charAt(0);
                            if (encarcelado1 == 'S' || encarcelado1 == 's') {
                                encarcelado = true;
                            }
                            System.out.println("Ingrese descripcion fisica: ");
                            input.nextLine();
                            descripcion = input.nextLine();
                            criminales.add(new Criminales(nombre, edad, genero, pais, encarcelado, descripcion));
                            break;
                        case 2:

                            System.out.println("Ingrese descripcion: ");
                            input.nextLine();
                            descripcion = input.nextLine();
                            System.out.println("Ingrese nombre de la victima: ");
                            String nombrevictima = input.nextLine();
                            System.out.println("");
                            System.out.println("Ingrese si es culpable o no[s/n]: ");
                            char culpable1 = input.next().charAt(0);
                            if (culpable1 == 's' || culpable1 == 'S') {
                                culpable = true;
                                System.out.println("Ingrese sentencia \n"
                                        + "1. Sentencia en años: \n"
                                        + "2. Pena de muerte en años: ");
                                opcion = input.nextInt();

                                switch (opcion) {
                                    case 1:
                                        System.out.println("Ingrese años: ");
                                        anos = input.next();
                                        break;
                                    case 2:
                                        anos = "Pena de muerte";
                                        break;
                                }

                            } else {
                                culpable = false;
                            }
                            System.out.println("Ingrese fecha en el formato dd/MM/yyyy: ");
                            String fecha = input.next();
                            System.out.println("Ingres pais: ");
                            input.next();
                            pais = input.next();

                            System.out.println("Ingrese numero de delito: ");
                            int delito = input.nextInt();
                            boolean repeticion = false;
                            for (int i = 0; i < criminales.size(); i++) {

                                while (criminales.get(i).getDelitos().get(i).getNum() == delito) {
                                    System.out.println("Ya existe el numero de delito: ");
                                    System.out.println("Ingrese numero de delitos: ");
                                    delito = input.nextInt();
                                }

                            }
                            System.out.println("Ingrese opcion: \n"
                                    + "1.Delito Grave: \n"
                                    + "2. Delito menor: ");
                            opcion = input.nextInt();
                            switch (opcion) {
                                case 1:

                                    System.out.println("Ingrese puntuacion de gravedad: ");
                                    int gravedad = input.nextInt();
                                    if (culpable) {
                                        System.out.println("Ingrese puntuacion de gravedad: ");
                                        gravedad = input.nextInt();
                                        while (gravedad > 5 || gravedad < 1) {
                                            System.out.println("La gravedad debe estar entre 1 y 5");

                                        }

                                        criminales.get(0).getDelitos().add(new DGrave(descripcion, nombrevictima, culpable, fecha, pais, delito, anos));
                                    } else {
                                        criminales.get(0).getDelitos().add(new DGrave(gravedad, descripcion, nombrevictima, culpable, fecha, pais, delito));
                                    }
                                    break;
                                case 2:
                                    if (culpable) {
                                        System.out.println("Ingrese nombre del policia: ");
                                        input.next();
                                        String nombrepolicia = input.next();
                                        System.out.println("Ingrese id del policia: ");
                                        String idc = input.next();
                                        System.out.println("Ingrese numero de celda: ");
                                        int celda = input.nextInt();
                                        criminales.get(cont).getDelitos().add(new DMenor(descripcion, nombrevictima, culpable, fecha, pais, delito, anos));
                                        cont++;
                                    } else {
                                        criminales.get(cont).getDelitos().add(new DMenor(descripcion, nombrevictima, culpable, fecha, pais, delito));
                                        cont++;
                                    }
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese nombre del policia: ");
                            String policia = input.next();
                            System.out.println("ingrese Id: ");
                            int idp = input.nextInt();
                            System.out.println("Ingrese edad: ");
                            int edad1 = input.nextInt();
                            policias.add(new Policias(policia, idp, edad1));

                            break;
                        case 4:
                            System.out.println("Ingrese opcion: \n"
                                    + "1. Terrorista \n"
                                    + "2. Asesino \n"
                                    + "3. Secuestrador*");
                            int opcion2 = input.nextInt();
                            switch (opcion2) {
                                case 1:
                                    System.out.println("Ingrese pais de ataque: ");
                                    String pais2 = input.next();
                                    System.out.println("Ingrese ciudad de ataque: ");
                                    String ciudad = input.next();
                                    System.out.println("Ingrese metodo: ");
                                    String metodo = input.next();
                                    criminales.add(new Terrorista(pais2, ciudad, metodo));
                                    break;
                                case 2:
                                    System.out.println("Ingrese nombre de victima: ");
                                    input.next();
                                    nombrevictima = input.next();
                                    System.out.println("Ingrese arma: ");
                                    String arma = input.next();
                                    criminales.add(new Asesino(nombrevictima, arma));

                                    break;
                                case 3:
                                    System.out.println("Ingrese nombre de victima: ");
                                    input.next();
                                    nombrevictima = input.next();
                                    System.out.println("Ingrese cantidad por el rescate: ");
                                    int cantidad = input.nextInt();
                                    criminales.add(new Secuestrador(nombrevictima, resp));
                                    break;
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Ingrese opcion: \n"
                            + "1. Modificar Criminal \n"
                            + "2. Modificar Agente: \n"
                            + "3. Modificar Delito: \n"
                            + "4. Modificar Policia: ");
                    opcion = input.nextInt();
                    switch (opcion) {
                        case 1:
                            String impresion = "";
                            for (Object t : criminales) {
                                impresion = criminales.indexOf(t) + " -- " + " \n";
                            }
                            System.out.println(impresion);
                            System.out.println("Ingrese posicion del Criminal a modificar: ");
                            posicion = input.nextInt();
                            System.out.println("1. Nombre: \n "
                                    + "2. Edad: \n"
                                    + "3. Encarcelado: \n"
                                    + "4. Descripcion: "
                            );
                            opcion = input.nextInt();
                            switch (opcion) {
                                case 1:
                                    System.out.println("Ingrese Nombre: ");
                                    input.nextLine();
                                    nombre = input.nextLine();
                                    criminales.get(posicion).setNombre(nombre);

                                    break;
                                case 2:
                                    System.out.println("Ingrese edad: ");
                                    edad = input.nextInt();
                                    criminales.get(posicion).setEdad(edad);
                                    break;
                                case 3:
                                    System.out.println("Ingrese si fue encarcelado: ");
                                    encarcelado1 = input.next().charAt(0);
                                    if (encarcelado1 == 'S' || encarcelado1 == 's') {
                                        encarcelado = true;
                                    }
                                    criminales.get(posicion).setEncarcelado(encarcelado);
                                    break;
                                case 4:
                                    System.out.println("Ingrese descripcion fisica: ");
                                    input.nextLine();
                                    descripcion = input.nextLine();
                                    criminales.get(posicion).setDescripcion(descripcion);
                                    break;
                            }

                            break;
                        case 2:
                            System.out.println("Ingrese posicion del Agente a modificar: ");
                            posicion = input.nextInt();
                            break;
                        case 3:
                            System.out.println("Ingrese posicion del Delito a modificar: ");
                            posicion = input.nextInt();
                            break;
                        case 4:
                            System.out.println("Ingrese posicion del Policia a modificar: ");
                            posicion = input.nextInt();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese opcion: \n"
                            + "1. Eliminar Criminal: \n"
                            + "2. Eliminar Agente: \n"
                            + "3. Eliminar Delito: \n"
                            + "4. Eliminar Policia: ");
                    opcion = input.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Ingrese posicion del Criminal a modificar: ");
                            posicion = input.nextInt();
                            break;
                        case 2:
                            System.out.println("Ingrese posicion del Agente a modificar: ");
                            posicion = input.nextInt();
                            break;
                        case 3:
                            System.out.println("Ingrese posicion del Delito a modificar: ");
                            posicion = input.nextInt();
                            break;
                        case 4:
                            System.out.println("Ingrese posicion del Policia a modificar: ");
                            posicion = input.nextInt();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Ingrese opcion: \n"
                            + "1. Listar delitos de criminales: \n"
                            + "2. Listar delitos de Agente: \n");
                    opcion = input.nextInt();
                    switch (opcion) {
                        case 1:
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Ingrese opcion: \n"
                            + "1. Cometer delito: \n"
                            + "2. Reporte de agentes: ");
                    opcion = input.nextInt();
                    switch (opcion) {
                        case 1:
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Ingrese posicion del policia: ");
                    posicion = input.nextInt();
                    break;

            }
            System.out.println("Desea ingresar otra opcion[s/n]: ");
            resp = input.next().charAt(0);
        }
    }

}
