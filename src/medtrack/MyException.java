/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medtrack;

import java.sql.Connection;
import static medtrack.KoneksiApo.getKoneksi;

/**
 *
 * @author LENOVO G40 80
 */
import java.sql.Connection;

public class MyException extends Exception {
    private Connection connection;

    public MyException(String message, Connection connection) {
        super(message);
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }
    
}