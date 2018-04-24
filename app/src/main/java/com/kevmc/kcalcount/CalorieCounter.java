package com.kevmc.kcalcount;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CalorieCounter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_counter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button foodConsumed = (Button) findViewById(R.id.foodConsumedBtn);
        Button activityUndertaken = (Button) findViewById(R.id.activityUndertakenBtn);
        Button dayBreakdown = (Button) findViewById(R.id.dayBreakdownBtn);

        foodConsumed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent goConsumedFood = new Intent(CalorieCounter.this, ConsumedFood.class);
                startActivity(goConsumedFood);
            }
        });

        activityUndertaken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent goUndertakenActivity = new Intent(CalorieCounter.this, UndertakenActivity.class);
                startActivity(goUndertakenActivity);
            }
        });

        dayBreakdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent goDayBreakdown = new Intent(CalorieCounter.this, DayBreakdown.class);
                startActivity(goDayBreakdown);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public  boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        if(id == R.id.home){

            Intent home = new Intent(CalorieCounter.this, HomePage.class);
            startActivity(home);

        }else if(id == R.id.calorie_counter){

            Intent calorie_counter = new Intent(CalorieCounter.this, CalorieCounter.class);
            startActivity(calorie_counter);

        }else if(id == R.id.food){

            Intent food_section = new Intent(CalorieCounter.this, FoodMain.class);
            startActivity(food_section);

        }else if(id == R.id.activities){

            Intent activity_section = new Intent(CalorieCounter.this, ActivitiesMain.class);
            startActivity(activity_section);

        }else if(id == R.id.resources){

            Intent resource_section = new Intent(CalorieCounter.this, ResourcesMain.class);
            startActivity(resource_section);

        }else if(id == R.id.exit){
            finish();
        }

        return super.onOptionsItemSelected(item);

    }

}
