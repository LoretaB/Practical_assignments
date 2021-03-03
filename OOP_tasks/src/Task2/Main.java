package Task2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static DecimalFormat df = new DecimalFormat("0.00");

    public static int countOfficers(ArrayList<District> districtArray) {
        int countOfficers = 0;
        for (District district : districtArray) {
            countOfficers = countOfficers + district.getOfficersInTheDistrict().length;
        }
        return countOfficers;
    }

    public static float calculateAverageLevelBothDistricts(ArrayList<District> districtArray) {
        float level = 0;
        for (District district : districtArray) {
            level = level + district.calculateAvgLevelInDistrict();
        }
        return level / districtArray.size();
    }

    public static District whoIsBetter(ArrayList<District> districtArray) {
        District district = null;
        for (int i = 0, j = i + 1; i < districtArray.size(); i++) {
            if (districtArray.get(i).calculateAvgLevelInDistrict() > districtArray.get(j).calculateAvgLevelInDistrict()) {
                district = districtArray.get(i);
            } else if (districtArray.get(i).calculateAvgLevelInDistrict() < districtArray.get(j).calculateAvgLevelInDistrict()) {
                district = districtArray.get(j);
            }
        }
        return district;
    }

    public static void main(String[] args) {
        Officer officer1 = new Officer("John", "Black", 145, 25);
        Officer officer2 = new Officer("Jerry", "Grey", 215, 50);
        Officer officer3 = new Officer("Robert", "Green", 745, 3);
        Officer officer4 = new Officer("James", "White", 865, 15);
        Officer officer5 = new Officer("Christian", "Purple", 251, 2);
        Officer officer6 = new Officer("Rodger", "Red", 135, 42);
        Officer officer7 = new Officer("Harry", "Orange", 175, 35);

        District district1 = new District("District 1", "SmallCity", 1, new Officer[0]);
        District district2 = new District("District 2", "BigCity", 2, new Officer[0]);

        //add 3 officers to district1
        district1.addNewOfficer(officer1);
        district1.addNewOfficer(officer2);
        district1.addNewOfficer(officer3);

        //add 4 officers to district2
        district2.addNewOfficer(officer4);
        district2.addNewOfficer(officer5);
        district2.addNewOfficer(officer6);
        district2.addNewOfficer(officer7);

        //print info about both districts
        System.out.println("Information about District 1:\n" + district1 + "\nInformation about District 2:\n" + district2);

        //remove one Officer from the District 2
        district2.removeOfficer(officer7);
        System.out.println(district2);

        //calculate average level of each district
        System.out.println("Average level in District 1: " + df.format(district1.calculateAvgLevelInDistrict()));
        System.out.println("Average level in District 2: " + df.format(district2.calculateAvgLevelInDistrict()));

        //create district Arraylist
        ArrayList<District> districtArray = new ArrayList<>();
        districtArray.add(district1);
        districtArray.add(district2);

        //calculate officers in both districts
        System.out.println("Officer count in both districts are: " + countOfficers(districtArray));

        //calculate average level of both districts
        System.out.println("Officer level in both districts are: " + df.format(calculateAverageLevelBothDistricts(districtArray)));

        //Find out which District is the best based on the average level of Officers.
        System.out.println(whoIsBetter(districtArray).getTitle() + " is better, because it's average level is " + df.format(whoIsBetter(districtArray).calculateAvgLevelInDistrict()));
    }
}

