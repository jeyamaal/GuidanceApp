package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Jeyamaal on 09-Mar-16.
 */
public class Field extends Activity {

    private RadioGroup radiofield;
    private RadioButton subField;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intersting_field);

        radiofield = (RadioGroup) findViewById(R.id.radioSelectField);



        addListenerOnButton();




    }



    public void addListenerOnButton() {


        radiofield.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                int selectedId = radiofield.getCheckedRadioButtonId();

                subField = (RadioButton) findViewById(selectedId);

               // yearSelected = subField.getText().toString();

                Toast.makeText(getApplicationContext(), subField.getText(), Toast.LENGTH_LONG).show();

            }

        });

    }

    public void onFieldDescription (View v){




        Intent intent= new Intent(Field.this,JobDescription.class);
        startActivity(intent);
        overridePendingTransition(R.animator.pull_in_right, R.animator.push_out_left);


    }

    public void onRepeatNav(View view){

        Intent intent= new Intent(Field.this,Repeat.class);
        startActivity(intent);
        overridePendingTransition(R.animator.pull_in_right, R.animator.push_out_left);
        
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.animator.pull_in_right, R.animator.push_out_left);
    }


}

