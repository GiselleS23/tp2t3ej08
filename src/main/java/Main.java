/* 8.- Se dispone de los datos sobre las edades y coeficientes de inteligencia (CI) de los hijos de varias familias. Realice un diagrama que lea el número de familias y para cada familia lea el número de hijos así como la edad y el CI de cada hijo, y calcule: - El número máximo, mínimo y promedio de hijos por familia - El Cl máximo, mínimo y promedio de todos los hijos. - El CI promedio de los hijos menores de 6 años. - El CI promedio de los hijos mayores de 6 años. Sacchetti Maria Giselle C2*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el número de familias:");
        int numFamilias = input.nextInt();

        int totalHijos = 0;
        int totalCI = 0;
        int totalHijosMenores6 = 0;
        int totalCIMenores6 = 0;
        int totalHijosMayores6 = 0;
        int totalCIMayores6 = 0;

        int maxHijosPorFamilia = Integer.MIN_VALUE;
        int minHijosPorFamilia = Integer.MAX_VALUE;

        int maxCI = Integer.MIN_VALUE;
        int minCI = Integer.MAX_VALUE;

        for (int i = 1; i <= numFamilias; i++) {
            System.out.println("Ingrese el número de hijos para la familia " + i + ":");
            int numHijos = input.nextInt();
            totalHijos += numHijos;

            if (numHijos > maxHijosPorFamilia) {
                maxHijosPorFamilia = numHijos;
            }
            if (numHijos < minHijosPorFamilia) {
                minHijosPorFamilia = numHijos;
            }

            for (int j = 1; j <= numHijos; j++) {
                System.out.println("Ingrese la edad del hijo " + j + ":");
                int edad = input.nextInt();
                System.out.println("Ingrese el coeficiente de inteligencia (CI) del hijo " + j + ":");
                int ci = input.nextInt();

                totalCI += ci;

                if (ci > maxCI) {
                    maxCI = ci;
                }
                if (ci < minCI) {
                    minCI = ci;
                }

                if (edad < 6) {
                    totalHijosMenores6++;
                    totalCIMenores6 += ci;
                } else {
                    totalHijosMayores6++;
                    totalCIMayores6 += ci;
                }
            }
        }

        double promedioHijosPorFamilia = (double) totalHijos / numFamilias;
        double promedioCI = (double) totalCI / totalHijos;
        double promedioCIMenores6 = (totalHijosMenores6 > 0) ? (double) totalCIMenores6 / totalHijosMenores6 : 0;
        double promedioCIMayores6 = (totalHijosMayores6 > 0) ? (double) totalCIMayores6 / totalHijosMayores6 : 0;

        System.out.println("Número máximo de hijos por familia: " + maxHijosPorFamilia);
        System.out.println("Número mínimo de hijos por familia: " + minHijosPorFamilia);
        System.out.println("Promedio de hijos por familia: " + promedioHijosPorFamilia);
        System.out.println("CI máximo de todos los hijos: " + maxCI);
        System.out.println("CI mínimo de todos los hijos: " + minCI);
        System.out.println("Promedio de CI de todos los hijos: " + promedioCI);
        System.out.println("CI promedio de los hijos menores de 6 años: " + promedioCIMenores6);
        System.out.println("CI promedio de los hijos mayores de 6 años: " + promedioCIMayores6);

        input.close();
    }
}



  