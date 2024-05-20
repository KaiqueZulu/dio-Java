package edu.kaique.controledefluxo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class excecoes {
    //try-catch-finally, throw
    public static void main(String[] args) {
        //sobre();

        try {
            System.out.println(formatarCep("12348"));
        } catch (CepInvalidoException e) {
            System.out.println("Cep invalido");
        }

    }

    public static void sobre(){
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();

            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");
        } catch (InputMismatchException exception) {
            System.err.println("O campo idade e altura devem ser numéricos");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        return cep;
    }
}
