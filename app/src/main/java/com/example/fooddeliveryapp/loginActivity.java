package com.example.fooddeliveryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class loginActivity extends AppCompatActivity {

    // Declare the Buttons as member variables
    private Button loginbutton;
    private Button donthaveaccountbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Enable edge-to-edge display
        EdgeToEdge.enable(this);

        // Set the content view to activity_start layout
        setContentView(R.layout.activity_login);

        // Initialize the buttons
        loginbutton = findViewById(R.id.loginbutton);
        donthaveaccountbutton = findViewById(R.id.donthaveaccountbutton);

        // Set the padding for edge-to-edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Set OnClickListener for loginButton
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create intent to navigate to LoginActivity
                Intent intent = new Intent(loginActivity.this, SignActivity.class);
                 startActivity(intent);
            }
        });

        // Set OnClickListener for signupButton
        donthaveaccountbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create intent to navigate to SignupActivity
                Intent intent = new Intent(loginActivity.this, SignActivity.class);
                startActivity(intent);
            }
        });
    }
}
