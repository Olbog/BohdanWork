package homework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;
import java.util.List;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Maps {
    static String map;

    private static final Logger LOGGER = LogManager.getLogger(Maps.class);

    static {
        map = "The world's map";
    }

    public static void loading(){
        LOGGER.info(map + " is loading...");
    }

    public static void linkList(){
        List<String> maps = new LinkedList<>();

        maps.add("Europe");
        maps.add("Asia");
        maps.add("South America");
        maps.add("North America");
        maps.add("Australia");


        String Europe = maps.get(0);
        String Asia = maps.get(1);
        String SouthAmerica = maps.get(2);
        String NorthAmerica  = maps.get(3);
        String Australia  = maps.get(4);

        LOGGER.info(Europe);
        LOGGER.info(Asia);
        LOGGER.info(SouthAmerica);
        LOGGER.info(NorthAmerica);
        LOGGER.info(Australia);
    }
}
