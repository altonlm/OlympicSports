import java.util.ArrayList;
public class Player {
    private String firstName, lastName;
    private ArrayList<NSF> NSFs;
    public Player(String firstName, String lastName){ // constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.NSFs = new ArrayList<NSF>();

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<NSF> getNSFs() {
        return NSFs;
    }

    public void setNSFs(ArrayList<NSF> NSFs) {
        this.NSFs = NSFs;
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    public void listPlayerNSFs(){
        String returnString = this.toString() + ": ";
        for (int i = 0; i < NSFs.size()-2; i++) {
            returnString += NSFs.get(i).toString() + ", ";
        }
        returnString += NSFs.get(NSFs.size()-1);
        System.out.println(returnString);
    }

    public void addNSF(NSF nsf){
        NSFs.add(nsf);
    }
}
