/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.builder;

/**
 *
 * @author nabil
 */
public class TestBuilder {

    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder(
                "1 TB", "4 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
    }

}
