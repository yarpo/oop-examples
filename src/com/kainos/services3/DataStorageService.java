package com.kainos.services3;

public class DataStorageService {

    public void save(String data, String type) {
        if (type.equals("json")) {
            // open json file, save new data, close
        } else {
            // open xml file, save new data, close
        }
    }

    public String read(String type) {
        if (type.equals("json")) {
            // open json file, read and return data, close
            return "json data from file";
        } else {
            // open xml file, read and return data, close
            return "xml data from file";
        }
    }
}
