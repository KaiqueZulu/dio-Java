package edu.kaique.pratica;

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        for (double limiteDisponivel = limiteDiario; limiteDisponivel <= limiteDiario && limiteDisponivel > 0;) {
            double valorSaque =scanner.nextDouble();
            if(valorSaque == 0){
                System.out.println("Transacoes encerradas.");
                break;
            }else if(valorSaque <= limiteDisponivel){
                limiteDisponivel -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDisponivel);
            }else{
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }
        scanner.close();
    }
}


