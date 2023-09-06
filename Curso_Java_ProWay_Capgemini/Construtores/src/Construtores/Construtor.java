package Construtores;

import Construtores.Aluno.STATUS;
import Construtores.Aluno.MATRICULA;



public class Construtor {

    public static void main(String[] args) {
        Aluno alu = new Aluno(8, 8, 8);

        double mediaAlunoFinal = alu.calcularMediaAluno();

        if (mediaAlunoFinal < 6) {
            alu.situacaoAluno = STATUS.REPROVADO;
        } else {
            alu.situacaoAluno = STATUS.APROVADO;
        }

        System.out.println("A média do aluno é : " + alu.calcularMediaAluno());

        alu.situacaoMatricula = MATRICULA.MATRICULADO;
        System.out.println("O aluno está em " + alu.situacaoMatricula);

    }
}
