/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.facade;

import java.sql.Connection;

/**
 *
 * @author nabil
 */
public class MySqlHelper {

    public static Connection getMySqlDBConnection() {
        //get MySql DB connection using connection parameters
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con) {
        //get data from table and generate pdf report
    }

    public void generateMySqlHTMLReport(String tableName, Connection con) {
        //get data from table and generate pdf report
    }
}
