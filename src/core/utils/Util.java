package core.utils;

import javax.swing.JOptionPane;

public class Util {

    public void alertMessage() {
//        System.out.println("mensaje");
        System.out.println("aquiiiiiiii");
        JOptionPane.showMessageDialog(null,
                "Invalid password. Try again.",
                "Error Message",
                JOptionPane.ERROR_MESSAGE);
    }
}
