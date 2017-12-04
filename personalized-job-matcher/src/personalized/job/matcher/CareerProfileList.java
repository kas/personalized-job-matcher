/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.util.ArrayList;

/**
 *
 * @author KAS6570
 */
public class CareerProfileList {

    private ArrayList<CareerProfile> careerProfileList;

    public CareerProfileList() {
        careerProfileList = new ArrayList<>();
        makeCareerProfileList();
    }

    private void makeCareerProfileList() {
        ArrayList<String> personalities = new ArrayList<>();
        personalities.add("Organized");
        personalities.add("Competitive");

        careerProfileList.add(new CareerProfile("Software Engineer", "75000", "Designs software", personalities));
        careerProfileList.add(new CareerProfile("Manager", "60000", "Manages people", personalities));
    }

    public void add(CareerProfile careerProfile) {
        this.careerProfileList.add(careerProfile);
    }

    /**
     * @return the careerProfileList
     */
    public ArrayList<CareerProfile> getCareerProfileList() {
        return careerProfileList;
    }

    /**
     * @param careerProfileList the careerProfileList to set
     */
    public void setCareerProfileList(ArrayList<CareerProfile> careerProfileList) {
        this.careerProfileList = careerProfileList;
    }
}
