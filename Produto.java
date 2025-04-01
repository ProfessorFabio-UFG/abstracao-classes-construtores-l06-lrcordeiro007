package abstracao;


public class Produto {
    int codigo;
    String nome;
    int quant;
    double preço;
    String tipo;



    Produto (int codigo){
        this.codigo = codigo;
    }

    Produto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome; 
    }

    Produto(int codigo, String nome, int quant){
        this.codigo = codigo;
        this.nome = nome ;
        this. quant = quant;
    }

    Produto(int codigo, String nome, int quant, String tipo, double preço){
        this.codigo = codigo;
        this.nome = nome ;
        this.quant = quant;
        this.tipo = tipo;
        this.preço = preço; 
    }

    void vender(int Quant){
        double valor;
        if(Quant > quant){
            System.out.println("Não possui quantidade suficiente no estoque");
        }
        else {
            valor = Quant * preço;
            quant = quant - Quant;
            System.out.println("O valor final da compra ficou: "+valor);
        }
    }

    void comprar( int Quant, double newvalor){
        quant += Quant;
        preço = newvalor;
    }

    void comprar (int Quant){
        quant += Quant;
    }

    public String toString(){
        return "Codigo: "+ codigo +"\n"+
        "Nome: "+ nome +"\n"+
        "Tipo: "+ tipo +"\n"+
        "Preço: "+ preço +"\n"+
        "Quantidade em estoque: "+quant+"\n";
    }

    void inserir(String newnome, int Quant, String newtype, double newpreço){
        nome = newnome;
        quant = Quant;
        tipo= newtype;
        preço = newpreço;
    }

    void igual(Produto p){
        if(nome.equals(p.nome)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}


