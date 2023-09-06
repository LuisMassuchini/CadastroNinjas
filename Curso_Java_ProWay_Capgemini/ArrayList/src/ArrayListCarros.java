import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListCarros {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<>();

        carros.add("FLUENCE");
        carros.add("KOMBI");
        carros.add("JAGUAR");
        carros.add("BMW");
        carros.add("MERCEDES");
        carros.add("FUSCA");
        carros.add("VECTRA");

        System.out.println(carros);

        carros.set("MITSUBISHI");

        System.out.println(carros);

        carros.remove("VECTRA");

        carros.add(JOptionPane.showInputDialog("Informe o carro"));

        carros.clear();

        if(carros.isEmpty()) {
            System.out.println("O vetor está vazio");
        }

        if (carros.contains("BMW")){
            for (int i = 0; i < carros.size(); i++) {
                if ("BMW".equals(carros.get(i))){
                    carros.set(i, "BUGATTI");
                    break;
                }
            }
        }
        
    }
}
