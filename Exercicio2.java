import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeUsuario, senha;

        do {
            System.out.print("Digite o nome de usuário: ");
            nomeUsuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (senha.equals(nomeUsuario)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário. Tente novamente.");
            }
        } while (senha.equals(nomeUsuario));

        System.out.println("Usuário cadastrado com sucesso!");
    }
}