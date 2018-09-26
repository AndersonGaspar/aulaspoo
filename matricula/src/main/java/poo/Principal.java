package poo;

import java.util.Scanner;
import java.util.Random;

public class Principal{

    public boolean verificadorMatricula(long m){
        int x;
        long matricula = m;
        long num2 = 1000000000;
        long DV = 0;

        long[] vet = new long[10];

        x = 0;
        while(x!=10){
            vet[x] = matricula/num2;
            //System.out.println(vet[x]);
            matricula = matricula % num2;
            //System.out.println(matricula);
            num2 = num2/10;
            //System.out.println(num2);
            if(x<9){
                DV = DV + (vet[x] * (10-x));
            }
            x = x + 1;
        }
        DV = DV*10;
        //System.out.println(DV);
        DV = DV % 11;
        //System.out.println(DV);
        //System.out.println(vet[9]);
        if(vet[9] == DV){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){


        Principal verificador = new Principal();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com sua matricula: ");
        long matricula = teclado.nextLong();

        boolean resultado = verificador.verificadorMatricula(matricula);
        System.out.println(resultado);
        System.out.println("Sua matricula é: "+ matricula);


    }

}