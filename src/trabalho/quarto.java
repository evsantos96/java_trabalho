package trabalho;
import java.util.Scanner;
public class quarto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1, numero2,numero3,numero4, media;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a Primeira Nota \n");
		numero1 = in.nextInt();
		System.out.print("Digite a Segunda Nota \n");
		numero2 = in.nextInt();
		System.out.print("Digite a Terceira Nota \n");
		numero3 = in.nextInt();
		System.out.print("Digite a Quarta Nota \n");
		numero4 = in.nextInt();
		media = (numero1 + numero2 + numero3 + numero4)/4 ;
		System.out.print("O Resultado é \n" + media);
		
	}

}
