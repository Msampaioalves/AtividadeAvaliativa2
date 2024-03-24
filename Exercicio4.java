import java.util.Scanner;

public class Exercicio4 {    
    public static void main(String[] args) {
        int populacaoA = 80000;
        double taxaCrescimentoA = 0.03;
        int populacaoB = 200000;
        double taxaCrescimentoB = 0.015;
        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }

        System.out.println("Número de anos necessários para que a população de A ultrapasse ou iguale a população de B: " + anos);
    }
}