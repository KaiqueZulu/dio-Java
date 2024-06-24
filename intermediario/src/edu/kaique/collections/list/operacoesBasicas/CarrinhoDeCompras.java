package edu.kaique.collections.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras(){
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item item: listaItens){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        listaItens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double totalCarrinho = 0;
        for (Item item : listaItens){
            totalCarrinho += item.getPreco() * (double) item.getQuantidade();
        }
        return totalCarrinho;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("celular", 1700.00, 15);
        carrinhoDeCompras.adicionarItem("notebook", 250.79, 7);
        carrinhoDeCompras.adicionarItem("battery bank", 34.99, 23);

        System.out.println("Total de produtos separados: " + carrinhoDeCompras.listaItens.size());

        System.out.println("Valor total dos produtos separados: " + String.format("%.2f", carrinhoDeCompras.calcularValorTotal()));

        carrinhoDeCompras.removerItem("celular");
        System.out.println("Total de produtos separados: " + carrinhoDeCompras.listaItens.size());

        carrinhoDeCompras.exibirItens();
    }
}


