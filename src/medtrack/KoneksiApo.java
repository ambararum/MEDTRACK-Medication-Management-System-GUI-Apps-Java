package medtrack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.sql.DriverManager;

/**
 *
 * @author PY7
 */
public class KoneksiApo {
    private static java.sql.Connection koneksiApo;
    
    public static java.sql.Connection getKoneksi(){
        if (koneksiApo == null){
            try{
                String url = "jdbc:mysql://localhost:3306/medtrack3";
                String user = "root";
                String password = "";
                koneksiApo = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Successfully");
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        return koneksiApo;
    }
    
    public static void main(String args[]){
        getKoneksi();
    }
}