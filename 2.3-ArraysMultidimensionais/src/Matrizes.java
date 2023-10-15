import javax.swing.JOptionPane;

public class Matrizes {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que solicite ao usu�rio a entrada de 4 notas 
		 * para cada aluno, calcular a m�dia dos alunos e exibir em tela. 
		 * Ao final mostrar a m�dia da turma. 
		 * Ao lado da m�dia do aluno deve seguir a seguinte regra de neg�cio.
		 * Se m�dia >= 7,5               Aluno Aprovado
		 * Se m�dia >= 5,5 e <7,5   Aluno em Recupera��o
		 * Se m�dia  < 5,5                Aluno Reprovado
		*/
		// Vetor dos alunos
		String [] alunos = {"JOAO","JOSE","MARIA"};
	
		// Matriz das notas
		float [][] notas = new float[3][4];
		
		// para controlar o somat�rio das notas de cada aluno
		// para calcular a media do aluno
		float somaNotas, mediaAluno;
		// par armazenar o status do aluno e usar para imprimir o boletim depois
		String statusAluno;
		
		// informar as notas dos alunos
		// laço externo para associar aluno e nota
		for (int i = 0; i < 3; i++) {

			// la�o interno para informar as notas de cada aluno
			somaNotas = 0;
			mediaAluno = 0;
			for (int j = 0; j < 4; j++) {
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota nº " + (j+1) + " do aluno " + alunos[i]));
			    somaNotas = somaNotas + notas[i][j];
			}
			mediaAluno = somaNotas / 4;
			if	(mediaAluno < 5.5) {
				statusAluno = "REPROVADO";
			} else if (mediaAluno >= 5.5 && mediaAluno <= 7.5) {
				statusAluno = "EM RECUPERAÇÃO";
			} else {
				statusAluno = "APROVADO";
			}
			// impress�o do boletim
			System.out.println("\n************ BOLETIM *************");
			System.out.println("Aluno.: " + alunos[i]);
			System.out.println("Notas");
			for (int j1 = 0; j1 < 4; j1++) {
				System.out.println((j1+1) + " - " + notas[i][j1]);
			}
			System.out.println("Média ..: " + mediaAluno + " - " + statusAluno);
		}
	}
}
