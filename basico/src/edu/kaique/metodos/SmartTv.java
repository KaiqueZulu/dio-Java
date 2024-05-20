package edu.kaique.metodos;

public class SmartTv {
    private Boolean ligada = false;
    private Integer canal = 1, volume = 0;

    private Boolean getLigada() {
        return ligada;
    }

    private void setLigada(Boolean ligada) {
        this.ligada = ligada;
    }

    private Integer getCanal() {
        return canal;
    }

    private void setCanal(Integer canal) {
        this.canal = canal;
    }

    private Integer getVolume() {
        return volume;
    }

    private void setVolume(Integer volume) {
        this.volume = volume;
    }

    public  String ligarDesligar() {
        this.setLigada(!this.getLigada()) ;
        return this.getLigada() ? "Ligada" : "Desligada";
    }

    public String aumentarVolume() {
        this.setVolume(this.getVolume() + 1);
        return this.getVolume().toString();
    }

    public String diminuirVolume() {
        this.setVolume(this.getVolume() - 1);
        return this.getVolume().toString();
    }

    public String aumentarCanal() {
        this.setCanal(this.getCanal() + 1);
        return this.getCanal().toString();
    }

    public String diminuirCanal() {
        this.setCanal(this.getCanal() - 1);
        return this.getCanal().toString();
    }

    public String mudarCanal(Integer canal) {
        this.setCanal(canal);
        return this.getCanal().toString();
    }


}
