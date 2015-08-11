/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Support;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Sarosh Madara
 */
public class ResumesFilter extends FileFilter{

    @Override
    public boolean accept(File file) {
        return file.isDirectory() || file.getAbsolutePath().endsWith(".txt") || file.getAbsolutePath().endsWith(".doc") ||  file.getAbsolutePath().endsWith(".docx"); 
    }

    @Override
    public String getDescription() {
        return "Text documents (*.txt)\nWord documents (*.doc)\nWord documents (*.docx)";
    }
    
}
