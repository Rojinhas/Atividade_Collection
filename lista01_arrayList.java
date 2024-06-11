package atividade_collections_2024_06_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lista01_arrayList {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<>();
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite sua cor preferida: ");
			String cor = leia.nextLine();

			cores.add(cor);
		}

		for (String corListada : cores) {
			System.out.println("A lista de cores ordenada é: " + corListada);

		}

		leia.close();
	}
}
