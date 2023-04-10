package com.readjson;

import com.schema.*;
import com.utils.ViewableUtils;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        //System.out.println("Hello world!");

        ReadViewableApi read = new ReadViewableApi();

        ViewableUtils utils = new ViewableUtils();
        List<String> viewList = utils.getGlobalViewableList();

        for(String s: viewList ) {
            if(s != null)
            read.readViewable(s);
        }
        //read.readViewable("GYbzJYwfpssJtpAEAAAAI");
        //read.readViewable("GYyTRUQJzAnCNgAEAAACu");

    }
}