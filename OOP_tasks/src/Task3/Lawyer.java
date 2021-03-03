package Task3;

public class Lawyer extends Person {
    private int lawyerID;
    private int helpedInCrimesSolving;

    public Lawyer() {
    }

    public Lawyer(String name, String surname, int lawyerID, int helpedInCrimesSolving) {
        super(name, surname);
        this.lawyerID = lawyerID;
        this.helpedInCrimesSolving = helpedInCrimesSolving;
    }

    public int getLawyerID() {
        return lawyerID;
    }

    public void setLawyerID(int lawyerID) {
        this.lawyerID = lawyerID;
    }

    public int getHelpedInCrimesSolving() {
        return helpedInCrimesSolving;
    }

    public void setHelpedInCrimesSolving(int helpedInCrimesSolving) {
        this.helpedInCrimesSolving = helpedInCrimesSolving;
    }

    public String toString() {
        return "Name: " + getName() + "\nSurname: " + getSurname() + "\nLawyer ID: " + getLawyerID() + "\nHelped in crimes solving: " + getHelpedInCrimesSolving() + "\n";
    }
}
