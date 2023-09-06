public class Pessoas {
    public static void main(String[] args) {

        Fisica fis = new Fisica();
        fis.nome = "Felipe";
        fis.cpf = "111.111.111.22";
        fis.identidade = "123456789";
        fis.situacaoPessoa = "A";

        Juridica jur = new Juridica();

        jur.cnpj = "123.123.123";
        jur.nome = "Forts";
        jur.inscEstadual = "45445454545";
        jur.situacaoPessoa = "I";

        System.out.println("Dados Pessoa Física");
        System.out.println(fis.toString());
    }
}
