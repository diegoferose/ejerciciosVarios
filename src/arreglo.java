import javax.swing.*;
import java.util.Scanner;

public class arreglo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos de su array"));
        char[] letras = new char[elementos];

        System.out.println("Digite los elementos de su array: ");
        for (int i = 0; i < elementos; i++){
            System.out.println((i+1)+". Digite un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }

        System.out.println("\nEstos son los elementos de su array: ");
        for (int i = 0; i < elementos; i++){
            System.out.println((i)+". | "+letras[i]+" | ");
        }
    }
}
