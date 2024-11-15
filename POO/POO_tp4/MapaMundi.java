package POO_tp4;

import java.util.Scanner;
import java.util.Set;

public class MapaMundi {
    public static void main(String[] args) {
        MapaMundial mapaMundial = new MapaMundial();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Listar los países de un continente");
            System.out.println("2. Listar las provincias de un país");
            System.out.println("3. Listar los países limítrofes de un país");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del continente: ");
                    String nombreContinente = scanner.nextLine();
                    Set<Pais> paises = mapaMundial.getPaises(nombreContinente);
                    if (paises.isEmpty()) {
                        System.out.println("No se encontraron países para el continente especificado.");
                    } else {
                        System.out.println("Países en " + nombreContinente + ":");
                        for (Pais pais : paises) {
                            System.out.println("- " + pais.getNombre());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del país: ");
                    String nombrePais = scanner.nextLine();
                    Set<Provincia> provincias = mapaMundial.getProvincias(nombrePais);
                    if (provincias.isEmpty()) {
                        System.out.println("No se encontraron provincias para el país especificado.");
                    } else {
                        System.out.println("Provincias en " + nombrePais + ":");
                        for (Provincia provincia : provincias) {
                            System.out.println("- " + provincia.getNombre());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del país: ");
                    nombrePais = scanner.nextLine();
                    Set<Pais> limitrofes = mapaMundial.getLimitrofes(nombrePais);
                    if (limitrofes.isEmpty()) {
                        System.out.println("No se encontraron países limítrofes para el país especificado.");
                    } else {
                        System.out.println("Países limítrofes de " + nombrePais + ":");
                        for (Pais pais : limitrofes) {
                            System.out.println("- " + pais.getNombre());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
                    break;
            }
        }
    }
}