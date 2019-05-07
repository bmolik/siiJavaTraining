package pl.sii.javatraining;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int x = scanner.nextInt();
        if(x<=0) throw new IllegalArgumentException("Liczba musi być większa od zera");
        System.out.println("Podaj potęgę:");
        int n = scanner.nextInt();
        if(n<=0) throw new IllegalArgumentException("Liczba musi być większa od zera");
        System.out.println("Twój wynik to: " + power(x, n));

    }

    private static int power(int base, int power){
            int result = 1;
            for (; power != 0; power--) {
                result *= base;
            }
            return result;
        }
}
