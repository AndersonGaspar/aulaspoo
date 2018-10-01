package poo;

public class Principal {

    public static void main(String args[]){
        Contador c = new Contador();

        System.out.println(c.getValorAtual());
        c.incrementaValor();
        System.out.println(c.getValorAtual());
        c.setValorAtual(3);
        System.out.println(c.getValorAtual());
    }
}
