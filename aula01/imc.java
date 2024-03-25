import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome: ");
    String nome = scanner.nextLine();

    System.out.println("Digite o seu peso em quilogramas: ");
    float peso = scanner.nextFloat();

    System.out.println("Digite a sua altura em metros: ");
    float altura = scanner.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("Seu IMC e: " + imc);

        if (imc < 16.9){
        System.out.println("muito abaixo do peso");
    }
    else if (imc < 18.4){
        System.out.println("abaixo do peso");
}
    else if (imc < 24.9){
        System.out.println("peso normal");
    }
    else if (imc < 30){
        System.out.println("acima do peso");
    }
    else if (imc < 35){
        System.out.println("obesidade grau I");
        }
    else if (imc < 40){
        System.out.println("obesidade grau II");
        }
    else if (imc > 40){
        System.out.println("obesidade grau III");
            }
    }
}
