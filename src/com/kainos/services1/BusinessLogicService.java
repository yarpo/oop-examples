package com.kainos.services1;

/**
 * I have left 3 packages. `service1` `...2` and `...3`.
 *
 * It's just to show how it can be improved step by step.
 * */
public class BusinessLogicService {

    private final MySqlConnection mySqlConnection;

    public BusinessLogicService(MySqlConnection connection) {
        this.mySqlConnection = connection;
        this.mySqlConnection.connectToMySqlDatabase();
    }

    public void saveData(String data) {
        this.mySqlConnection.querySql("Insert into myTable values ..." + data);
    }
}
