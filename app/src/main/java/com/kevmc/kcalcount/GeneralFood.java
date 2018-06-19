package com.kevmc.kcalcount;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class GeneralFood extends AppCompatActivity {

    EditText food_to_find;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_food2);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);

        food_to_find = (EditText)findViewById(R.id.et_food_to_search);


    }

    public void findFood(View view){

        String str_food_to_find = food_to_find.getText().toString();

        String type = "findFood";

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);

        backgroundWorker.execute(type, str_food_to_find);

        //Intent display_food = new Intent(GeneralFood.this, DisplayFood.class);
        //startActivity(display_food);

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

            Intent home = new Intent(GeneralFood.this, HomePage.class);
            startActivity(home);

        }else if(id == R.id.calorie_counter){

            Intent calorie_counter = new Intent(GeneralFood.this, CalorieCounter.class);
            startActivity(calorie_counter);

        }else if(id == R.id.food){

            Intent food_section = new Intent(GeneralFood.this, FoodMain.class);
            startActivity(food_section);

        }else if(id == R.id.activities){

            Intent activity_section = new Intent(GeneralFood.this, ActivitiesMain.class);
            startActivity(activity_section);

        }else if(id == R.id.resources){

            Intent resource_section = new Intent(GeneralFood.this, ResourcesMain.class);
            startActivity(resource_section);

        }else if(id == R.id.exit){
            finish();
        }

        return super.onOptionsItemSelected(item);

    }

}
