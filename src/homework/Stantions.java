package homework;

import org.apache.logging.log4j.Marker;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public final class Stantions {
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
}
