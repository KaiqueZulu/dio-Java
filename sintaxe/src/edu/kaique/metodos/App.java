package edu.kaique.metodos;

public class App {
    public static void main(String[] args) {
        SmartTv smartTV = new SmartTv();
        System.out.println(smartTV.ligarDesligar());
        System.out.println("Volume: " + smartTV.aumentarVolume());
        System.out.println("Volume: " + smartTV.diminuirVolume());
        System.out.println("Canal: " + smartTV.aumentarCanal());
        System.out.println("Canal: " + smartTV.diminuirCanal());
        System.out.println("Canal: " + smartTV.mudarCanal(5));
        System.out.println(smartTV.ligarDesligar());
    }

}
