package fallout.the.lonely.warrior.ClasesPrueba;

import javax.swing.JOptionPane;

public class Mercado {
    public static void main () {
        int respMercado, respArma, confirmArma, respArmadura, confirmArmadura, respEquip, confirmEquip;
        int vector[] = new int [2];
        
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
                respEquip = Integer.parseInt(JOptionPane.showInputDialog("E mercadoLIJA UNA OPCIÓN PARA COMPRAR\n"
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
