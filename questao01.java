import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        while (operacao != 8) {
            System.out.println("Escolha a operação: 1 - Adição, 2 - Subtração, 3 - Multiplicação, 4 - Divisão, 5 - Potenciação, 6 - Raiz Quadrada, 7 - Raiz Cúbica, 8 - Sair");
            operacao = scanner.nextInt();
            if (operacao == 8) {
                break;
            }
            double num1 = 0;
            double num2 = 0;
            if (operacao >= 1 && operacao <= 5) {
                System.out.println("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = scanner.nextDouble();
            } else if (operacao >= 6 && operacao <= 7) {
                System.out.println("Digite o número: ");
                num1 = scanner.nextDouble();
            } else {
                System.out.println("Operação inválida.");
                continue;
            }
            double resultado = 0;
            switch (operacao) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    resultado = num1 / num2;
                    break;
                case 5:
                    resultado = Math.pow(num1, num2);
                    break;
                case 6:
                    resultado = Math.sqrt(num1);
                    break;
                case 7:
                    resultado = Math.cbrt(num1);
                    break;
                default:
                    System.out.println("Operação inválida.");
            }
            System.out.println("Resultado: " + resultado);
        }
    }
}
