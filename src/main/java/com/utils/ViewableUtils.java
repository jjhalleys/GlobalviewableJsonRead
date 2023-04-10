package com.utils;

import com.schema.Offering;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ViewableUtils {

    public List<String> getGlobalViewableList() {
        List<String> globalList = new ArrayList<String>();
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("/Users/jelio.jaganathan/IdeaProjects/GlobalviewableJsonRead/src/main/resources/viewable.properties"));
            String line = reader.readLine();

            while (line != null) {
                //System.out.println(line);
                // read next line
                line = reader.readLine();

                globalList.add(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return globalList;
    }

   public boolean containsName(ArrayList<Offering> list, String name) {
        boolean b= list.stream().anyMatch(p -> p.getTerritory().equals(name));
       return b;
    }


}
