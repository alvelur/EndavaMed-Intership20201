package com.patterns.structural.p1.case1;

import com.patterns.structural.p1.dependency.*;




public class Main {

    public static double conversor (double distancia){
    
        return distancia*1000;
        
  }

    public static void main(final String[] arg){
           
        Car carro = new Car();
        conversor(carro.getSpeed());

        System.out.println(conversor(carro.getSpeed()));




    }
}
