package com.solvd.homework;

import org.apache.commons.lang3.StringUtils;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.io.File;
import java.util.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class WeatherInfo {
    private String value;

    private static final Logger LOGGER = LogManager.getLogger(WeatherInfo.class);

    public WeatherInfo(String value) {
        this.value = value;
    }
    public static void weather(){

        try {
            File file = new File("C:\\Oleg\\Python\\Git\\123\\src\\main\\resourses\\file_1");
            String myString = StringUtils.lowerCase(FileUtils.readFileToString(file, StandardCharsets.UTF_8))
                    .replaceAll("[^\\da-zA-Za ]", " ");
            String[] arr = myString.split(" ");
            Set<String> set = new HashSet<String>(List.of(arr));
            List <String> myList = new ArrayList<>();
            for (String str: set){
                myList.add(str + " " + StringUtils.countMatches(myString,str));
                }
            FileUtils.writeLines(new File("C:\\Oleg\\Python\\Git\\123\\src\\main\\resourses\\count"), myList);
            LOGGER.info("'count' is exist");
        }catch (IOException e){
            LOGGER.error(e);
        }
    }
    public static void weatherValues(){
        LinkedList<WeatherInfo> days = new LinkedList<>();

        WeatherInfo values1 = new WeatherInfo("Rain");
        WeatherInfo values2 = new WeatherInfo("snow");
        WeatherInfo values3 = new WeatherInfo("sunny");

        days.add(values1);
        days.add(values2);
        days.add(values3);
        days.stream().forEach(LOGGER::info);

    }
}
