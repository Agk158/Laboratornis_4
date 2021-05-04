package com.example.laboras_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.GetChars;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner Selector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.Selector = findViewById(R.id.Selector);


        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this, R.array.options, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.Selector.setAdapter(arrayAdapter);
    }

    public void OnBtnClick (View view) {
        EditText InputText = findViewById( R.id.InputText );
        TextView Output = findViewById( R.id.Output );
        String userInputText = InputText.getText().toString();

        String selection = this.Selector.getSelectedItem().toString();
        String resValue = getResources().getString( R.string.char_selection );
        Toast.makeText(this, String.valueOf( resValue), Toast.LENGTH_SHORT).show();


        if (selection.equalsIgnoreCase(resValue)) {
            int count = userInputText.length();
            Output.setText( String.valueOf(count));
        }

    }
}