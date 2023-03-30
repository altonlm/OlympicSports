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
        LinkedHashSet<Player> totalPlayers = new LinkedHashSet<Player>();
        for (NSF nsf : NSFs){
            totalPlayers.addAll(nsf.getPlayers());
        }
        return totalPlayers.size();
    }
}
