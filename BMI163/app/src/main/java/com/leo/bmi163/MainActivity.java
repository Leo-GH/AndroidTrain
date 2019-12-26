package com.leo.bmi163;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText weight;
    EditText height;
    Button submit;
    TextView bmi;
    RadioGroup sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        submit.setOnClickListener(this);
    }

    private void initView() {
        sex = findViewById(R.id.radio_group);
        weight = findViewById(R.id.et_weight);
        height = findViewById(R.id.et_height);
        submit = findViewById(R.id.submit);
        bmi = findViewById(R.id.bmi_text);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.submit:
                weight.getText();
                height.getText();
                sex.getAutofillValue();
                bmi.setText("");
                break;
            default:
        }

    }
}
