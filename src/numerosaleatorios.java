import javax.swing.*;

public class numerosaleatorios {
    public static void main(String[] args) {

        int numero, aleatorio, contador = 0;
        aleatorio = (int) (Math.random() * 100);
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            if (aleatorio > numero) {
                System.out.println("mayor");
            } else {
                System.out.println("menor");
            }
            contador++;
        } while (numero != aleatorio);
        System.out.println("Has logrado adivinar el numero " + aleatorio + "En " + contador + " veces");
    }
}
