package com.kevmc.kcalcount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        Button useAppNoLoginBtn = (Button)findViewById(R.id.useAppNoLoginBtn);

        Button newUserRegisterBtn = (Button)findViewById(R.id.newUserRegisterBtn);

        useAppNoLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                HomePage.skipLogin = true;

                Intent home_page = new Intent(UserLogin.this, HomePage.class);
                startActivity(home_page);
            }
        });

        newUserRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent new_user_register_page = new Intent(UserLogin.this, UserRegister.class);
                startActivity(new_user_register_page);
            }
        });
    }
}
