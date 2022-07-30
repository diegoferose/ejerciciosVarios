import javax.swing.*;

public class switchCase {

    public static void main(String[] args) {

        String sms = "Seleccione como desea pagar \n";
        sms += "1. Contado\n";
        sms += "2. Tarjeta\n";
        sms += "0. Salir del programa";

        String entrada = JOptionPane.showInputDialog(sms);

        switch (entrada){
            case "1":
                JOptionPane.showMessageDialog(null,"Paga de contado");
                break;
            case "2":
                JOptionPane.showMessageDialog(null,"Paga con tarjeta");
                break;
            case "0":
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null,"La opcion no se encuentra en el menu");
                break;
        }
    }

}
