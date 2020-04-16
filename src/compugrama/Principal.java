package compugrama;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String args[]) {
        String figura = "";//N impar mayor que 5
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
        int centro = numero / 2;
        int derecha = 0;
        int izquierda = 0;

        for (int i = 0; i <= centro; i++) {//contador de filas 
            derecha = centro + i;
            izquierda = centro - i;
            for (int n = 0; n < numero; n++) {  //contador columnas

                if ((n == derecha) || (n == izquierda) || (i == centro)) {
                    figura += "*";
                } else {
                    figura += " ";
                }
            }
            figura += "\n";
        }
        System.out.println(figura);
    }
}
