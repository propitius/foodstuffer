package com.example.marcel.foodstuffer.database;

import com.example.marcel.foodstuffer.dataholder.Food;
import com.example.marcel.foodstuffer.dataholder.FoodGroup;

import java.util.List;

/**
 * Created by Marcel on 16.06.2017.
 */

public abstract class InformationHandling
{
    private static InformationHandling defaultInstance = null;

    public static InformationHandling getDefault()
    {
        if(defaultInstance == null)
        {
            defaultInstance = new DummyInformationHandling();
        }
        return defaultInstance;
    }

    /**
     * Saves the food object
     * @param food
     * @return
     */
    public abstract boolean saveNewItem(Food food);


    /**
     * Saves the group object
     * @param group
     * @return
     */
    public abstract boolean saveNewItem(FoodGroup group);

    /**
     * Returns all food items stored.
     * @return
     */
    public abstract List<Food> getAllFoodItems();

    /**
     * Returns all foodGroup items stored.
     */
    public abstract List<FoodGroup> getAllFoodGroupItems();
}
