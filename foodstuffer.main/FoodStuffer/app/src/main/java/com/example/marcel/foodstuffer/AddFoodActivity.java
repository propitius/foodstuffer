package com.example.marcel.foodstuffer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.marcel.foodstuffer.database.InformationHandling;
import com.example.marcel.foodstuffer.dataholder.FoodGroup;

import java.util.ArrayList;

public class AddFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button QR_button = (Button) findViewById(R.id.qr_button);
        QR_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Not supported yet", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (!checkValues())
                {
                    return;
                }
                saveValues();
                //Intent intent = new Intent(AddFoodActivity.this, OverviewActivity.class);
                //startActivity(intent);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Spinner foodGroupsSpinner = (Spinner) findViewById(R.id.foodGroupsSpinner);
        ArrayList<String> foodGroups = new ArrayList<>();
        for(FoodGroup group : InformationHandling.getDefault().getAllFoodGroupItems())
        {
            foodGroups.add(group.getName());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, foodGroups);
        foodGroupsSpinner.setAdapter(adapter);
    }

    /**
     *
     */
    private void saveValues()
    {
        //TODO: implementieren
    }

    /**
     * Checks the values entered by the user.
     * If a value is invalid, a pop-up message is generated.
     *
     * @return true, if all values are valid.
     */
    private boolean checkValues()
    {
        //TODO: impementieren
        return false;
    }

    public View getAddNewGroupButton()
    {
        Button button = new Button(getApplicationContext());
        button.setText(R.string.add_new_group);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Not supported yet", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        return button;
    }
}
