/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fallout.the.lonely.warrior.ClasesPrueba;

import javax.swing.JOptionPane;

public class Yermo {

    public static int[] mainYermo() {
        int num, horas = 0, cont = 0;
        int vector[] = new int[4];
        //int armadura = 0;
        while (horas <= 0) {
            horas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas horas quieres estar en el yermo?"));
        }

        System.out.println("--------------------------");
        System.out.println("ENTRANDO AL YERMO...");

        /*
         Las siguientes sentencias "do" generan aleatoreamente valores que van a
         determinar qué tipo de eventos ocurren en el yermo y en qué cantidad
         (por ejemplo si sufre daño y cuánto daño sufre o si encuentra salud cuánta
         salud encuetra, etc)
         */
        do {
            do {
                num = (int) (Math.random() * (1 - 5) + 5);
            } while (num == 0);

            switch (num) {
                case 1:
                    int daño;
                    // Genera números entre 1 y 15 (numMínimo-numMáximo)+numMáximo
                    daño = (int) (Math.random() * (3 - 30) + 30);
                    System.out.println("Sufres " + daño + " de daño");
                    vector[0] += daño;
                    break;
                case 2:
                    int monedas;
                    // Genera números entra 1 y 25
                    monedas = (int) (Math.random() * (1 - 25) + 25);
                    System.out.println("Encuentras " + monedas + " monedas");
                    vector[1] += monedas;
                    break;
                case 3:
                    int pocion;
                    // Genera números entre 1 y 15
                    pocion = (int) (Math.random() * (1 - 15) + 15);
                    System.out.println("Encuentras una poción con " + pocion + " de salud");
                    vector[2] += pocion;
                    break;

                case 4:
                    int armadura;
                    armadura = (int) (Math.random() * (1 - 15) + 25);
                    System.out.println("Has encontrado una armadura con " + armadura + " puntos de protección");
                    vector[3] = armadura;

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

}
