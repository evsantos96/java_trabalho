package trabalho;

import java.util.Scanner;

public class terceira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int numero1, numero2, soma;
			Scanner in = new Scanner(System.in);
			System.out.print("Digite o Primeiro Numero \n");
			numero1 = in.nextInt();
			System.out.print("Digite o Segundo Numero \n");
			numero2 = in.nextInt();
			soma = numero1 + numero2;
			System.out.print("O Resultado é \n" + soma);
			
	}

}
