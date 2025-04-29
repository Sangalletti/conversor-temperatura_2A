
//Importando o Scanner
import java.util.Scanner;

public class Conversor_temperatura_Sangalletti_2A {

    public static void main(String[] args) {

        //Leitor
        Scanner scanner = new Scanner(System.in);

        //Loop
        boolean continuar = true;

        while (continuar) {
            System.out.println("==Conversor de temperatura");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kevin");
            System.out.println("4. Sair");
            System.out.print("Escolha a unidade de origem: ");

            int escolha = scanner.nextInt();

            if (escolha == 4) {
                continuar = false;
                continue;
            }

            if (escolha < 1 || escolha > 4) {
                System.out.println("Opcao invalida!");
                continue;
            }

            System.out.println("Digite o valor da temperatura: ");
            double graus = scanner.nextDouble();

            switch (escolha) {
                case 1:
                    Celsius celsius = new Celsius(graus);
                    System.out.println("Resultados: ");
                    System.out.println("Fahrenhrit: " + celsius.paraFahrenheit());
                    System.out.println("Kevin: " + celsius.paraKevin());
                    break;
                case 2:
                    Fahrenheit fahrenheit = new Fahrenheit(graus);
                    System.out.println("Resultados: ");
                    System.out.println("Celsius: " + fahrenheit.paraCelsius());
                    System.out.println("Kevin: " + fahrenheit.paraKevin());
                    break;
                case 3:
                    Kevin kevin = new Kevin(graus);
                    System.out.println("Resultados: ");
                    System.out.println("Celsius: " + kevin.paraCelsius());
                    System.out.println("Fahrenhrit: " + kevin.paraFahrenheit());
                    break;
            }
        }
        System.out.println("Programa encerrado");

        //Fechar o Scanner
        scanner.close();
    }
}