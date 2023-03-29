import java.util.ArrayList;
public class ISF {
    private String name;
    private ArrayList<NSF> NSFs;
    ISF(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    ArrayList<NSF> getNSFs() {
        return NSFs;
    }

    //TODO: Complete addNSF
    boolean addNSF(NSF nsf) {
        return false;
    }

    int countNSFs(){
        return NSFs.size();
    }

    int countPlayersInNSFs(){
        int count = 0;
        for (NSF nsf : NSFs){
            count += nsf.getPlayers().size();
        }
        return count;
    }
}
