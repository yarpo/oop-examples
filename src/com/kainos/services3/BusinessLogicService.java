package com.kainos.services3;

/**
 * This shows even more abstract approach.
 * <p>
 * You don't tell you want to use a db. You want a data store.
 * <p>
 * Define interface and use either a text file, db (mysql, sqlite or Oracle) or external API deployed in cloud.
 */
public class BusinessLogicService {

    private final DataStorage dataStorage;

    public BusinessLogicService(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void saveData(String data) {
        this.dataStorage.save(data);
    }

    public void read(String id) {
        this.dataStorage.read(id);
    }
}
