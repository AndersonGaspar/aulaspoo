package poo;

public class Triangulo {

    public String tipoTriangulo(int a, int b, int c){

        if ((a == b) || (a == c)|| (b == c)){
            return "É um triangulo Isóceles";
        }

        if ((a != b) && (a != c) && (b != c)){
            return "É um triangulo Escaleno";
        }

        if ((a != b) && (a != c) && (b != c)){
            return "É um triangulo Equilátero";
        }

        return "não é um triangulo";
    }
}
