package Task4;

import java.util.ArrayList;

public class District {
    private String title;
    private String city;
    private int districtID;
    private ArrayList<Person> personsInTheDistrict;

    public District() {
    }

    public District(String title, String city, int districtID, ArrayList<Person> personsInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        this.personsInTheDistrict = personsInTheDistrict;
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

    public ArrayList<Person> getPersonsInTheDistrict() {
        return personsInTheDistrict;
    }

    public void setPersonsInTheDistrict(ArrayList<Person> personsInTheDistrict) {
        this.personsInTheDistrict = personsInTheDistrict;
    }

    public String toString() {
        return "Title: " + getTitle() + "\nCity: " + getCity() + "\nDistrict ID: " + getDistrictID() + "\nPersons in the district: \n" + getPersonsInTheDistrict() + "\n";
    }

    public boolean addNewOfficer(Officer officer) {
        personsInTheDistrict.add(officer);
        return true;
    }

    public boolean addNewLawyer(Lawyer lawyer) {
        personsInTheDistrict.add(lawyer);
        return true;
    }

    public float calculateAvgLevelInDistrict() {
        ArrayList<Officer> officerList = new ArrayList<>();
        for (int i = 0; i < getPersonsInTheDistrict().size(); i++) {
            if (getPersonsInTheDistrict().get(i) instanceof Officer) {
                officerList.add((Officer) getPersonsInTheDistrict().get(i));
            }
        }
        float sum = 0;
        for (Officer officer : officerList) {
            sum += officer.calculatedLevel(officer.getCrimesSolved());
        }
        return sum / officerList.size();
    }
}
