import java.util.Scanner;

public class Ninja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //array
        int numMax = 5;
        String[] ninja = new String[numMax];


        //contadores
        int ninjaCadastrados = 0;
        int opcao = 0;


        while (opcao != 3) {
            //Menu
            System.out.println("\n ====Menu ======");
            System.out.println("1. Cadastra Ninja:");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjaCadastrados < numMax) {
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String nomeNinja = sc.nextLine();
                        ninja[ninjaCadastrados] = nomeNinja;
                        ninjaCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso.");
                    } else {
                        System.out.println("Lista esta cheia");
                    }
                    break;
                case 2:
                    if (ninjaCadastrados < 0 ) {
                        System.out.println("Nenhum ninja encontrado");
                    } else {
                        for (int i = 0; i < ninja.length; i++) {
                            System.out.println(ninja[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Programa encenrado");
                    break;
            }

        }

        sc.close();


    }
}



