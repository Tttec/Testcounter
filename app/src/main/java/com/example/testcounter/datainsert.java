package com.example.testcounter;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;

public class datainsert extends AppCompatActivity {
    EditText et_name,et_carb,et_protein,et_fat,et_cal;
    Button add;
    DatabaseReference reff;
    Meal meal;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name=findViewById(R.id.et_name);
        et_cal=findViewById(R.id.et_cal);
        et_carb=findViewById(R.id.et_carb);
        et_fat=findViewById(R.id.et_fat);
        et_protein=findViewById(R.id.et_protein);
        Button add=findViewById(R.id.bt_add);
        meal=new Meal();
        reff= FirebaseDatabase.getInstance().getReference().child("Meal");
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int protein=Integer.parseInt(et_protein.getText().toString().trim());
                int carb=Integer.parseInt(et_carb.getText().toString().trim());
                int fat=Integer.parseInt(et_fat.getText().toString().trim());
                int cal=Integer.parseInt(et_cal.getText().toString().trim());
                String name=et_name.getText().toString();

                meal.setName(name);
                meal.setCal(cal);
                meal.setCarb(carb);
                meal.setFat(fat);
                meal.setProtein(protein);
                reff.push().setValue(meal);
                Toast.makeText(datainsert.this,"Meal Added",Toast.LENGTH_LONG).show();

            }
        });
    }

}
