import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("O número %d é par!", numero);
        } else {
            System.out.printf("O número %d é ímpar!", numero);
        }
    }

}
