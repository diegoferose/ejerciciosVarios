import javax.swing.*;

public class arrayUnidimensional {
    public static void main(String[] args) {
        String[] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = JOptionPane.showInputDialog("ingrese un nombre");
            System.out.println(nombres[i]);
        }
    }
}
