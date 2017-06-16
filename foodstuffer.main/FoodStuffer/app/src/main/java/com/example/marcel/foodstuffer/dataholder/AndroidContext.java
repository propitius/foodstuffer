package com.example.marcel.foodstuffer.dataholder;

import android.content.Context;

/**
 * Created by Marcel on 16.06.2017.
 */

public class AndroidContext
{
    private static Context context;

    public static Context getContext()
    {
        return context;
    }

    public static void setContext(Context context)
    {
        AndroidContext.context = context;
    }
}
