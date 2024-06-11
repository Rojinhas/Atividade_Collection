package atividade_collections_2024_06_10;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class lista02_collectionsSet{
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Digite 10 valores inteiros não repetidos:");
        for (int i = 0; i < 10; i++) {
            int value = scanner.nextInt();
            set.add(value);
        }

        System.out.println("Elementos da Collection Set:");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);
        }

        scanner.close();
    }
}