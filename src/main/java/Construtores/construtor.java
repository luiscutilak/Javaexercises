package Construtores;

import Construtores.Aluno.STATUS;


public class construtor {
    public static void main(String[] args) {
        //passando os dados através do construtor
        Aluno alu = new Aluno(8, 8, 8);
        //calculando a média
        double mediaAlunoFinal = alu.calcularMediaAluno();
        
        //definindo situação do Aluno
        
        if(mediaAlunoFinal < 6){
            alu.situacaoAluno = STATUS.REPROVADO;
            
        } else {
            alu.situacaoAluno = STATUS.APROVADO;
        }
        System.out.println("A média do aluno é: " + alu.calcularMediaAluno() + "e o aluno está " + alu.situacaoAluno);
    }
}
