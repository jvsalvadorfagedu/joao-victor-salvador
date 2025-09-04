import java.util.Scanner;

public class ExUm {
	public static void main(String[] args){
		int idade = 0;
		String nome = "";
		String cpf = "";

		Scanner leitor = new Scanner(System.in);

		System.out.print("Qual o seu nome: ");
		nome = leitor.nextLine();

		System.out.print("Qual a sua idade: ");
		idade = leitor.nextInt();
		leitor.nextLine();

		System.out.print("Qual o seu cpf (vou roubar): ");
		cpf = leitor.nextLine();

		leitor.close();

		System.out.println("O seu nome e: " + nome + ",");
		System.out.println("A sua idade e: " + idade + ",");
		System.out.println("E o seu CPF e: " + cpf + ".");
	}
}
