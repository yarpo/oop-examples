package com.kainos.services2;

public interface DbConnection {
    void connect();
    void query(String sql);
}
