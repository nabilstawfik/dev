/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.decorator;

/**
 *
 * @author nabil
 */
public class TestDecorator {

//  Decorator design pattern is helpful in providing runtime modification abilities and hence more flexible. 
//  Its easy to maintain and extend when the number of choices are more
    
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}
