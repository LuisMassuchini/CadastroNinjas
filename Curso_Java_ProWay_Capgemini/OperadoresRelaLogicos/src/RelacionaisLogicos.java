public class RelacionaisLogicos {
    public static void main(String[] args) {
        int num1, num2;
        num1 = 10;
        num2 = 10;

        if (num1 == num2) {
            System.out.println("Eles são iguais");
        }

        num1 = 10;
        num2 = 30;

        if (num1 != num2) {
            System.out.println("Eles são diferentes");
        }

        num1 = 10;
        num2 =5;
        int num3 = 20, num4 = 5;
        if (num1 > num3 && num2 == num3){
            System.out.println("O que vocês está fazendo dessa sua vida?");
        }else {
            System.out.println("Parabéns, seu estudiooso, você fez tudo errado!");
        }
    }
}
