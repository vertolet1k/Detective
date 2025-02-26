/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author vika
 */
public class Heretic {
    private String name;
    private String crime;
    private String lastPlace;
    private String id;
    private String dangerlevel;

    public Heretic(String name, String crime, String lastPlace, String id, String dangerlevel) {
        this.name = name;
        this.crime = crime;
        this.lastPlace = lastPlace;
        this.id = id;
        this.dangerlevel = dangerlevel;
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrimes() {
        return crime;
    }

    public void setCrimes(String crimes) {
        this.crime = crimes;
    }

    public String getLastPlace() {
        return lastPlace;
    }

    public void setLastPlace(String lastPlace) {
        this.lastPlace = lastPlace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDangerlevel() {
        return dangerlevel;
    }

    public void setDangerlevel(String dangerlevel) {
        this.dangerlevel = dangerlevel;
    } 
    
}
