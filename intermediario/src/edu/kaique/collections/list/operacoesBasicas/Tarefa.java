package edu.kaique.collections.list.operacoesBasicas;

public record Tarefa(String descricao) {

    @Override
    public String toString() {
        return descricao();
    }
}
