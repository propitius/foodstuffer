package com.example.marcel.foodstuffer.database;

import android.util.Log;

import com.example.marcel.foodstuffer.dataholder.Food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Marcel on 14.06.2017.
 */

public class DatabaseController
{
    private static DatabaseController defaultInstance = null;

    private Connection c = null;

    public static DatabaseController getDefault()
    {
        if(defaultInstance == null)
        {
            defaultInstance = new DatabaseController();
        }
        return defaultInstance;
    }

    private DatabaseController()
    {
        //SQLite Tutorial https://www.tutorialspoint.com/sqlite/sqlite_java.htm
        //Create connection to the database
        try
        {
            Class.forName("org.sqlite.JDBC");
            String databaseFile = getDatabaseFile();
            ensureDatabaseExists(databaseFile);
            c = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
        }
        catch (Exception e)
        {
            Log.e(getClass().getCanonicalName(), e.getMessage(), e);
        }
    }

    /**
     * Checks if the database file exists.<br>
     * If the database file does not exist, the file is created with all tables.
     */
    private void ensureDatabaseExists(String databaseFile)
    {
        //TODO: implementieren
    }

    /**
     * Writes the food object into the database
     * @param food
     * @return
     */
    public boolean saveNewItem(Food food)
    {
        try
        {
            Statement stmt = c.createStatement();
            String sql = getSqlCreationString(food);
            stmt.executeUpdate(sql);
            return true;
        }
        catch (SQLException e)
        {
            Log.e(getClass().getCanonicalName(), e.getMessage(), e);
            e.printStackTrace();
            return false;
        }
    }

    private String getSqlCreationString(Food food)
    {
        //TODO: SQL-String erstellen
        //z.B. INSERT into Tabelle1 (ID, name, expiration_date) VALUES (1, 'Test', '2017-12-12');
        return "";
    }

    /**
     * Returns the path to the database file.
     * @return
     */
    public String getDatabaseFile()
    {
        //TODO: implementieren
        return "";
    }
}
