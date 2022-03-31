package com.kainos.services2;

public class BusinessLogicService {

    private final DbConnection dbConnection;

    /**
     * You can now use either MySql or Sqlite implementation.
     *
     * They both implement DbConnection so you will not need to change anything in this class.
     * */
    public BusinessLogicService(DbConnection connection) {
        this.dbConnection = connection;
        this.dbConnection.connect();
    }

    public void saveData(String data) {
        this.dbConnection.query("Insert into myTable values (" + data + ")");
    }
}
