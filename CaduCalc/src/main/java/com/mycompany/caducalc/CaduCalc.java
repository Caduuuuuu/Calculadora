
package com.mycompany.caducalc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jØww
 */
public class CaduCalc {

    public static void main(String[] args) {
   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculadora().setVisible(true);
            }
        });
    }
}
