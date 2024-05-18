package edu.kaique.controledefluxo;

public class Repeticao {
    //for, while, do-while
    public static void main(String[] args) {
        //for (para)
        for(int contador = 0; contador < 10; contador++){
            System.out.println("Contador = " + contador);
        }
        //for em arrays
        String[] alunos = {"Kaique", "João", "Maria"};
        //for(int i = 0; i < alunos.length; i++)
        for (String aluno : alunos) {
            System.out.println("Aluno = " + aluno);
        }
        //while (enquanto)
        int contador = 0;
        while (contador < 10) {
            System.out.println("Contador = " + contador);
            contador++;
        }
        //do-while (faca enquanto)
        do {
            System.out.println("Contador = " + contador);
            contador++;
        }while (contador < 10);
    }
}
