import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("Digite as informações para os países:");
            int populacaoA = lerInteiroPositivo(scanner, "População do país A: ");
            double taxaCrescimentoA = lerTaxa(scanner, "Taxa de crescimento anual do país A (%): ");
            int populacaoB = lerInteiroPositivo(scanner, "População do país B: ");
            double taxaCrescimentoB = lerTaxa(scanner, "Taxa de crescimento anual do país B (%): ");
            int anos = calcularAnos(populacaoA, taxaCrescimentoA, populacaoB, taxaCrescimentoB);

            System.out.println("Número de anos necessários para que a população de A ultrapasse ou iguale a população de B: " + anos);

            System.out.print("Deseja calcular novamente? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's');
    }

    private static int lerInteiroPositivo(Scanner scanner, String mensagem) {
        int valor;
        do {
            System.out.print(mensagem);
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um valor inteiro positivo.");
                System.out.print(mensagem);
                scanner.next();
            }
            valor = scanner.nextInt();
            if (valor <= 0) {
                System.out.println("Por favor, insira um valor inteiro positivo.");
            }
        } while (valor <= 0);
        return valor;
    }

    private static double lerTaxa(Scanner scanner, String mensagem) {
        double taxa;
        do {
            System.out.print(mensagem);
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, insira um valor numérico válido.");
                System.out.print(mensagem);
                scanner.next();
            }
            taxa = scanner.nextDouble();
            if (taxa <= 0) {
                System.out.println("A taxa deve ser maior que zero.");
            }
        } while (taxa <= 0);
        return taxa / 100; // Convertendo para a forma decimal
    }

    private static int calcularAnos(int populacaoA, double taxaCrescimentoA, int populacaoB, double taxaCrescimentoB) {
        int anos = 0;
        while (populacaoA <= populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }
        return anos;
    }
}