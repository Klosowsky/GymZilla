package com.klos.gymzilla.connection;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
    Connection connect;
    String username,password,ip,port,database;
    @SuppressLint("NewApi")
    public Connection con(){
        ip = "192.168.56.1";
        username = "fzAdmin";
        password = "1064";
        port = "1433";
        database="FileZillaDB";
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String connectionURL = null;

        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            connectionURL = "jdbc:jtds:sqlserver://"+ip+":"+port+";databasename="+database+";user="+username+";password="+password+";";
            connection = DriverManager.getConnection(connectionURL);
        }catch(Exception exc){
            Log.e("Error: " , exc.getMessage());
        }
        return connection;
    }
}
