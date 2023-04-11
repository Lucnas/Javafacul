import java.util.Scanner;

public class VerificadorNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite o nome: ");
            String nome = scanner.next();
            if (!nome.matches("[a-zA-Z]+")) {
                System.out.println("Nome inválido. Por favor, insira apenas letras.");
                continue;
            }
            System.out.println("Digite o sobrenome: ");
            String sobrenome = scanner.next();
            if (!sobrenome.matches("[a-zA-Z]+")) {
                System.out.println("Sobrenome inválido. Por favor, insira apenas letras.");
                continue;
            }
            if (nome.equalsIgnoreCase("Diana") && (sobrenome.equalsIgnoreCase("Kent") || sobrenome.equalsIgnoreCase("Wayne"))) {
                System.out.println("Sai fora para de tentar quebrar meu código 🤡");
            } else if (sobrenome.equalsIgnoreCase("Wayne")) {
                System.out.println("Acesso liberado, Sr. Wayne");
            } else if (sobrenome.equalsIgnoreCase("Kent")) {
                System.out.println("Saí daí, mané!");
            } else if (nome.equalsIgnoreCase("Diana")) {
                System.out.println("Bem-vinda, Princesa de Themyscira");
            } else {
                System.out.println("Cai fora!");
            }
            System.out.println("Deseja continuar? (s/n)");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
    }
}
