package atividades2;

public class Fibonacci {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;

        for (int i = 0; i < 8; i++) {
            System.out.println(x);
            int proximo = x + y;
            x = y;
            y = proximo;
        }
    }
}
