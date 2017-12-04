/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.Writer;
import java.io.*;

/**
 *
 * @author austi
 */
public class PersistentDataController {
    private static PersistentDataController thePersistentDataController;

    /**
     * @return the thePersistentDataController
     */
    public static PersistentDataController getThePersistentDataController() {
        return thePersistentDataController;
    }

    /**
     * @param aThePersistentDataController the thePersistentDataController to set
     */
    public static void setThePersistentDataController(PersistentDataController aThePersistentDataController) {
        thePersistentDataController = aThePersistentDataController;
    }
    private PersistentDataCollection thePersistentDataCollection;
    private String EXTERNAL_DATA_PATH = "";
    private String DATA_FILE_NAME = "AppData.ser";
    private String JSON_FILE_NAME = "AppData.json";
    
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

    /**
     * @return the thePersistentDataCollection
     */
    public PersistentDataCollection getThePersistentDataCollection() {
        return thePersistentDataCollection;
    }

    /**
     * @param thePersistentDataCollection the thePersistentDataCollection to set
     */
    public void setThePersistentDataCollection(PersistentDataCollection thePersistentDataCollection) {
        this.thePersistentDataCollection = thePersistentDataCollection;
    }

    /**
     * @return the EXTERNAL_DATA_PATH
     */
    public String getEXTERNAL_DATA_PATH() {
        return EXTERNAL_DATA_PATH;
    }

    /**
     * @param EXTERNAL_DATA_PATH the EXTERNAL_DATA_PATH to set
     */
    public void setEXTERNAL_DATA_PATH(String EXTERNAL_DATA_PATH) {
        this.EXTERNAL_DATA_PATH = EXTERNAL_DATA_PATH;
    }

    /**
     * @return the DATA_FILE_NAME
     */
    public String getDATA_FILE_NAME() {
        return DATA_FILE_NAME;
    }

    /**
     * @param DATA_FILE_NAME the DATA_FILE_NAME to set
     */
    public void setDATA_FILE_NAME(String DATA_FILE_NAME) {
        this.DATA_FILE_NAME = DATA_FILE_NAME;
    }

    /**
     * @return the JSON_FILE_NAME
     */
    public String getJSON_FILE_NAME() {
        return JSON_FILE_NAME;
    }

    /**
     * @param JSON_FILE_NAME the JSON_FILE_NAME to set
     */
    public void setJSON_FILE_NAME(String JSON_FILE_NAME) {
        this.JSON_FILE_NAME = JSON_FILE_NAME;
    }
    
}
