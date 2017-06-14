package com.example.marcel.foodstuffer.dataholder;

import java.util.Date;

/**
 * Created by Marcel on 14.06.2017.
 */

public class Food
{
    private String name;
    private Date expirationDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
