package Q2;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        // Exibe o resultado
        if (count > 0) {
            System.out.println("A letra 'a' ou 'A' ocorre " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' ou 'A' não ocorre na string.");
        }

        scanner.close();
    }
}
