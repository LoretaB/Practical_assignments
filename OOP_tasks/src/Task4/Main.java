package Task4;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static DecimalFormat df = new DecimalFormat("0.00");


    public static void districtWithMaxPersons(ArrayList<District> districtList) {
        for (int i = 0, j = i + 1; i < districtList.size(); i++) {
            if (districtList.get(i).getPersonsInTheDistrict().size() > districtList.get(j).getPersonsInTheDistrict().size()) {
                System.out.format("\n%s has the highest amount of Persons", districtList.get(i).getTitle());
            } else if (districtList.get(i).getPersonsInTheDistrict().size() < districtList.get(j).getPersonsInTheDistrict().size()) {
                System.out.format("\n%s has the highest amount of Persons", districtList.get(j).getTitle());
            } else if (districtList.get(i).getPersonsInTheDistrict().size() == districtList.get(j).getPersonsInTheDistrict().size() && i != j) {
                System.out.println("\nPerson amount in both districts are equal!");
            }
        }
    }

    public static void main(String[] args) {
        Officer officer1 = new Officer("John", "Black", 145, 25);
        Officer officer2 = new Officer("Jerry", "Grey", 215, 50);
        Officer officer3 = new Officer("Robert", "Green", 745, 3);
        Officer officer4 = new Officer("James", "White", 865, 15);
        Officer officer5 = new Officer("Christian", "Purple", 251, 2);
        Officer officer6 = new Officer("Rodger", "Red", 135, 42);
        Officer officer7 = new Officer("Harry", "Orange", 175, 35);

        District district1 = new District("District 1", "SmallCity", 1, new ArrayList<>());
        District district2 = new District("District 2", "BigCity", 2, new ArrayList<>());

        Lawyer lawyer1 = new Lawyer("Bella", "White", 111, 15);
        Lawyer lawyer2 = new Lawyer("Jessica", "Snow", 112, 1);
        Lawyer lawyer3 = new Lawyer("Emily", "Winter", 113, 34);

        //add 3 officers to district1
        district1.addNewOfficer(officer1);
        district1.addNewOfficer(officer2);
        district1.addNewOfficer(officer3);


        //add 2 lawyers to district1
        district1.addNewLawyer(lawyer1);
        district1.addNewLawyer(lawyer2);

        //add 4 officers to district2
        district2.addNewOfficer(officer4);
        district2.addNewOfficer(officer5);
        district2.addNewOfficer(officer6);
        district2.addNewOfficer(officer7);

        //add 1 lawyer to district2
        district2.addNewLawyer(lawyer3);

        //print info about both districts
        System.out.println("Information about District 1:\n" + district1 + "\nInformation about District 2:\n" + district2);

        //average Officer level in districts
        System.out.format("Average level in %s is %s \n", district1.getTitle(), df.format(district1.calculateAvgLevelInDistrict()));
        System.out.format("Average level in %s is %s \n", district2.getTitle(), df.format(district2.calculateAvgLevelInDistrict()));

        //create arraylist for districts
        ArrayList<District> districtList = new ArrayList<>();
        districtList.add(district1);
        districtList.add(district2);

        //Find out which District is with the highest amount of Persons
        districtWithMaxPersons(districtList);
    }
}

