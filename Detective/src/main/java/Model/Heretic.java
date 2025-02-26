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
    private ArrayList <String> crimes;
    private String lastPlace;
    private Integer id;
    private String dangerlevel;

    public Heretic(String name, ArrayList<String> crimes, String lastPlace, Integer id, String dangerlevel) {
        this.name = name;
        this.crimes = crimes;
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

    public ArrayList<String> getCrimes() {
        return crimes;
    }

    public void setCrimes(ArrayList<String> crimes) {
        this.crimes = crimes;
    }

    public String getLastPlace() {
        return lastPlace;
    }

    public void setLastPlace(String lastPlace) {
        this.lastPlace = lastPlace;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDangerlevel() {
        return dangerlevel;
    }

    public void setDangerlevel(String dangerlevel) {
        this.dangerlevel = dangerlevel;
    } 
    
}
