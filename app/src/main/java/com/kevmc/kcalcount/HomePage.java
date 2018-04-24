package com.kevmc.kcalcount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button counterBtn = (Button) findViewById(R.id.calorie_couter_button);
        Button foodBtn = (Button) findViewById(R.id.food_button);
        Button activityBtn = (Button) findViewById(R.id.activities_button);
        Button resourceBtn = (Button) findViewById(R.id.resources_button);

        Button loginBtn = (Button) findViewById(R.id.login_button);
        Button menuBtn = (Button) findViewById(R.id.menu_button);

       counterBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent calorie_counter = new Intent(HomePage.this, CalorieCounter.class);
               startActivity(calorie_counter);
           }
       });

       foodBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent food_section = new Intent(HomePage.this, FoodMain.class);
               startActivity(food_section);
           }
       });

       activityBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent activity_section = new Intent(HomePage.this, ActivitiesMain.class);
               startActivity(activity_section);
           }
       });

       resourceBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent resource_section = new Intent(HomePage.this, ResourcesMain.class);
               startActivity(resource_section);
           }
       });

       loginBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent login_page = new Intent(HomePage.this, LoginActivity.class);
               startActivity(login_page);
           }
       });

       menuBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent menu_page = new Intent(HomePage.this, NavigationActivity.class);
               startActivity(menu_page);
           }
       });


    }//ON CREATE METHOD

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }//ON CREATE OPTION METHOD

    @Override
    public  boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        if(id == R.id.home){

            Intent home = new Intent(HomePage.this, HomePage.class);
            startActivity(home);

        }else if(id == R.id.calorie_counter){

            Intent calorie_counter = new Intent(HomePage.this, CalorieCounter.class);
            startActivity(calorie_counter);

        }else if(id == R.id.food){

            Intent food_section = new Intent(HomePage.this, FoodMain.class);
            startActivity(food_section);

        }else if(id == R.id.activities){

            Intent activity_section = new Intent(HomePage.this, ActivitiesMain.class);
            startActivity(activity_section);

        }else if(id == R.id.resources){

            Intent resource_section = new Intent(HomePage.this, ResourcesMain.class);
            startActivity(resource_section);

        }else if(id == R.id.exit){
            finish();
        }

        return super.onOptionsItemSelected(item);

    }// ON OPTIONS ITEM SELECTED
}
