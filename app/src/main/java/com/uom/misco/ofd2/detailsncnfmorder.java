package com.uom.misco.ofd2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class detailsncnfmorder extends AppCompatActivity {


    Button b1;
    EditText ed1, ed2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailsncnfmorder);

        b1 = (Button) findViewById(R.id.button2);
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText9);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("2") &&
                        ed2.getText().toString().equals("123456")) {
                    Toast.makeText(getApplicationContext(),
                            "Successfully Ordered..", Toast.LENGTH_SHORT).show();




                } else

                {

                    Toast.makeText(getApplicationContext(), "Please fill all"
                            , Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
