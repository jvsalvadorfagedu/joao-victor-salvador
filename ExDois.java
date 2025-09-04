import java.util.Scanner;

public class ExDois {
	public static void main(String[] args){

		int numberOne = 0;
		int numberTwo = 0;
		int operation = 0;
		float result = 0;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Qual o primeiro numero? ");
		numberOne = leitor.nextInt();
		leitor.nextLine();

		// pulando linha
		System.out.println("");

		System.out.println("Qual o segundo numero? ");
		numberTwo = leitor.nextInt();
		leitor.nextLine();

		// pulando linha
		System.out.println("");

		System.out.println("Qual a operacao que voce quer fazer: ");
		System.out.println("1 - soma.");
		System.out.println("2 - subtracao.");
		System.out.println("3 - divisao.");
		System.out.println("4 - multiplicacao.");
		operation = leitor.nextInt();
		leitor.nextLine();

		// pulando linha
		System.out.println("");

		if(operation == 1){
			result = numberOne + numberTwo;
			System.out.println("O resultado da conta e: " + result + ".");
		}else if(operation == 2){
			result = numberOne - numberTwo;
			System.out.println("O resultado da conta e: " + result + ".");
		}else if(operation == 3){
			result = numberOne / numberTwo;
			System.out.println("O resultado da conta e: " + result + ".");
		}else if(operation == 4){
			result = numberOne * numberTwo;
			System.out.println("O resultado da conta e: " + result + " .");
		}else{
			System.out.println("Essa operacao nao existe!");
		}

		leitor.close();
	}
}
