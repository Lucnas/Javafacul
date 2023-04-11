import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite a temperatura: ");
            double temperatura = scanner.nextDouble();
            System.out.println("Escolha a escala: 1 - Celsius, 2 - Fahrenheit, 3 - Kelvin");
            int escala = scanner.nextInt();
            double celsius = 0;
            double fahrenheit = 0;
            double kelvin = 0;
            switch (escala) {
                case 1:
                    celsius = temperatura;
                    fahrenheit = celsiusParaFahrenheit(celsius);
                    kelvin = celsiusParaKelvin(celsius);
                    break;
                case 2:
                    fahrenheit = temperatura;
                    celsius = fahrenheitParaCelsius(fahrenheit);
                    kelvin = fahrenheitParaKelvin(fahrenheit);
                    break;
                case 3:
                    kelvin = temperatura;
                    celsius = kelvinParaCelsius(kelvin);
                    fahrenheit = kelvinParaFahrenheit(kelvin);
                    break;
                default:
                    System.out.println("Escala inválida.");
            }
            System.out.println("Temperatura em Celsius: " + celsius);
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
            System.out.println("Temperatura em Kelvin: " + kelvin);
            System.out.println("Deseja continuar? (s/n)");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * (9.0 / 5.0) + 32.0;
    }

    public static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * (5.0 / 9.0);
    }

    public static double fahrenheitParaKelvin(double fahrenheit) {
        return (fahrenheit - 32.0) * (5.0 / 9.0) + 273.15;
    }

    public static double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinParaFahrenheit(double kelvin) {
        return (kelvin - 273.15) * (9.0 / 5.0) + 32.0;
    }
}
