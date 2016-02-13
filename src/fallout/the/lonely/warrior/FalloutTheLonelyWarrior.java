/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fallout.the.lonely.warrior;

import javax.swing.JOptionPane;


public class FalloutTheLonelyWarrior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int respMenu = 0;
        int estadis[] = new int[3];

        estadis[0] = 100; // Salud
        estadis[1] = 50; // Monedas
        estadis[2] = 0; // Armadura     

        int retorno[] = new int[3];

        // Título del juego
        System.out.println("____________________________________________");
        System.out.println("| BIENVENIDO A FALLOUT: THE LONELY WARRIOR |");
        System.out.println("|__________________________________________|\n");
        // Intro
        System.out.println("La guerra nuclear no parece tener fin, tu refugio fue destruído y tu familia \n"
                + "asesinada. Te encuentras solo al amparo de una cueva y tu único objetivo es sobrevivir, \n"
                + "por ahora...\n\nVersión 1.0 pre Alpha (?\n");

        // Verifica si el usuario quiere salir del juego, sino continúa mostrando el menú
        while (respMenu != 3) {

            do {
                // Actualizo las estadísticas del personaje luego de la función yermo o de la función mercado
                estadis[0] += retorno[0];
                estadis[1] += retorno[1];
                estadis[2] += retorno[2];

                // Con esta sentencia if controlo que la salud no sea mayor a 100
                if (estadis[0] > 100) {
                    estadis[0] = 100;
                }

                // Muestro las estadísticas del personaje actualizadas
                System.out.println("--------------------------");
                System.out.println("ESTADÍSTICAS DEL PERSONAJE\n"
                        + "Salud: " + estadis[0] + "\n"
                        + "Monedas: " + estadis[1] + "\n"
                        + "Armadura: " + estadis[2]);

                // Menú de opciones principal
                respMenu = Integer.parseInt(JOptionPane.showInputDialog("OPCIONES DISPONIBLES\n1-Explorar el yermo\n2-Mercado\n3-Salir del juego"));
            } while (respMenu != 1 && respMenu != 2 && respMenu != 3);

            switch (respMenu) {
                case 1:
                    retorno = yermo(estadis);
                    break;
                case 2:
                    mercado();
                    break;
            }

        }
        System.out.println("--------------------------");
        System.out.println("SALIENDO DEL JUEGO...");

    }

    // Función yermo
    public static int[] yermo(int[] vector) {
        int num, horas, cont = 0;

        horas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas horas quieres estar en el yermo?"));

        System.out.println("--------------------------");
        System.out.println("ENTRANDO AL YERMO...");

        /*
         Las siguientes sentencias "do" generan aleatoreamente valores que van a
         determinar qué tipo de eventos ocurren en el yermo y en qué cantidad
         (por ejemplo si sufre daño y cuánto daño sufre o si encuentra salud cuánta
         salud encuetra, etc)
         */
        do {
            /*
             Si la salud está al máximo va a generar un número entre 1 y 2, para
             que sólo reciba daño y encuentre menedas (y no encuentre pociones)
             Si la salud es menor al máximo va a generar un número entre 1 y 3
             */

            num = (int) (Math.random() * (1 - 5) + 5);

            switch (num) {
                case 1:
                    int daño;
                    // Genera números entre 1 y 15 (numMínimo-numMáximo)+numMáximo
                    daño = (int) (Math.random() * (1 - 15) + 15);
                    System.out.println("Sufres " + daño + " de daño");
                    vector[0] -= daño;
                    break;
                case 2:
                    int monedas;
                    // Genera números entra 1 y 25
                    monedas = (int) (Math.random() * (1 - 25) + 25);
                    System.out.println("Encuentras " + monedas + " monedas");
                    vector[1] += monedas;
                    break;
                case 3:
                    int armadura;
                    // Genera números entre 1 y 15
                    armadura = (int) (Math.random() * (1 - 15) + 15);
                    System.out.println("Encuentras una armadura con " + armadura + " de protección");
                    vector[2] += armadura;
                    break;
                case 4:
                    int pocion;
                    // Genera números entre 1 y 15
                    pocion = (int) (Math.random() * (1 - 15) + 15);
                    System.out.println("Encuentras una poción con " + pocion + " de salud");
                    vector[0] += pocion;
                    break;
            }

            // Esta porción de código "detiene" la ejecución del programa por cierto tiempo
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            cont++;
        } while (horas != cont);

        return vector;
    }

    //Función mercado
    public static void mercado() {
        int respMercado, respArma, confirmArma, respArmadura, confirmArmadura, respEquip, confirmEquip;
        int vector[] = new int[2];

        System.out.println("--------------------------");
        System.out.println("BIENVENIDO AL MERCADO");
        respMercado = Integer.parseInt(JOptionPane.showInputDialog("1-Armas\n2-Armaduras\n3-Equipamiento"));

        // Menú principal del mercado
        switch (respMercado) {
            case 1:
                respArma = Integer.parseInt(JOptionPane.showInputDialog("ELIJA UNA OPCIÓN PARA COMPRAR\n"
                        + "1-Daga\n"
                        + "2-Cuchillo\n"
                        + "3-Revólver\n"
                        + "4-Escopeta\n"
                        + "5-Rifle\n"
                        + "Ametralladora"));
                switch (respArma) {
                    case 1:
                        confirmArma = JOptionPane.showConfirmDialog(null, "ARMA: Daga\nATAQUE: 4\nPRECIO: 60 monedas", "¿COMPRAR ARMA?", JOptionPane.YES_NO_OPTION);
                        if (confirmArma == JOptionPane.YES_OPTION) {
                            vector[0] = 4;
                            vector[1] = 60;
                        }
                        break;
                }
                break;
            case 2:
                respArmadura = Integer.parseInt(JOptionPane.showInputDialog("ELIJA UNA OPCIÓN PARA COMPRAR\n"
                        + "1-Arapos\n"
                        + "2-Traje acolchado"
                        + "3-Armadura oxidada"
                        + "Cota de mayas"));
                switch (respArmadura) {
                    case 1:
                        confirmArmadura = JOptionPane.showConfirmDialog(null, "ARMADURA: Arapos\nPROTECCIÓN: 1\nPRECIO: 75 monedas", "¿COMPRAR ARMADURA?", JOptionPane.YES_NO_OPTION);
                        if (confirmArmadura == JOptionPane.YES_OPTION) {
                            vector[0] = 1;
                            vector[1] = 75;
                        }
                        break;
                }
                break;
            case 3:
                respEquip = Integer.parseInt(JOptionPane.showInputDialog("ELIJA UNA OPCIÓN PARA COMPRAR\n"
                        + "1-Poción de salud menor"
                        + "2-Poción de salud media"
                        + "3-Gran poción de salud"));
                switch (respEquip) {
                    case 1:
                        confirmEquip = JOptionPane.showConfirmDialog(null, "Esta poción contiene 10 puntos de salud", "¿COMPRAR?", JOptionPane.YES_NO_OPTION);
                        if (confirmEquip == JOptionPane.YES_OPTION) {
                            vector[0] = 10;
                        }
                        break;
                }
                break;
        }
    }
}
