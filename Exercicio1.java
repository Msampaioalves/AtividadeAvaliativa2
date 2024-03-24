import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Informe uma nota entre zero e dez: ");
            nota = scanner.nextDouble();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido! A nota deve estar entre zero e dez.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("A nota informada é: " + nota);
    }
}

