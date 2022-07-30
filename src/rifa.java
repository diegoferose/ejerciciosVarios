import javax.swing.*;

public class rifa {
    public static void main(String[] args) {

        String[] nombres = {"Laura Vannesa","Paola","Juan Esteban","Gianny Frank",
                "Carlos Alberto","Diego Alejandro",
                "Isabella Rivillas","Santiago Ruiz","Leilani","Juan David","Caren"};
        for (int i = 0; i < 3; i++){
            int numeroRandom = (int) Math.floor(Math.random() * (nombres.length - 0));
            JOptionPane.showMessageDialog(null,"Felicidades eres el ganador, te toca exponer: "+nombres[numeroRandom]);
        }
    }
}
