package poo;

import org.junit.Assert;
import org.junit.Test;

public class TestaTriangulo {

    @Test
    public void testarTriangulo(){

        Triangulo triangulo = new Triangulo();

        Assert.assertEquals("10x1x2 não é um triangulo", "não é um triangulo", triangulo.tipoTriangulo(10,1,2));
        Assert.assertEquals("4x3x3 É um triangulo", "É um triangulo Isóceles", triangulo.tipoTriangulo(4,3,3));
        Assert.assertEquals("1x3x2 É um triangulo", "É um triangulo Escaleno", triangulo.tipoTriangulo(1,3,2));
        Assert.assertEquals("2x2x2 É um triangulo", "É um triangulo Equilátero", triangulo.tipoTriangulo(2,2,2));

        Assert.assertEquals("1x10x2 não é um triangulo", "não é um triangulo", triangulo.tipoTriangulo(1,10,2));
        Assert.assertEquals("4x4x3 É um triangulo", "É um triangulo Isóceles", triangulo.tipoTriangulo(4,4,3));
        Assert.assertEquals("5x6x7 É um triangulo", "É um triangulo Escaleno", triangulo.tipoTriangulo(5,6,7));
        Assert.assertEquals("2x2x2 É um triangulo", "É um triangulo Equilátero", triangulo.tipoTriangulo(2,2,2));

        Assert.assertEquals("1x1x20 não é um triangulo", "não é um triangulo", triangulo.tipoTriangulo(10,1,20));
        Assert.assertEquals("2x5x2 É um triangulo", "É um triangulo Isóceles", triangulo.tipoTriangulo(2,5,2));
        Assert.assertEquals("5x3x2 É um triangulo", "É um triangulo Escaleno", triangulo.tipoTriangulo(5,3,2));


    }
}