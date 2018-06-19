package com.kevmc.kcalcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayFood extends AppCompatActivity {

    TextView tv_id, tv_name, tv_type, tv_calories;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_food);

        String str_food_id = "Hello";
        tv_id = (TextView)findViewById(R.id.tv_food_id);
        tv_id.setText(str_food_id);

    }

    protected void displaySelectedFood(String food){

        String[] params = food.split(" ");

        String str_food_id = "Hello";
        String str_food_name = params[1];
        String str_food_type = params[2];
        String str_food_calories = params[3];

        tv_id = (TextView)findViewById(R.id.tv_food_id);
        tv_name = (TextView)findViewById(R.id.tv_food_name);
        tv_type = (TextView)findViewById(R.id.tv_food_type);
        tv_calories = (TextView)findViewById(R.id.tv_food_calories);

        tv_id.setText(str_food_id);
        tv_name.setText(str_food_name);
        tv_type.setText(str_food_type);
        tv_calories.setText(str_food_calories);

    }
}
