package com.rhesty.layouting;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    Button btnLinear, btnRelative, btnFrame, btnConstraint, btnScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnLinear = findViewById(R.id.btn_linear);
        btnRelative = findViewById(R.id.btn_relative);
        btnFrame = findViewById(R.id.btn_frame);
        btnConstraint = findViewById(R.id.btn_constraint);
        btnScroll = findViewById(R.id.btn_scroll);

        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MenuActivity.this, "Ini Toast", Toast.LENGTH_SHORT).show();
                Intent pindah = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(pindah);
            }
        });

        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder pesan = new AlertDialog.Builder(MenuActivity.this);
                pesan.setTitle("Alert Dialog");
                pesan.setMessage("Ini Alert Dialog");
                pesan.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MenuActivity.this, "Anda memilih OK", Toast.LENGTH_SHORT).show();
                        Intent pindah = new Intent(MenuActivity.this, RelativeActivity.class);
                        startActivity(pindah);
                    }
                });
                pesan.setNegativeButton("No", null);
                pesan.show();
            }
        });

        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MenuActivity.this, "Ini Toast", Toast.LENGTH_SHORT).show();
                Intent pindah = new Intent(MenuActivity.this, FrameActivity.class);
                startActivity(pindah);
            }
        });

        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MenuActivity.this, "Ini Toast", Toast.LENGTH_SHORT).show();
                Intent pindah = new Intent(MenuActivity.this, ConstraintActivity.class);
                startActivity(pindah);
            }
        });

        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MenuActivity.this, "Ini Toast", Toast.LENGTH_SHORT).show();
                Intent pindah = new Intent(MenuActivity.this, ScrollActivity.class);
                startActivity(pindah);
            }
        });
    }
}
