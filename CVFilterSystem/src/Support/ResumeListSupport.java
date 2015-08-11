/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Support;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author Sarosh Madara
 */
public class ResumeListSupport {
    
    public static ListModel getModel(File file){
        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement(file.getName());
        return listModel;
    }

    public static ListModel getModel(File[] files){
        DefaultListModel listModel = new DefaultListModel();
        for(int i=0; i<files.length; i++){
                listModel.addElement(files[i].getName());
        }
        return listModel;
    }
}
