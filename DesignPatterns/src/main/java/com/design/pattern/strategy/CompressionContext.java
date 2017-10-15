/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.strategy;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author nabil
 */
public class CompressionContext {

    private CompressionStrategy strategy;
    //this can be set at runtime by the application preferences

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    //use the strategy
    public void createArchive(ArrayList<File> files) {
        strategy.compressFiles(files);
    }
}
