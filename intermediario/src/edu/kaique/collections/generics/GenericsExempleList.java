package edu.kaique.collections.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {
        //Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); // Permite qualquer tipo de objeto

       //Exemplo com Generics
        List<String> listaComGenerics = new ArrayList<>();
        listaComGenerics.add("Elemento 1");
        listaComGenerics.add("Elemento 2");

        //Iterando sobre a lista com Generics
        for (String elemento : listaComGenerics) {
            System.out.println(elemento);
        }

        //Iterando sobre a lista sem Generics
        for (Object elemento : listaSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }


    }
}
