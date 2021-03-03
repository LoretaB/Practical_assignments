package Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class District {
    private String title;
    private String city;
    private int districtID;
    private Officer[] officersInTheDistrict;

    public District() {
    }

    public District(String title, String city, int districtID, Officer[] officersInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        this.officersInTheDistrict = officersInTheDistrict;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public Officer[] getOfficersInTheDistrict() {
        return officersInTheDistrict;
    }

    public void setOfficersInTheDistrict(Officer[] officersInTheDistrict) {
        this.officersInTheDistrict = officersInTheDistrict;
    }

    public String toString() {
        return "Title: " + getTitle() + "\nCity: " + getCity() + "\nDistrict ID: " + getDistrictID() + "\nOfficers in the district: \n" + Arrays.toString(getOfficersInTheDistrict()) + "\n";
    }

    public boolean addNewOfficer(Officer officer) {
        ArrayList<Officer> sourceList = new ArrayList<>(Arrays.asList(getOfficersInTheDistrict()));
        sourceList.add(officer);
        setOfficersInTheDistrict(sourceList.toArray(new Officer[0]));
        return true;
    }

    public boolean removeOfficer(Officer officer) {
        ArrayList<Officer> sourceList = new ArrayList<>(Arrays.asList(getOfficersInTheDistrict()));
        sourceList.remove(officer);
        setOfficersInTheDistrict(sourceList.toArray(new Officer[0]));
        return true;
    }

    public float calculateAvgLevelInDistrict() {
        Officer[] officersArray = getOfficersInTheDistrict();
        float sum = 0;
        for (Officer officer : officersArray) {
            sum += officer.calculatedLevel(officer.getCrimesSolved());
        }
        float averageLevel = sum / officersArray.length;
        return averageLevel;
    }
}
