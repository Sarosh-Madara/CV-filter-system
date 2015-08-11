/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReaderSupport;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTextArea;

/**
 *
 * @author Sarosh Madara
 */
public class TextFileReader {
    public void readTextFile(JTextArea textArea,File filename){
        try {
            textArea.read( new FileReader( filename.getAbsolutePath() ), null );
        } catch (IOException ex) {
            System.out.println("problem accessing file"+filename.getAbsolutePath());
        }
    }
}
