import java.util.Scanner;

public class ComparadorStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        if (palavra1.equals(palavra2)) {
            System.out.println("As palavras " + palavra1 + " e " + palavra2 + " sao iguais");
        } else {
            System.out.println("As palavras " + palavra1 + " e " + palavra2 + " sao diferentes");
        }

        scanner.close();
    }
}
