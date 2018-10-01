package poo;

public class Contador{

    private int valorAtual;

//    public Contador(){
//        this.valorAtual = 0;
//    }

    public int getValorAtual(){

        return valorAtual;
    }

    public void setValorAtual(int valorAtual){

        this.valorAtual = valorAtual;
    }

//    public Contador(int valorAtual) {
//        this.valorAtual = valorAtual;
//    }

    public int incrementaValor(){

        this.valorAtual = this.valorAtual + 1;
    }
}
