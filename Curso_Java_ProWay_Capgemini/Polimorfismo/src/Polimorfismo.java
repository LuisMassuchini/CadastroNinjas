public class Polimorfismo {
    public static void main(String[] args) {

        Mamifero mamifero1 = new Elefante();
        System.out.println("Cota diaria de leite de um elefante: " + mamifero1.cotaDiariaLeite());

        Mamifero mamifero2 = new Rato();
        System.out.println("Cota diaria de leite de um elefante: " + mamifero2.cotaDiariaLeite());
    }
}
