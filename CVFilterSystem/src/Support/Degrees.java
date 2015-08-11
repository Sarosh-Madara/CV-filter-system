/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Support;

import FileReaderSupport.DegreeReader;
import java.io.File;
import javax.swing.JComboBox;

/**
 *
 * @author Sarosh Madara
 */
public class Degrees {
    public static File file;
    public static String[] lineArray = null;
    
    public static final String[] getBachelorPrograms(){
        file = new File("C:\\Users\\Sarosh Madara\\Documents\\NetBeansProjects\\CVFilterSystem\\src\\DegreesPackage\\","Bachelordegrees.txt");
        return lineArray = DegreeReader.readDegree(file);
    }

    public static final String[] getMasterPrograms(){
        file = new File("C:\\Users\\Sarosh Madara\\Documents\\NetBeansProjects\\CVFilterSystem\\src\\DegreesPackage\\","Masterdegrees.txt");
        return lineArray = DegreeReader.readDegree(file);
    }
    
    public static final String[] getDoctoralPrograms(){
        file = new File("C:\\Users\\Sarosh Madara\\Documents\\NetBeansProjects\\CVFilterSystem\\src\\DegreesPackage\\","Doctoraldegrees.txt");
        return lineArray = DegreeReader.readDegree(file);
    }
    
    public static final String[] getAssociationPrograms(){
        file = new File("C:\\Users\\Sarosh Madara\\Documents\\NetBeansProjects\\CVFilterSystem\\src\\DegreesPackage\\","Associatedegrees.txt");
        return lineArray = DegreeReader.readDegree(file);
    }
}
