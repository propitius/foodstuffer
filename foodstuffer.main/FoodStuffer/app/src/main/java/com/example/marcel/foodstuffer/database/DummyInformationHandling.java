package com.example.marcel.foodstuffer.database;

import com.example.marcel.foodstuffer.dataholder.Food;
import com.example.marcel.foodstuffer.dataholder.FoodGroup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Marcel on 16.06.2017.
 * Implemented for developing purposes.
 * Saves the information only in the ram.
 */

class DummyInformationHandling extends InformationHandling
{
    private ArrayList<Food> foodItems = new ArrayList<>();
    private ArrayList<FoodGroup> foodGroupItems = new ArrayList<>();

    DummyInformationHandling()
    {
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            foodItems.add(new Food("Toast", sdf.parse("16.06.2018")));
            foodItems.add(new Food("Eggs", sdf.parse("16.08.2017")));

            foodGroupItems.add(new FoodGroup("Bread"));
            foodGroupItems.add(new FoodGroup("From animal"));
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public boolean saveNewItem(Food food)
    {
        return foodItems.add(food);
    }

    @Override
    public boolean saveNewItem(FoodGroup group)
    {
        return false;
    }

    @Override
    public List<Food> getAllFoodItems()
    {
        return foodItems;
    }

    @Override
    public List<FoodGroup> getAllFoodGroupItems()
    {
        return foodGroupItems;
    }
}
