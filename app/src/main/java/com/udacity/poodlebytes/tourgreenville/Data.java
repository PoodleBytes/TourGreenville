package com.udacity.poodlebytes.tourgreenville;

import java.util.ArrayList;

/**
 * thanks to TheBailyBrew for App.getContext().getResources() to resolve getString
 *      (App.java + add android:name=".App" in manifest
 *
 * Three methods return appropriate records for corresponding venues - activities, lodging and dining
 *
 */
public class Data extends ArrayList {
    private ArrayList<DataSchema> Stay = new ArrayList<>();     //venue 1-3
    private ArrayList<DataSchema> ToDo = new ArrayList<>();   //venue 4-6
    private ArrayList<DataSchema> Eat = new ArrayList<>();  //venue 7-14

    public ArrayList<DataSchema> getStay() {
        Stay.add(new DataSchema(
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_1_name),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_1_category),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_1_text),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_1_address),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_1_phone),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_1_mapurl),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_1_web),
                R.drawable.venue_1));

        Stay.add(new DataSchema(
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_2_name),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_2_category),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_2_text),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_2_address),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_2_phone),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_2_mapurl),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_2_web),
                R.drawable.venue_2));

        Stay.add(new DataSchema(
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_3_name),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_3_category),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_3_text),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_3_address),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_3_phone),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_3_mapurl),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_3_web),
                R.drawable.venue_3));


        return Stay;
    }//end Stay

    public ArrayList<DataSchema> getEat() {
        Eat.add(new DataSchema(
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_4_name),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_4_category),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_4_text),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_4_address),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_4_phone),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_4_mapurl),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_4_web),
                R.drawable.venue_4));

        Stay.add(new DataSchema(
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_5_name),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_5_category),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_5_text),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_5_address),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_5_phone),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_5_mapurl),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_5_web),
                R.drawable.venue_5));

        Stay.add(new DataSchema(
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_6_name),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_6_category),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_6_text),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_6_address),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_6_phone),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_6_mapurl),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_6_web),
                R.drawable.venue_6));

        return Eat;
    }//end Stay

    public ArrayList<DataSchema> getToDo() {
        ToDo.add(new DataSchema(
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_7_name),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_7_category),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_7_text),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_7_address),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_7_phone),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_7_mapurl),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_7_web),
                R.drawable.venue_7));

        ToDo.add(new DataSchema(
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_8_name),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_8_category),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_8_text),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_8_address),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_8_phone),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_8_mapurl),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_8_web),
                R.drawable.venue_8));

        ToDo.add(new DataSchema(
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_9_name),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_9_category),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_9_text),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_9_address),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_9_phone),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_9_mapurl),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_9_web),
                R.drawable.venue_9));

        ToDo.add(new DataSchema(
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_11_name),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_11_category),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_11_text),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_11_address),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_11_phone),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_11_mapurl),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_11_web),
                R.drawable.venue_11));

        ToDo.add(new DataSchema(
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_12_name),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_12_category),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_12_text),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_12_address),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_12_phone),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_12_mapurl),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_12_web),
                R.drawable.venue_12));

        ToDo.add(new DataSchema(
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_13_name),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_13_category),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_13_text),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_13_address),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_13_phone),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_13_mapurl),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_13_web),
                R.drawable.venue_13));

        ToDo.add(new DataSchema(
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_14_name),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_14_category),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_14_text),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_14_address),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_14_phone),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_14_mapurl),
                com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.venue_14_web),
                R.drawable.venue_14));

        return ToDo;
    }//end ToDo
}//end Data class
