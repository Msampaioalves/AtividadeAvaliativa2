pimport java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialize a variável que irá armazenar o maior número com o menor valor possível
        int maiorNumero = Integer.MIN_VALUE;

        System.out.println("Digite 5 números:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            // Atualize o maior número, se o número atual for maior que o atualmente armazenado
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("O maior número digitado é: " + maiorNumero);
    }
}