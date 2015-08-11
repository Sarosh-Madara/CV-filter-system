/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Sarosh Madara
 */
public class EducationListModel implements ListModel{
    private static ArrayList<String> values = new ArrayList<String>();
    private static EducationListModel instance = null;

    private EducationListModel() {
        
    }
    
    public static EducationListModel getInstance(){
        if(instance == null){
            return new EducationListModel();
        }
        return instance;
    }
    
    @Override
    public int getSize() {
        return values.size();
    }

    @Override
    public Object getElementAt(int index) {
        return values.get(index);
    }

    public boolean remove(Object o) {
        return values.remove((String)o);
    }
    
    @Override
    public void addListDataListener(ListDataListener l) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }

    public boolean add(String e) {
        return values.add(e);
    }

    public void add(int index, String element) {
        values.add(index, element);
    }
    
    @Override
    public String toString(){
        StringBuilder buffer = new StringBuilder();
        buffer.append("{ ");
        for(int i=0; i<values.size(); i++){
            buffer.append(" "+values.get(i) + " ,");
        }
        buffer.append(" }");
        return buffer.toString();
    }
}
