package model;

public class Voluntario extends Pessoa {

    private int horasDisponiveis;
    private String especialidade;
    private boolean ativo;

    public Voluntario(String nome, String email, String telefone,
                      int horasDisponiveis, String especialidade) {
        super(nome, email, telefone);
        this.horasDisponiveis = horasDisponiveis;
        this.especialidade = especialidade;
        this.ativo = true;
    }

    public int getHorasDisponiveis() {
        return horasDisponiveis;
    }

    public void setHorasDisponiveis(int horasDisponiveis) {
        this.horasDisponiveis = horasDisponiveis;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Voluntario{" +
                "nome='" + getNome() + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", horasDisponiveis=" + horasDisponiveis +
                '}';
    }
}