package br.com.dio.desafio.dominio;
import java.time.LocalDate;
public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.data = data;
    }

    public Mentoria() {
        this.setTitulo("");
        this.setDescricao("");
        this.data = null;
    }

    @Override
    public double calcularXP() {
        return XP_padrao + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MENTORIA" +
                " Título: " + this.getTitulo() +
                " Descrição: " + this.getTitulo() +
                " Data: " + this.data;
    }
}
