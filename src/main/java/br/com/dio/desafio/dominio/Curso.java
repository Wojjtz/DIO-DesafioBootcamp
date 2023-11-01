package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public Curso() {
        this.setTitulo("");
        this.setDescricao("");
        this.cargaHoraria = 0;
    }

    @Override
    public double calcularXP() {
        return XP_padrao * (cargaHoraria/2);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "CURSO" +
                "\nTítulo: " + this.getTitulo() +
                "\nDescrição: " + this.getDescricao() +
                "\nCarga Horária: " + this.cargaHoraria;
    }
}
