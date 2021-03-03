package Task3;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static DecimalFormat df = new DecimalFormat("0.00");

    public static int totalCrimes(ArrayList<Lawyer> lawyerArray) {
        int sumCrimes = 0;
        for (Lawyer lawyer : lawyerArray) {
            sumCrimes = sumCrimes + lawyer.getHelpedInCrimesSolving();
        }
        return sumCrimes;
    }

    public static Lawyer bestLawyer(ArrayList<Lawyer> lawyerList) {
        int max = Integer.MIN_VALUE;
        Lawyer bestLaw = null;
        for (int i = 0; i < lawyerList.size(); i++) {
            if (lawyerList.get(i).getHelpedInCrimesSolving() > Integer.MIN_VALUE) {
                max = lawyerList.get(i).getHelpedInCrimesSolving();
                bestLaw = lawyerList.get(i);
            }
        }
        return bestLaw;
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

        Lawyer lawyer1 = new Lawyer("Bella", "White", 111, 15);
        Lawyer lawyer2 = new Lawyer("Jessica", "Snow", 112, 1);
        Lawyer lawyer3 = new Lawyer("Emily", "Winter", 113, 34);

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

        //print info about all Lawyers
        System.out.format("First lawyer:\n %s\nSecond lawyer:\n %s\nThird lawyer:\n %s\n", lawyer1.toString(), lawyer2.toString(), lawyer3.toString());

        //create arraylist for lawyers
        ArrayList<Lawyer> lawyerList = new ArrayList<>();
        lawyerList.add(lawyer1);
        lawyerList.add(lawyer2);
        lawyerList.add(lawyer3);

        //total number of crimes in which solving the Lawyers were involved
        System.out.println("The total number of the crimes in which solving the Lawyers were involved: " + totalCrimes(lawyerList));

        //Find out which Lawyer has helped the most to solve crimes
        System.out.println("\nThe best lawyer:\n" + bestLawyer(lawyerList));
    }
}

