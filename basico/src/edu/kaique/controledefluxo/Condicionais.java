package edu.kaique.controledefluxo;

import java.util.Locale;
import java.util.Scanner;

public class Condicionais {
    //if-else, switch-case

    public static void main(String[] args) {

        // Sistema de Saque - condicional simples

        double saldo = 25.0;
        double valorSolicitado;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual valor que deseja sacar : ");
        valorSolicitado  = scanner.nextFloat();

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }

        System.out.println(saldo);

        //Nota escolar - condicional composta
        int nota;

        System.out.println("Qual valor da nota : ");
        nota  = scanner.nextInt();

        if (nota >= 7){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }

        //Nota escolar - condicional encadeada

        System.out.println("Qual valor da nota : ");
        nota  = scanner.nextInt();

        if (nota >= 7){
            System.out.println("Aprovado");
        }else if(nota >= 5 && nota < 7){
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }

        // Operadores ternario

        System.out.println("Qual valor da nota : ");
        nota  = scanner.nextInt();

        //String resultado = nota >= 7 ? "Aprovado" : "Reprovado"; - operador ternario basico
        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado"; // operador ternario complexo

        System.out.println(resultado);

        //switch-case
        switch (nota){
            case 10:{
                System.out.println("Aprovado com distinção");
                break;
            }
            case 9:{
                System.out.println("Aprovado");
                break;
            }
            default:{
                System.out.println("Reprovado");
                break;
            }
        }

    }


}
