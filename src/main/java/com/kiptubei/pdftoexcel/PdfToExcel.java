/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kiptubei.pdftoexcel;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.aspose.pdf.*;


/**
 *
 * @author mkiptubei
 */
public class PdfToExcel {
    
        private PdfToExcel() {

    }
        
   // The path to the documents directory.
    private static Path _dataDir = Paths.get("/home/mkiptubei/pdf-examples");

    public static void main(String[] args) {
        
        ConvertPDFtoExcelSimple();
    }
    
      public static void ConvertPDFtoExcelSimple() {
        // Load PDF document
        Document pdfDocument = new Document(_dataDir + "/input.pdf");

        // Instantiate ExcelSave Option object
        ExcelSaveOptions excelsave = new ExcelSaveOptions();

        // Save the output in XLS format
        pdfDocument.save(_dataDir+ "/PDFToXLS_out.xls", excelsave);
    }
}
