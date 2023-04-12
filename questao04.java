import java.util.Scanner;

public class Finalizando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Digite um número: ");
                double num = scanner.nextDouble();
                if (num % 2 == 0) {
                    System.out.println("A raiz cúbica de " + num + " é " + Math.cbrt(num));
                } else {
                    System.out.println("A raiz quadrada de " + num + " é " + Math.sqrt(num));
                }
            } catch (Exception e) {
                System.out.println("Por favor, digite um número válido.");
                scanner.nextLine();
            }
            String continuar;
            do {
                System.out.print("Deseja fazer outro cálculo? (s/n): ");
                continuar = scanner.next();
            } while (!continuar.equalsIgnoreCase("s") && !continuar.equalsIgnoreCase("n"));
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }
        scanner.close();
    }
}
