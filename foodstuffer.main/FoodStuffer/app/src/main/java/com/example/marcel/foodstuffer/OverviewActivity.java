package com.example.marcel.foodstuffer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.marcel.foodstuffer.database.InformationHandling;
import com.example.marcel.foodstuffer.dataholder.Food;

public class OverviewActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_overview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(OverviewActivity.this, AddFoodActivity.class);
                startActivity(intent);
            }
        });

        addItems();
    }

    private void addItems()
    {
        // Create a LinearLayout element
        LinearLayout ll = (LinearLayout) findViewById(R.id.scrollViewLayout);
        ll.setOrientation(LinearLayout.VERTICAL);

        // Add items
        for(Food item : InformationHandling.getDefault().getAllFoodItems())
        {
            //ll.addView(new FoodView(getApplicationContext(), item));
            TextView textView = new TextView(getApplicationContext());
            textView.setText(item.getName() + " - " + item.getExpirationDate().toString());
            ll.addView(textView);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_overview, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
