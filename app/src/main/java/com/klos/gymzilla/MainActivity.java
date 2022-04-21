package com.klos.gymzilla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.klos.gymzilla.connection.ConnectionHelper;

import org.w3c.dom.Text;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    static public Connection connect = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToWorkoutSec(View view){
        Intent intent = new Intent(MainActivity.this,WorkoutsActivity.class);
        startActivity(intent);
    }

    public void showFromDB(View v){
        TextView txt = (TextView) findViewById(R.id.textDb);
        try {
            ConnectionHelper myCon = new ConnectionHelper();
            connect = myCon.con();
            String sqlQuery = "Select name from test where test_id = 2";

            if (connect != null) {
                Statement statement = connect.createStatement();
                ResultSet rs = statement.executeQuery(sqlQuery);
                while(rs.next()) {
                    txt.setText(rs.getString(1));
                }
            } else {
                txt.setText("Connection error1");
            }
        }catch(Exception ex){
            Log.e("Error: ", ex.getMessage());
            txt.setText("Connection error2");
        }

    }

}