import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String concatenada = nome + " é um futuro programador Java";
        System.out.println(concatenada);
    }

}
