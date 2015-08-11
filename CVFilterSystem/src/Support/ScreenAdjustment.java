/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Support;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Sarosh Madara
 */
public class ScreenAdjustment {
    
    public static Dimension getScreenSize(){
       Toolkit toolkit =  Toolkit.getDefaultToolkit ();
       Dimension dim = toolkit.getScreenSize();
       dim.height -= 50;
       return dim;
    }
    
    
}
