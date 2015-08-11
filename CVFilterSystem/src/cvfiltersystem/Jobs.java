/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvfiltersystem;

import java.util.ArrayList;
import java.util.List;
import model.Job;

/**
 *
 * @author Sarosh Madara
 */
public class Jobs {
    
    private static Jobs instance ;
    
    private List<Job> myJobs;
    
    private Jobs() {
        myJobs = new ArrayList<Job>();  // jobs will be  fetched from the server and loaded here.
    }
    
    public static Jobs getInstance() {
       if(instance == null){
           instance = new Jobs();
       }
       return instance; 
    }
    
    
    
    
}
