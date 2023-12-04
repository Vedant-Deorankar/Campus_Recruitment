package com.example.campusrecuitment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SkillTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_test);

        Button btnMathStats = findViewById(R.id.btnMathStats);
        Button btnLogicalReasoning = findViewById(R.id.btnLogicalReasoning);
        Button btnEnglishComprehension = findViewById(R.id.btnEnglishComprehension);
        Button btnComputerConcepts = findViewById(R.id.btnComputerConcepts);

        btnMathStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your logic for Mathematics & Statistics button click
            }
        });

        btnLogicalReasoning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your logic for Logical/Abstract Reasoning button click
            }
        });

        btnEnglishComprehension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your logic for English Comprehension and Verbal Ability button click
            }
        });

        btnComputerConcepts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your logic for Computer Concepts button click
            }
        });
    }
}