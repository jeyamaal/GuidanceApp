package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Jeyamaal on 09-Mar-16.
 */
public class InterestingField extends Activity {

    private RadioGroup radiofield;
    private RadioButton subField;

       String yearSelected,cgpa,repeat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intersting_field);

        radiofield = (RadioGroup) findViewById(R.id.radioSelectField);





        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            yearSelected = extras.getString("year");
            cgpa=extras.getString("cgpa");
            repeat=extras.getString("repeat");

//get the value based on the key
        }

        else{

            System.out.println("Hii");
        }







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




        Intent intent= new Intent(InterestingField.this,JobDescription.class);
        startActivity(intent);
        overridePendingTransition(R.animator.pull_in_right, R.animator.push_out_left);


    }

    public void onFinalSubmit(View view){

      //  Intent intent= new Intent(InterestingField.this,CoursePage.class);

        Intent intent= new Intent(InterestingField.this,FinalResult.class);
        intent.putExtra("year",yearSelected);
        intent.putExtra("cgpa",cgpa);
        intent.putExtra("repeat",repeat);
        intent.putExtra("interest",subField.getText().toString());
        startActivity(intent);
        overridePendingTransition(R.animator.pull_in_right, R.animator.push_out_left);
        
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.animator.pull_in_right, R.animator.push_out_left);
    }


}

