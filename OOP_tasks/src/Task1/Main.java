

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void countByLevel(ArrayList<Officer> district99, int level) {
        int counter = 0;
        int biggerThanLevelCount = 0;
        for (Officer officer : district99) {
            if (officer.calculatedLevel(officer.getCrimesSolved()) == level) {
                counter++;
            } else if (officer.calculatedLevel(officer.getCrimesSolved()) > level) {
                biggerThanLevelCount++;
            }
        }
        System.out.format("There are %d officer/-s in the District 99 with level 1!\nThere are %d officer/-s with levels, that are larger than 1!\n", counter, biggerThanLevelCount);
    }

    public static boolean findByName(ArrayList<Officer> district99, String namePattern) {
        for (Officer officer : district99) {
            if (officer.getName().matches(namePattern)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static Officer officerCreator() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter Officer's name: ");
        String name = input.nextLine();
        System.out.print("Please, enter Officer's surname: ");
        String surname = input.nextLine();
        System.out.print("Please, enter Officer's ID: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.print("Please, enter Officer's working district: ");
        String district = input.nextLine();
        System.out.print("Please, enter Officer's crimes solved: ");
        int crimes = Integer.parseInt(input.nextLine());

        //input.close();

        return new Officer(name, surname, id, district, crimes);
    }


    public static void main(String[] args) {
        Officer officer1 = new Officer("John", "Miles", 145, "District 99", 25);
        Officer officer2 = new Officer("Jerry", "Smith", 215, "District 99", 50);
        Officer officer3 = new Officer("Robert", "Grant", 745, "District 99", 3);

        ArrayList<Officer> district99 = new ArrayList<>();
        district99.add(officer1);
        district99.add(officer2);
        district99.add(officer3);


        //print info about officers form arraylist
        System.out.println(district99);

        //find officer count by levels
        countByLevel(district99, 1);

        //find by name
        System.out.println("Is there officer named John? Answer: " + findByName(district99, "[Jj]ohn"));
        System.out.println();

        //create new officer
        //Officer officer4 = officerCreator();
        //district99.add(officer4);
        //System.out.println("New arraylist:\n" + district99);
       // System.out.println("New arraylist size: " + district99.size());


    }
}
