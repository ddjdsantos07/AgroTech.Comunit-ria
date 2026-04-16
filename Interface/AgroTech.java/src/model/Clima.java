package model;

import java.time.LocalDate;

public class Clima {

    private String condicao;
    private double temperatura;
    private double umidade;
    private LocalDate dataRegistro;

    public Clima(String condicao, double temperatura, double umidade) {
        this.condicao = condicao;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.dataRegistro = LocalDate.now();
    }

    public boolean climaFavoravel() {
        return !condicao.equalsIgnoreCase("Chuvoso");
    }

    @Override
    public String toString() {
        return "Clima{" +
                "condicao='" + condicao + '\'' +
                ", temperatura=" + temperatura +
                ", umidade=" + umidade +
                ", dataRegistro=" + dataRegistro +
                '}';
    }
}