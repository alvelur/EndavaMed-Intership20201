package com.patterns.creational.p2.case1;

import com.patterns.creational.p2.Circle;
import com.patterns.creational.p2.Cube;
import com.patterns.creational.p2.Line;

public class Main {
    public static void main(String[] arg){
        
        if(arg[0].equals("linea")){
               Line linea = new Line();
               linea.draw();
        }
        if(arg[0].equals("circle")){
            Circle circulo = new Circle();
            circulo.draw();
       } 

       if(arg[0].equals("cube")){
        Cube cubo = new Cube();
        cubo.draw();
       } 
       


        System.out.println(arg[0]);
    }
}
