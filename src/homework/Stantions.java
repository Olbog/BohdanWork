package homework;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Marker;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public final class Stantions {

    private static final Logger LOGGER = LogManager.getLogger(Stantions.class);

    private String name;

    public Stantions(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Marker setName(String name) throws StationException {
        if (name.equals("Orsha")) {
            throw new StationException("This station is close");
        } else {
            this.name = name;
        }
        return null;
    }
    public static void stantionsCollections(){

        List<String> stations = new ArrayList<>();
        stations.add("Minsk");
        stations.add("Brest");
        stations.add("Vitebsk");

        String stantion1FromCollection = stations.get(0);
        String stantion2FromCollection = stations.get(1);
        String stantion3FromCollection = stations.get(2);

        LOGGER.info(stantion1FromCollection);
        LOGGER.info(stantion2FromCollection);
        LOGGER.info(stantion3FromCollection);

    }
}
