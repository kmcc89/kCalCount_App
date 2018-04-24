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

public class FoodMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button genereal_food = (Button) findViewById(R.id.general_food_btn);
        Button my_food = (Button) findViewById(R.id.my_food_btn);

        genereal_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent general_food = new Intent(FoodMain.this, GeneralFood.class);
                startActivity(general_food);
            }
        });

        my_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent my_food = new Intent(FoodMain.this, MyFood.class);
                startActivity(my_food);
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

            Intent home = new Intent(FoodMain.this, HomePage.class);
            startActivity(home);

        }else if(id == R.id.calorie_counter){

            Intent calorie_counter = new Intent(FoodMain.this, CalorieCounter.class);
            startActivity(calorie_counter);

        }else if(id == R.id.food){

            Intent food_section = new Intent(FoodMain.this, FoodMain.class);
            startActivity(food_section);

        }else if(id == R.id.activities){

            Intent activity_section = new Intent(FoodMain.this, ActivitiesMain.class);
            startActivity(activity_section);

        }else if(id == R.id.resources){

            Intent resource_section = new Intent(FoodMain.this, ResourcesMain.class);
            startActivity(resource_section);

        }else if(id == R.id.exit){
            finish();
        }

        return super.onOptionsItemSelected(item);

    }

}
