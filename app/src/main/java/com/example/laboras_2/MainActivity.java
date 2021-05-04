package com.example.laboras_2;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Output;
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

    Spinner selector;
    EditText inputText;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        this.selector = findViewById( R.id.selector );
        this.inputText = findViewById( R.id.inputText );
        this.result = findViewById( R.id.output );

        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource( this, R.array.options, android.R.layout.simple_spinner_item );
        arrayAdapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        this.selector.setAdapter( arrayAdapter );
    }

    public void OnBtnClick(View Result) {

        String userInputText = inputText.getText().toString();
        String selection = this.selector.getSelectedItem().toString();
        String charSelectionOption = getResources().getString( R.string.char_selection );
        String wordSelectionOption = getResources().getString( R.string.word_selection );

        if (selection.equalsIgnoreCase( charSelectionOption )) {
            int count = elementsCalculator.getCharsCount( userInputText );
            result.setText( String.valueOf( count ) );
        }
        if (selection.equalsIgnoreCase( getResources().getString( R.string.number_selection ) )) {
            result.setText( String.valueOf( elementsCalculator.getNumbersCount( userInputText ) ) );
        }
        if (selection.equalsIgnoreCase( wordSelectionOption )) {
            int count = elementsCalculator.getWordsCount( userInputText );
            result.setText( String.valueOf( count ) );
        }
    }
}