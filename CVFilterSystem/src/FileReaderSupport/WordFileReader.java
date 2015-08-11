/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReaderSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

/**
 *
 * @author Sarosh Madara
 */
public class WordFileReader {
    private File file;
    private String resumeText = "";

    public WordFileReader(File file) {
        
    }

    public WordFileReader() {
        
    }

    public WordFileReader(String filePath) {
        file = new File(filePath);
    }
    
    public void readWordFile(File file,JTextArea textArea){
        WordExtractor extractor = null;
        try {
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            String[] fileData = extractor.getParagraphText();
            for (int i = 0; i < fileData.length; i++)
            {
                if (fileData[i] != null)
                    resumeText += fileData[i];
            }
            textArea.setText(resumeText);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public void readDocxWordFile(File file,JTextArea textArea){
        XWPFWordExtractor extractor = null;
//        Document document = new Document
        try {
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            XWPFDocument hdoc = new XWPFDocument(OPCPackage.open(fis));
            extractor = new XWPFWordExtractor(hdoc);
//             String[] fileData = extractor.get
//            for (int i = 0; i < fileData.length; i++)
//            {
//                if (fileData[i] != null)
//                    resumeText += fileData[i];
//            }
            textArea.setText(resumeText);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e){
            e.printStackTrace();
        } catch (InvalidFormatException ex) {
            Logger.getLogger(WordFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    
}
