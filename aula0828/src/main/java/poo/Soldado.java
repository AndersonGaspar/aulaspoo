package poo;

public class Soldado {

    private int posicao;
    private final String arma1 = "fuzil";
    private final String arma2 = "baioneta";
    private final String arma3 = "punho";
    private String armamento;

    private static int numSoldados = 0;

    public Soldado(){
        numSoldados++;
    }

    public void setArmamento(String arma){
       this.armamento = arma;
    }

    public int setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void atacar(){
        this.armamento = arma1;
    }

    public void atacar(String arma){
        if (!arma.equals(arma1) && !arma.equals(arma2) && !arma.equals(arma3)) {
            armamento = arma1;
        }
        if (numSoldados >= 10){
            System.out.println("O exércicito inimigo foi atacado com o armamento" + arma);
        }else {
            System.out.printf("Ainda não, esperando o exército ficar maior");
        }
    }

    public void avancar(int x){
        this.posicao = posicao+x;
    }
    public void avancar(){
        this.avancar(10);
    }
}