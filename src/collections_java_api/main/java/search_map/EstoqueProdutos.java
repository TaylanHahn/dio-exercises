package collections_java_api.main.java.search_map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        estoqueProdutos.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto(){
        System.out.println(estoqueProdutos);
    }

    public double calcularValorTotalEstoque(){
        double totalEstoque = 0d;
        if(!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                totalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return totalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto prodCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                if(p.getPreco() > maiorPreco){
                    prodCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return prodCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto prodBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if(!estoqueProdutos.isEmpty()){
            for(Produto p : estoqueProdutos.values()){
                if(p.getPreco() < menorPreco){
                    prodBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return prodBarato;
    }




}
