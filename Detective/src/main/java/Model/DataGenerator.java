/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import com.github.javafaker.*;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author vika
 */
public class DataGenerator {
    
    private ArrayList<Heretic> persons; 
    
    Faker faker = new Faker();
    
    ArrayList<String> level = new ArrayList<>(Arrays.asList("low", "midle", "hard"));
    
    public ArrayList<Heretic> infoGeneration(){
        
        ArrayList<Heretic> persons = new ArrayList<>();
        
        for (int i = 0; i <= 10; i++){
            String name = faker.name().fullName();
            String crime = faker.harryPotter().spell();
            String lastPlace = faker.address().streetAddress();
            String id = faker.idNumber().valid();
            String dangerlevel = level.get(faker.number().numberBetween(0, 2));
            System.out.println(name + crime + lastPlace + id + dangerlevel);
            persons.add(new Heretic(name, crime, lastPlace, id, dangerlevel));
        }
        return persons;
    }
    
}
