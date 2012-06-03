package com.rgsinfotech.tess4jtest;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TesseractExample {

    public static void main(String[] args) {
    	
    	File imageFile = new File("C:\\eclipse_workspaces\\development\\scanhelper\\tess4jtest\\src\\main\\resources\\eurotext.tif");
        Tesseract instance = Tesseract.getInstance();  // JNA Interface Mapping
        //Tesseract1 instance = new Tesseract1(); // JNA Direct Mapping

        try {
            String result = instance.doOCR(imageFile);
        	//String result = instance.doOCR(new File("bullpoop.tif"));
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}
