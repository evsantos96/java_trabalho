package trabalho;

import java.util.Locale;
import java.util.Scanner;

public class sexta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		float raio,area, diametro;
		float pi = 3.1415926535898f;
		
		System.out.print("Digite o raio do circulo: \n");

		raio = in.nextFloat();
		diametro = raio * 2;
		area = pi * diametro;
		
		System.out.print("A Area é : " + area);
	}

}
