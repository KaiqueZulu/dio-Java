package edu.kaique.collections.generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsExempleSet {
    public static void main(String[] args) {
        //Exemplo sem Generics
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10); // Permite qualquer tipo de objeto

       //Exemplo com Generics
        Set<String> conjuntoComGenerics = new HashSet<>();
        conjuntoComGenerics.add("Elemento 1");
        conjuntoComGenerics.add("Elemento 2");

        //Iterando sobre a lista com Generics
        for (String elemento : conjuntoComGenerics) {
            System.out.println(elemento);
        }

        //Iterando sobre a lista sem Generics
        for (Object elemento : conjuntoSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }

    }
}
