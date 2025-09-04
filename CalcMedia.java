import java.util.Scanner;

public class CalcMedia {
    public static void main(String[] args) {

        String[] nomesAlunos = new String[3];
        float[] notasUm = new float[3];
        float[] notasDois = new float[3];
        float[] notasTres = new float[3];
        float[] mediasAlunos = new float[3];

        Scanner leitor = new Scanner(System.in);

        System.out.println("Calculadora de média de Alunos!\n");

		// Pular linha
		System.out.println("");

        for (int i = 0; i < 3; i++) {

            System.out.println("Qual o nome do Aluno?");
            nomesAlunos[i] = leitor.nextLine();

			// Pular linha
			System.out.println("");

            System.out.println("Qual sua primeira nota?");
            notasUm[i] = leitor.nextFloat();
			leitor.nextLine();

			// Pular linha
			System.out.println("");

            System.out.println("Qual sua segunda nota?");
            notasDois[i] = leitor.nextFloat();
			leitor.nextLine();

			// Pular linha
			System.out.println("");

            System.out.println("Qual sua terceira nota?");
            notasTres[i] = leitor.nextFloat();
			leitor.nextLine();

			mediasAlunos[i] = (notasUm[i] + notasDois[i] + notasTres[i]) / 3;

            System.out.println();
        }

        System.out.println("Medias dos alunos:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno: " + nomesAlunos[i]);
            System.out.println("Notas: " + notasUm[i] + ", " + notasDois[i] + ", " + notasTres[i]);
            System.out.printf("Média: %.2f", mediasAlunos[i]);
            System.out.println("\n");
            if(mediasAlunos[i] >= 70){
                System.out.println("Aluno está Aprovado");
            }else{
                System.out.println("Aluno está Reprovado");
            }
			System.out.println("\n");
        }

        leitor.close();
    }
}