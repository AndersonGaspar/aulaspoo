package poo;

public class CarroIdeal {

    private float velocidade;


    public CarroIdeal(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(float velocidade) {
        if(velocidade <= 200){
            this.velocidade = velocidade;
        }else this.velocidade = 0;
    }
    public void acelerar(float velocidade){
        if((velocidade + this.velocidade) <= 200){
            this.velocidade = this.velocidade + velocidade;
        }else this.velocidade = 200;
    }
}
