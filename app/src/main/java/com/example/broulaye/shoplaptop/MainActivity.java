package com.example.broulaye.shoplaptop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Spinner brands;
    RadioButton i3;
    RadioButton i5;
    RadioButton i7;
    RadioGroup rGroup;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        brands = (Spinner) findViewById(R.id.brands);
        i3 = (RadioButton) findViewById(R.id.ri3);
        i5 = (RadioButton) findViewById(R.id.ri5);
        i7 = (RadioButton) findViewById(R.id.ri7);
        rGroup = (RadioGroup) findViewById(R.id.radio_id);
        brands.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                onClick(view);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
//        brands.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//        });
        i3.setOnClickListener(this);
        i5.setOnClickListener(this);
        i7.setOnClickListener(this);
        //brands.setOnClickListener(this);
    }


    public void onClick(View v) {
        if (v.getId() == i3.getId()) {
            if (brands.getSelectedItem().toString().equals("HP"))
                showToast("300");
            else
                showToast("330");
        }
        else if (v.getId() == i5.getId()) {
            if (brands.getSelectedItem().toString().equals("HP"))
                showToast("500");
            else
                showToast("550");
        }
        else if (v.getId() == i7.getId()) {
            if (brands.getSelectedItem().toString().equals("HP"))
                showToast("700");
            else
                showToast("770");
        }
        else if (v.getId() == brands.getId()) {
            if (brands.getSelectedItem().toString().equals("Lenovo")) {
                if (rGroup.getCheckedRadioButtonId() == i3.getId())
                    showToast("300");
                else if (rGroup.getCheckedRadioButtonId() == i5.getId())
                    showToast("500");
                else if (rGroup.getCheckedRadioButtonId() == i7.getId())
                    showToast("700");
            }
            else {
                if (rGroup.getCheckedRadioButtonId() == i3.getId())
                    showToast("330");
                else if (rGroup.getCheckedRadioButtonId() == i5.getId())
                    showToast("550");
                else if (rGroup.getCheckedRadioButtonId() == i7.getId())
                    showToast("770");
            }
        }
    }

    private void showToast(String msg) {
        toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.show();
    }
}
