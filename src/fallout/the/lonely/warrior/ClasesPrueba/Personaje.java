package fallout.the.lonely.warrior.ClasesPrueba;

import javax.swing.JOptionPane;

public class Personaje {

    public static void mainPersonaje() {
        int salud = 100,
                armadura = 0,
                monedas = 50,
                daño = 2,
                nivel = 1;
        int retorno[] = new int[4];
        retorno = Yermo.mainYermo(); //SE IGUALA LOS VALORES DEL ARRAY YERMO AL ARRAY RETORNO

        armadura += retorno[3];
        salud -= retorno[0];
        monedas += retorno[1];
        //salud += retorno[2];

        if (salud > 100) {
            salud = 100;
        }
        if (armadura < 0) {
            armadura = 0;
        }
//        estadisticas i  = new estadisticas();
//        i.setLocationRelativeTo(null);
//        i.setVisible(true);
        estadisticas(salud, armadura, monedas, daño, nivel);
    }

    public static void estadisticas(int salud, int armadura, int monedas, int daño, int nivel) {
        System.out.println("--------------------------");
        System.out.println("ESTADÍSTICAS DEL PERSONAJE\n"
                + "Salud: " + salud + "\n"
                + "Armadura: " + armadura + "\n"
                + "Monedas: " + monedas + "\n"
                + "Ataque: " + daño);

    }
}
