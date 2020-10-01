package trabalho;

import java.util.Scanner;

public class quinta {

	public static void main(String[] args) {

		  Scanner in = new Scanner(System.in);

		  System.out.print("Metros? ");
		  float metros = in.nextFloat();

		  float centimetros = metros * 100;

		  System.out.printf("%.1f cm",centimetros);

	}
}
