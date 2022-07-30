import javax.swing.*;

public class EjercicoOr {
    public static void main(String[] args) {
        int edad = 0;
        double estatura = 0;

        edad = Integer.parseInt(JOptionPane.showInputDialog("digite su edad"));
        estatura = Double.parseDouble(JOptionPane.showInputDialog("digite su estatura"));
        if ((edad > 15) ||( estatura>1.70) ){
            JOptionPane.showMessageDialog(null,"usted puede ingresar");
        }else{
            JOptionPane.showMessageDialog(null,"usted no puede ingresar");
        }

    }
}
