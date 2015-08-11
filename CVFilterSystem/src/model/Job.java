/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Logger;


/**
 *
 * @author Sarosh Madara
 */
public class Job {
    private String title;
    private int experience;
    private int positions;
    private String shift;
    private double salary;
    private String publishDate;
    private String finalApplyDate;
    
    
    public Job(){}

    public Job(String title, int experience, int positions, String shift, double salary, String publishDate, String finalDate) {
        this.title = title;
        this.experience = experience;
        this.positions = positions;
        this.shift = shift;
        this.salary = salary;
        this.publishDate = publishDate;
        this.finalApplyDate = finalDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getPositions() {
        return positions;
    }

    public void setPositions(int positions) {
        this.positions = positions;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getFinalDate() {
        return finalApplyDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalApplyDate = finalDate;
    }  
    
    
    @Override
    public String toString(){
        return "";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); 
    }
    
    
    
    
}
