package com.uom.misco.ofd2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class last extends Activity {

    ImageButton b3;
    RadioButton r1, r2, r3, r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        r1 = (RadioButton) findViewById(R.id.radioButton);
        r2 = (RadioButton) findViewById(R.id.radioButton3);
        r3 = (RadioButton) findViewById(R.id.radioButton4);
        r4 = (RadioButton) findViewById(R.id.radioButton2);
        b3 = (ImageButton) findViewById(R.id.imageButton7);


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r1.isChecked() || r2.isChecked() || r3.isChecked() || r4.isChecked()) {

                    startActivity(new Intent(last.this, detailsncnfmorder.class));

                } else {
                    Toast.makeText(getApplicationContext(), "Please select one", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}






