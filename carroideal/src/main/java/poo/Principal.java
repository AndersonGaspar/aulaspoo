package poo;

public class Principal {

    public static void main(String[] args) {
        CarroIdeal c1 = new CarroIdeal(0);

        c1.setVelocidade(100);
        System.out.println(c1.getVelocidade());
        c1.acelerar(50);
        System.out.println(c1.getVelocidade());
        c1.acelerar(100);
        System.out.println(c1.getVelocidade());
    }
}
