package model;

import java.time.LocalDate;

public class Planta {

    private String nome;
    private String tipo;
    private int tempoCrescimentoDias;
    private LocalDate dataPlantio;

    public Planta(String nome, String tipo, int tempoCrescimentoDias) {
        this.nome = nome;
        this.tipo = tipo;
        this.tempoCrescimentoDias = tempoCrescimentoDias;
        this.dataPlantio = LocalDate.now();
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTempoCrescimentoDias() {
        return tempoCrescimentoDias;
    }

    public LocalDate getDataPlantio() {
        return dataPlantio;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tempoCrescimentoDias=" + tempoCrescimentoDias +
                ", dataPlantio=" + dataPlantio +
                '}';
    }
}