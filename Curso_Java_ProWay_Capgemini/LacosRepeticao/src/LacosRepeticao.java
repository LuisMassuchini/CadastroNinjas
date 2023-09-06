public class LacosRepeticao {
    public static void main(String[] args) {
        int qtVezes = 1;

        while (qtVezes <=10){
            System.out.println("Estou fazendo a " + qtVezes + "º vezes.");
            qtVezes++;
        }

        do {
            System.out.println("Estou fazendo a " + qtVezes + "º vezes.");
            qtVezes++;
        } while (qtVezes <= 10); {
            System.out.println("sai do laço");
        };
    }

}
