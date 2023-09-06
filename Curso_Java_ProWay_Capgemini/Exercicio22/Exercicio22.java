public class Exercicio22 {
}
import  java.util.Scanner;

public calss Main {
    public static void main(String[]args){
        String nomeProduto;
        float precoProduto;
        float precoVenda;

        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        Scanner leitor = new Scanner(System.in);
        int i = 0;

        for ( i < 40; i++) {

            System.out.println("Digite o nome do produto");
            nomeProduto = leitor.nextLine();

            System.out.println("Digite o preço de custo do produto");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite o preço de Venda do produto");
            precoVenda = leitor.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if(precoCusto == precoVenda){
                System.out.println("Houve um empate entre o preço de custo e de venda");
            } else {
              if(precoCusto > precoVenda) {
                  System.out.println("Houve prejuizo");
        }  else {
                  System.out.println("Houve Lucro");
        }
            }
        }

        System.out.println("O total do preço de custo é de : " + (totalCusto/i))
        System.out.println("O total do preço de venda é de : " + (totalVenda/i))
    }
}