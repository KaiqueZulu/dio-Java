package edu.kaique.terminal;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String name = scanner.next();

        System.out.println("Seu nome e: " + name);
    }
}
