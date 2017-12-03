/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.google.gson.*;
import java.io.FileWriter;
import java.io.Writer;
import java.io.*;

/**
 *
 * @author austi
 */
public class PersistentDataController {
    private static PersistentDataController thePersistentDataController;
    private PersistentDataCollection thePersistentDataCollection;
    private final String EXTERNAL_DATA_PATH = "";
    private final String DATA_FILE_NAME = "AppData.ser";
    private final String JSON_FILE_NAME = "AppData.json";
    
    private PersistentDataController () {
        readJSONDataModel();
        if(thePersistentDataCollection == null){
            thePersistentDataCollection = new PersistentDataCollection();
            writeJSONDataModel();
            readJSONDataModel();
        }
    }
    
    public static PersistentDataController getPersistentDataController() {
        if(thePersistentDataController == null){
            thePersistentDataController = new PersistentDataController();
        }
        return thePersistentDataController;
    }
    
     public PersistentDataCollection getPersistentDataCollection(){
        return thePersistentDataCollection;
    }
     
        public void writeJSONDataModel(){
        try{
            Writer writer = new FileWriter(JSON_FILE_NAME);
            Gson gson = new GsonBuilder().create();
            gson.toJson(thePersistentDataCollection, writer);
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void readJSONDataModel(){
        Gson gson = new Gson();
        try{
            BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_NAME));
            thePersistentDataCollection = gson.fromJson(br, PersistentDataCollection.class);
            // Just a test to see if thePeristentDataCollection has been initialized from JSON 
            System.out.println(thePersistentDataCollection.getTheCareerProfileList().getCareerProfileList().get(0).getName());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
