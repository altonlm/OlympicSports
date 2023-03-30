import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
public class IOC {
    private String name;
    private List<ISF> ISFs;

    IOC(String name){
        this.name = name;
        this.ISFs = new ArrayList<ISF>();
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    List<ISF> getISFs() {
        return ISFs;
    }
    void setISFs(List<ISF> ISFs) {
        this.ISFs = ISFs;
    }
    int countNSFs() {
        int count = 0;
        for (ISF isf : ISFs){
            count += isf.countNSFs();
        }
        return count;
    }

    int countPlayersInISFNSFs() {
        int count = 0;
        for (ISF isf : ISFs){
            count+=isf.countPlayersInNSFs();
        }
        return count;
    }
}
