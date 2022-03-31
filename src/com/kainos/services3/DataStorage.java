package com.kainos.services3;

/**
 * It's even better. Who told you must always use db. Maybe there is some external service to store your data?
 * */
public interface DataStorage {

    void save(String data);
    String read(String id);
}
