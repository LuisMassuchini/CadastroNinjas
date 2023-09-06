public class ComandoCondicional {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        if (num1 < num2) {
            System.out.println("Número 1 é menor que o número 2");
        }


        if (num1 > num2) {
            System.out.println("Número 1 é maior que o número 2");
        }else {
            System.out.println("Número 1 é menor que o número 2");
        }

        num1 = 10;
        num2 = 10;
        if (num1 > num2){
            System.out.println("Número 1 é maior que o número 2");
        } else if (num1 < num2) {
            System.out.println("Número 1 é menor que o número 2");
        } else {
            System.out.println("Número 1 é igual ao número 2");
        }

        int opcao = 1;
        switch (opcao){
            case 1: {
                System.out.println("Chame o programa de Inclusão");
                break;
            }
            case 2: {
                System.out.println("Chame o programa de Alteração");
                break;
            }
            case 3: {
                System.out.println("Chame o programa de Exclusção");
                break;
            }
            case 4: {
                System.out.println("Chame o programa de Consulta");
                break;
            }
            default:
                System.out.println("Opção Inválida : " + opcao + " Regedite");
        }

    }
}
