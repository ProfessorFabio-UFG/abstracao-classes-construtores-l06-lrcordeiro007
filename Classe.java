package abstracao;

import java.text.DecimalFormat;

public class Classe {
    

    public static void main(String[] args){
        int codigoProduto1 = 001;
        String nomeProduto1 = "Jogo Batalha Naval";
        int quantProduto1 = 10;
        String tipoProduto1 = "jogo";
        double preçoProduto1 = 100.00;
        Produto p1 = new Produto(codigoProduto1, nomeProduto1, quantProduto1, tipoProduto1,preçoProduto1);

        int codigoProduto2 = 002;
        String nomeProduto2 = "Jogo Master";
        int quantProduto2 = 20;
        String tipoProduto2 = "jogo";
        double preçoProduto2 = 150.00;
        Produto p2 = new Produto(codigoProduto2);

        int codigoProduto3 = 003;
        String nomeProduto3 = "Jogo Quebra-Cabeça";
        int quantProduto3 = 30;
        String tipoProduto3 = "jogo";
        double preçoProduto3 = 50.00;
        Produto p3 = new Produto(codigoProduto3,nomeProduto3);
        
        p1.vender(9);
        p2.inserir("Jogo Quebra-Cabeça", 20, "jogo", 150);
        p2.vender (20);
        p3.inserir("Jogo Quebra-Cabeça", 30, "jogo", 50);
        p2.igual(p3);
        p2.comprar(1);
        p3.comprar(20,100);
        System.out.println(p2);
        
    }
}
 