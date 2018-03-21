package com.uom.misco.ofd2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class user extends Activity {

    ImageButton b3;
    RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);


        r1 = (RadioButton) findViewById(R.id.radioButton);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        b3 = (ImageButton) findViewById(R.id.imageButton7);

   /*     b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Redirecting...",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent("com.uom.misco.ofd2.order");
                startActivity(intent);


            }




        });

    }


}
*/



b3.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        if (r1.isChecked() ) {
            //Intent Intents= new Intent(India.this, sands.class); // <----- START "BEACHES" ACTIVITY
            // startActivity(Intents);
            //setContentView(R.layout.activity_sands);

            Intent intent = new Intent("com.uom.misco.ofd2.order");
            startActivity(intent);
        }
        else if( r2.isChecked()){
            //Intent intent = new Intent("com.uom.misco.ofd2.last");
            //startActivity(intent);
            startActivity(new Intent(user.this, last.class));

            }


        else   {
        Toast.makeText(getApplicationContext(), "Please select one",Toast.LENGTH_LONG).show();
        }
        }
        });

        }
        }