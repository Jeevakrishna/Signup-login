package com.example.signuploginrealtime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EditProfileActivity extends AppCompatActivity {

    EditText editName, editEmail, editUsername, editPassword;
    Button saveButton;
    String nameUser, emailUser, usernameUser, passwordUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        // Initializing EditText and Button
        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        editUsername = findViewById(R.id.editUsername);
        editPassword = findViewById(R.id.editPassword);
        saveButton = findViewById(R.id.saveButton);

        // Retrieve data and populate EditText fields
        showData();

        // Save button click listener
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Check if any data has been changed
                if (isNameChanged() || isEmailChanged() || isPasswordChanged()) {
                    Toast.makeText(EditProfileActivity.this, "Saved", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(EditProfileActivity.this, "No Changes Found", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Method to check if name is changed
    public boolean isNameChanged(){
        if (!nameUser.equals(editName.getText().toString())){
            nameUser = editName.getText().toString();
            return true;
        } else{
            return false;
        }
    }

    // Method to check if email is changed
    public boolean isEmailChanged(){
        if (!emailUser.equals(editName.getText().toString())){
            emailUser = editEmail.getText().toString();
            return true;
        } else{
            return false;
        }
    }

    // Method to check if password is changed
    public boolean isPasswordChanged(){
        if (!passwordUser.equals(editPassword.getText().toString())){
            passwordUser = editPassword.getText().toString();
            return true;
        } else{
            return false;
        }
    }

    // Method to retrieve data from intent and populate EditText fields
    public void showData(){
        Intent intent = getIntent();

        // Get data from intent extras
        nameUser = intent.getStringExtra("name");
        emailUser = intent.getStringExtra("email");
        usernameUser = intent.getStringExtra("username");
        passwordUser = intent.getStringExtra("password");

        // Populate EditText fields with retrieved data
        editName.setText(nameUser);
        editEmail.setText(emailUser);
        editUsername.setText(usernameUser);
        editPassword.setText(passwordUser);
    }
}
