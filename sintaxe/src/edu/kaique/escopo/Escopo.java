package edu.kaique.escopo;

public class Escopo {
    public static void main(String[] args) {
        class cliente{
            //Variavel da classe cliente, está disponivel por todo escopo da classe
            String nome;

            //                     Variavel local do metodo "novoNome"
            public void novoNome(String nome){
                this.nome = nome;
            }
        }

        //Variavel de bloco
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
