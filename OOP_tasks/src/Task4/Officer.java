package Task4;

public class Officer extends Person {
    private int officerID;
    private int crimesSolved;

    public Officer() {
    }

    public Officer(String name, String surname, int officerID, int crimesSolved) {
        super(name, surname);
        this.officerID = officerID;
        this.crimesSolved = crimesSolved;
    }

    public int getOfficerID() {
        return officerID;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public int getCrimesSolved() {
        return crimesSolved;
    }

    public void setCrimesSolved(int crimesSolved) {
        this.crimesSolved = crimesSolved;
    }

    public String toString() {
        return "Name: " + getName() + " Surname: " + getSurname() + " Officer ID: " + getOfficerID() + " Crimes solved: " + getCrimesSolved() + "\n";
    }

    public int calculatedLevel(int crimesSolved) {
        int officeLevel = 0;
        if (crimesSolved < 20) {
            officeLevel = 1;
        } else if (crimesSolved >= 20 && crimesSolved < 40) {
            officeLevel = 2;
        } else if (crimesSolved >= 40) {
            officeLevel = 3;
        }
        return officeLevel;
    }

}

