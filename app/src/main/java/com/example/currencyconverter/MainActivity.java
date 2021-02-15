package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickConvert(View view) {

        Log.i("Info", "Button pressed");

        EditText nameEditText = (EditText) findViewById(R.id.editText);

        String amountInPounds = nameEditText.getText().toString();

        double amountInPoundsDouble = Double.parseDouble(amountInPounds);
        double amountInDollarsDouble = amountInPoundsDouble * 1.3;

        String amountInDollarsString = String.format("%.2f", amountInDollarsDouble);

        Toast.makeText(this, "£" + amountInPounds + " is $" + amountInDollarsString, Toast.LENGTH_LONG).show();

        Log.i("Amount in dollars", amountInDollarsString);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
