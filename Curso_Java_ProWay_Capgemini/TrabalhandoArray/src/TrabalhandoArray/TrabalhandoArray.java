package TrabalhandoArray;

import javax.swing.*;

public class TrabalhandoArray {
    public static void main(String[] args) {
        String [] paises = new String[4];

        int [] numeros = new int[5];

        for (int i = 0; i < 4; i++){
            paises[i] = JOptionPane.showInputDialog("Informe Um País");
        }

        for (String lista: paises) {
            System.out.println(lista);
            
        }

        for (int i = 0; i < 5; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
            
        }

        for (Integer listaNumeros: numeros
             ) {
            System.out.println(listaNumeros);
        }
    }
}
