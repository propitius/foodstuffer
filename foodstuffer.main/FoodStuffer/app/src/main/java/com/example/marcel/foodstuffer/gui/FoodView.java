package com.example.marcel.foodstuffer.gui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.marcel.foodstuffer.dataholder.Food;

/**
 * Created by Marcel on 16.06.2017.
 */

public class FoodView extends View
{
    private Food data;
    private Paint paint = new Paint();

    public FoodView(Context context, Food item)
    {
        super(context);
        data = item;
        init();
    }

    public FoodView(Context context, @Nullable AttributeSet attrs, Food item)
    {
        super(context, attrs);
        data = item;
        init();
    }

    public FoodView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, Food item)
    {
        super(context, attrs, defStyleAttr);
        data = item;
        init();
    }

    private void init()
    {
        paint.setColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int x = getWidth()/2;
        int y = getHeight()/2;
        int radius = y;

        canvas.drawCircle(x, y, radius, paint);
    }
}
