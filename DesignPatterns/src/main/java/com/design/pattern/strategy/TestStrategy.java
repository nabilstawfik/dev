/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.strategy;

import java.util.ArrayList;

/**
 *
 * @author nabil
 */
public class TestStrategy {

    public static void main(String[] args) {
        CompressionContext ctx = new CompressionContext();
        //we could assume context is already set by preferences
        ctx.setCompressionStrategy(new ZipCompressionStrategy());
        //get a list of files...
        ctx.createArchive(new ArrayList());
    }
}
