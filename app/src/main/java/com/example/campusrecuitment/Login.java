package com.example.campusrecuitment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AlertDialog;

public class Login extends AppCompatActivity {

    // Hardcoded username and password
    private static final String CORRECT_USERNAME = "student";
    private static final String CORRECT_PASSWORD = "student";

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private TextView signupTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        signupTextView = findViewById(R.id.signupText);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUser();
            }
        });

        signupTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle sign up action
                // You can navigate to a sign-up activity or fragment here
                Toast.makeText(Login.this, "Sign Up clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loginUser() {
        String enteredUsername = usernameEditText.getText().toString();
        String enteredPassword = passwordEditText.getText().toString();

        if (enteredUsername.equals(CORRECT_USERNAME) && enteredPassword.equals(CORRECT_PASSWORD)) {
            // Successful login
            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();

            // Navigate to the home screen
            Intent intent = new Intent(Login.this, HomeActivity.class);
            startActivity(intent);
            finish(); // Optional: finish the current activity
        } else {
            // Incorrect username or password
            showWrongPasswordDialog();
        }
    }

    private void showWrongPasswordDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Incorrect Password");
        builder.setMessage("The entered Username/Password is incorrect. Please try again.");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Do nothing here as the dialog will be automatically dismissed
            }
        });

        builder.show();
    }
}
