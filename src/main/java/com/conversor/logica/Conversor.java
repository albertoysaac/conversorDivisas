
package com.conversor.logica;

import com.conversor.igu.Pantalla;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;

/**
 *
 * @author alber
 */
public class Conversor {

    public static void main(String[] args) {
        FlatArcDarkOrangeIJTheme.setup();
        Pantalla view = new Pantalla();
        view.setVisible(true);
    }
}
