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
public class RarCompressionStrategy implements CompressionStrategy {

    @Override
    public void compressFiles(ArrayList<File> files) {
        //using RAR approach
    }
}
