/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoller;

import Model.DataGenerator;
import Model.Heretic;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vika
 */
public class Controller {
    
    DataGenerator generator = new DataGenerator();
    Heretic heretic = new Heretic();
    ArrayList<Heretic> heretics = generator.infoGeneration();
    
    public ArrayList<Heretic> addHeretic() {
//         for (Heretic i: heretics){
//             System.out.println(i.getName());
//         }
        heretics.add(generator.infoGeneration().get(generator.infoGeneration().size() - 1));
        return heretics;
    }
    
    public String showInfo(int i){
        return "Name: " + heretics.get(i).getName() + "\nCrime: " + heretics.get(i).getCrime() + "\nLastPlace: " + heretics.get(i).getLastPlace() + "\nID: " + heretics.get(i).getId() + "\nDangerlevel: " + heretics.get(i).getDangerlevel(); 
    }
    
}