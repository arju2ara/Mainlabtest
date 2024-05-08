package com.example.labtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Sedan sedan;
    private Motorcycle motorcycle;
    private SUV suv;

    private TextView textViewSedanInfo;
    private TextView textViewMotorcycleInfo;
    private TextView textViewSUVInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sedan = new Sedan();
        motorcycle = new Motorcycle();
        suv = new SUV();


        textViewSedanInfo = findViewById(R.id.textViewSedanInfo);
        textViewMotorcycleInfo = findViewById(R.id.textViewMotorcycleInfo);
        textViewSUVInfo = findViewById(R.id.textViewSUVInfo);


        Button buttonDriveSedan = findViewById(R.id.buttonDriveSedan);
        Button buttonRefuelSedan = findViewById(R.id.buttonRefuelSedan);
        Button buttonDriveMotorcycle = findViewById(R.id.buttonDriveMotorcycle);
        Button buttonRefuelMotorcycle = findViewById(R.id.buttonRefuelMotorcycle);
        Button buttonDriveSUV = findViewById(R.id.buttonDriveSUV);
        Button buttonRefuelSUV = findViewById(R.id.buttonRefuelSUV);


        buttonDriveSedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sedan.drive();
                updateVehicleInfo();
            }
        });
        buttonRefuelSedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sedan.petrol(5);
                updateVehicleInfo();
            }
        });


        buttonDriveMotorcycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                motorcycle.drive();
                updateVehicleInfo();
            }
        });
        buttonRefuelMotorcycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                motorcycle.petrol(2);
                updateVehicleInfo();
            }
        });


        buttonDriveSUV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suv.drive();
                updateVehicleInfo();
            }
        });
        buttonRefuelSUV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suv.petrol(10);
                updateVehicleInfo();
            }
        });
    }

    private void updateVehicleInfo() {
        textViewSedanInfo.setText(String.format("Sedan: Fuel = %.1f, Mileage = %.1f", sedan.getFuel(), sedan.getMileage()));
        textViewMotorcycleInfo.setText(String.format("Motorcycle: Fuel = %.1f, Mileage = %.1f", motorcycle.getFuel(), motorcycle.getMileage()));
        textViewSUVInfo.setText(String.format("SUV: Fuel = %.1f, Mileage = %.1f", suv.getFuel(), suv.getMileage()));
    }
}
