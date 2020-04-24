/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompugramaTati;

import javax.swing.JOptionPane;

/**
 *
 * @author tati
 */
public class Compugrama {

    public static void main(String args[]) {
        int nA = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos asteriscos desea"));
        int nB;
        if (nA % 2 == 0) {
            nB = nA / 2;
        } else {
            nB = (nA / 2) + 1;
        }

        for (int n = 0; n < nB; n++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= n; i++) {
                if ((i == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        for (int n = nB; n >= 0; n--) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= n; i++) {
                if ((i == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

}
