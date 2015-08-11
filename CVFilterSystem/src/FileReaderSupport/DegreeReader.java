/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReaderSupport;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.ComboBox;
import javax.swing.JComboBox;

/**
 *
 * @author Sarosh Madara
 */
public class DegreeReader {
    
    
    
    public static final String[] readDegree(File filePath){
    List<String> strings = new ArrayList<String>();
     String[] lineArray = null;
        try {
            BufferedReader input = new BufferedReader(new FileReader(filePath));
            
            String line = null;
            while (( line = input.readLine()) != null){
            strings.add(line);
            }
            
            input.close();
        }

        catch (FileNotFoundException e) {
            System.err.println("Error, file " + filePath + " didn't exist.");
        }
        catch(IOException e){
            
        }

        return lineArray = strings.toArray(new String[]{});
    }
        
        
}
