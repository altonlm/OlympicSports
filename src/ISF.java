import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
public class ISF {
    private String name;
    private List<NSF> NSFs;
    ISF(String name) {
        this.name = name;
        this.NSFs = new ArrayList<NSF>();
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    List<NSF> getNSFs() {
        return NSFs;
    }

    boolean addNSF(NSF nsf) {
        return NSFs.add(nsf);
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
