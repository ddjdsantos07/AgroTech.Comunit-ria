package view;

import model.*;

import java.util.ArrayList;

public class Main 

public static void main(String[] args) {

    private ArrayList<Planta> plantas = new ArrayList<>();
    private ArrayList<Voluntario> voluntarios = new ArrayList<>();
    private ArrayList<Clima> climas = new ArrayList<>();
    private ArrayList<Colheita> colheitas = new ArrayList<>();

    public void cadastrarPlanta(Planta planta) {
        plantas.add(planta);
    }

    public void cadastrarVoluntario(Voluntario voluntario) {
        voluntarios.add(voluntario);
    }

    public void registrarClima(Clima clima) {
        climas.add(clima);
    }

    public void registrarColheita(Colheita colheita) {
        colheitas.add(colheita);
    }

    public ArrayList<Planta> listarPlantas() {
        return plantas;
    }
}