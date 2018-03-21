package com.uom.misco.ofd2;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivityxxxx extends Activity  {
    Button b1;
    EditText ed1,ed2;
    EditText ed3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityxxxx);

        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editText4);
        ed2 = (EditText)findViewById(R.id.editText5);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("tharuja") &&
                        ed2.getText().toString().equals("123456")) {
                    Toast.makeText(getApplicationContext(),
                            "Connecting...",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent("com.uom.misco.ofd2.user");
                    startActivity(intent);
                } else

                {


                    Toast.makeText(getApplicationContext(), "Wrong username and password"
                            ,Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
