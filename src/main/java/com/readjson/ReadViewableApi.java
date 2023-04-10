package com.readjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.schema.Short;
import com.utils.ViewableUtils;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.schema.*;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadViewableApi {

    public void readViewable(String viewableId) throws IOException {

        ViewableUtils utils = new ViewableUtils();

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://catalog.api.hbo.com/viewables/"+ viewableId)
                .addHeader("Content-Type","application/json")
                .addHeader("Accept","application/json")
                .build();



        Response response;

        try {
            response = client.newCall(request).execute();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


        if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
        }
        String jsonData = response.body().string();
        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        ViewableSchema schema = objectMapper.readValue(jsonData, ViewableSchema.class);

        Titles titles= schema.getTitles();
        Short short1 = titles.getShort();

        LocalDate date = LocalDate.now();

        ArrayList<Offering> offList = (ArrayList<Offering>)schema.getOfferings();
        int i=0;
if(offList == null || offList.size() == 0)
{
    System.out.println(schema.getTitles().getShort().getEnUs() + ',' + "No Offerings");
}
else
    if(utils.containsName(offList,"HBO MAX DOMESTIC")) {
        for (Offering o : offList) {
            if (o.getTerritory().equals("HBO MAX DOMESTIC") && o.getChannel().equals("HBO MAX SUBSCRIPTION")) {
                if (Instant.parse(o.getEndUTC()).compareTo(Instant.now()) > 0) {
                    i++;
                    System.out.println(schema.getTitles().getShort().getEnUs()
                            + '|' + viewableId + '|' + o.getTerritory() + '|' + schema.getType() + '|' + Instant.parse(o.getEndUTC()));
                }
            }
        }
        if(i == 0)
        {
            System.out.println(schema.getTitles().getShort().getEnUs()
                    + '|' + viewableId + '|' + "No active HBO MAX DOMESTIC offerings"+ '|' + schema.getType());
        }
    }
    else
    System.out.println(schema.getTitles().getShort().getEnUs()
            +'|'+viewableId + '|'+ "No HBO MAX DOMESTIC Territory" + '|' + schema.getType());


    }


}