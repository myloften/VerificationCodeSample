package com.loften.verificationcodesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.loften.verificationcodesample.VerificationCode.ValidationCode;

public class MainActivity extends AppCompatActivity {

    ValidationCode validationCode;
    EditText input;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        validationCode = (ValidationCode)findViewById(R.id.validationCode);
        input = (EditText)findViewById(R.id.input);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,validationCode
                        .isEquals(input.getText().toString())==true?"success":"error",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}
